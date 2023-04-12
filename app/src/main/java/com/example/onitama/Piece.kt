package com.example.onitama

class Piece(
    var x:Int,
    var y:Int,
    var isKing:Boolean,
){
    fun getPieceInfo():String{
        return "${x},${y} - ${isKing}"
    }
}