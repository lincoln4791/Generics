package com.example.genericsdemo.arrayUtil

class ArrayIntUtil(private val array: ArrayList<Int>) {

    fun findElement(element : Int, callBack : (position : Int, element : Int?) -> Unit) {
        for(i in array.indices){
            if(element == array[i]){
                callBack(i,array[i])
                return
            }
        }
        callBack(-1,null)
    }

}