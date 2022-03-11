package com.example.ch04_calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    lateinit  var edit1 : EditText;
    lateinit  var edit2 : EditText;

    lateinit  var btnAdd : Button;
    lateinit  var btnSub : Button;
    lateinit  var btnMul : Button;
    lateinit  var btnDiv : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        title = "초간단 계산기"

    }
}