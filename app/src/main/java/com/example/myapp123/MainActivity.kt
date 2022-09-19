package com.example.myapp123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main(args: Array<String>) {
    println ("Объем параллелепипеда равен: ")
    var x: Byte = 10
    var y: Byte = 25
    var z: Byte = 15

    var V = x * y * z


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("$x * $y * $z is  $V")
    }
}