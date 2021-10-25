package com.example.genericsdemo.arrayUtil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.genericsdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val array = arrayListOf<Int>(1,2,3,4,5)
        ArrayIntUtil(array).findElement(4){ position, element ->
            Log.d("tag","Element Position is -> $position")
        }


        val arrayStr = arrayListOf<String>("AA","BB","CC","DD","EE")
        ArrayStringUtil(arrayStr).findElement("BB"){ position, element ->
            Log.d("tag","Element Position is -> $position")
        }

        val arrayStr2 = arrayListOf<String>("AA","BB","CC","DD","EE")
        Util(arrayStr2).findElement("EE"){ position, element ->
            Log.d("tag","Element Position is -> $position")
        }

    }
}