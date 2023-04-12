package com.example.onitama

class Card(
    var cardName:String,
    var xMove:IntArray,
    var yMove:IntArray
){
    fun getCardInfo():String{
        var moveset = ""
        for(i in 0..xMove.size-1){
            moveset+= "[${xMove[i]},${yMove[i]}], "
        }
        return "${cardName} -> ${moveset}";
    }
}