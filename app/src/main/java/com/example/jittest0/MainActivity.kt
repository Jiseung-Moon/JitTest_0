package com.example.jittest0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    fun sum_calc(a: Int, b: Int): Int {
        var sum = a + b
        var rt = sum.toInt()

        val test = 1

        return rt
    }
}