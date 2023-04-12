package com.example.onitama

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.fragment_retry.*


class RetryFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private var temp : (()->Unit)? = null

    fun retry(listener:()-> Unit){
        temp = listener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btRetry = view.findViewById<Button>(R.id.btRetry)
        val btBack = view.findViewById<Button>(R.id.btBack)

        val retryFragment = activity?.findViewById<FrameLayout>(R.id.pauseFragment)

        btRetry.setOnClickListener {
            temp?.invoke()
            retryFragment?.visibility = View.GONE
        }

        btBack.setOnClickListener {
            val intent = Intent(context,MainMenu::class.java)
            startActivity(intent)
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_retry, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RetryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            RetryFragment().apply {
                arguments = Bundle()
            }
    }
}