package com.example.genericsdemo.arrayUtil

class ArrayStringUtil(private val array : ArrayList<String>) {
    fun findElement(element : String,callBack:(position:Int,element:String?)->Unit){
        for(i in array.indices){
            if(element == array[i]){
                callBack(i,array[i])
                return
            }
        }
        callBack(-1,null)
    }
}