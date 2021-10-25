package com.example.genericsdemo.arrayUtil

class Util<T>(private val array:ArrayList<T>) {

    fun findElement(element : T,callback :(position : Int,element : T?)->Unit){
        for(i in array.indices){
            if(element == array[i]){
                callback(i,array[i])
                return
            }
        }
        callback(-1,null)
    }

}