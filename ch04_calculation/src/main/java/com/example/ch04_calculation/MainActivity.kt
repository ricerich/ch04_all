package com.example.ch04_calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    //1.멤버변수


    //2.(멤버)메소드 - onCreate()
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        //1.kotlin객체 만들기
        //2.xml객체를 가져와서, kotlin 객체에 연결(바인딩)
        //3.kotlin객체로 이벤트처리~!

        //지역변수 자리

        // 1. + 2. -> kotlin 객체를 만들면서, 동시에 xml객체를 연결(바인딩)
        var edt1 : EditText = findViewById(R.id.Edit1)
        var edt2 : EditText = findViewById(R.id.Edit2)

        var btn1 : Button = findViewById(R.id.BtnAdd)
        var btn2 : Button = findViewById(R.id.BtnSub)
        var btn3 : Button = findViewById(R.id.BtnMul)
        var btn4 : Button = findViewById(R.id.BtnDiv)

        var btn5 : Button = findViewById(R.id.BtnMod)

        var tv1 : TextView = findViewById(R.id.TextResult)

        //3.kotlin객체에 이벤트 처리

        btn1.setOnTouchListener { view, motionEvent ->

            var val1 = edt1.text;
            var val2 = edt2.text;

            var str1 = val1.toString()
            var str2 = val2.toString()

//            int n1 = Integer.parseInt(str1)

//            if(str1.equals("") || str2.equals(""))
            if(str1.trim() == "" || str2.trim() == "")
            {
                Toast.makeText(applicationContext,"값이 비었습니다!",Toast.LENGTH_SHORT).show()
            }
            else
            {
//                var n1 = str1.toInt()
//                var n2 = str2.toInt()
//
//                var n3 = n1 + n2;
                var n1 = str1.toDouble()
                var n2 = str2.toDouble()

                var n3 = n1 + n2;

                tv1.setText("계산 결과 : "+n3)
            }



            false
        }

        btn2.setOnTouchListener { view, motionEvent ->
            var n1 = edt1.text.toString().toDouble()
            var n2 = edt2.text.toString().toDouble()
            var n3 = n1 - n2

            tv1.setText("계산 결과 : "+n3)

            false
        }

        btn3.setOnTouchListener { view, motionEvent ->
            var n1 = edt1.text.toString().toDouble()
            var n2 = edt2.text.toString().toDouble()
            var n3 = n1 * n2

            tv1.setText("계산 결과 : "+n3)

            false
        }

//        btn4.setOnTouchListener { view, motionEvent ->
//            var n1 = edt1.text.toString().toInt()
//            var n2 = edt2.text.toString().toInt()
//            var n3 = n1 / n2
//
//            tv1.setText("계산 결과 : "+n3)
//
//            false
//        }

        btn4.setOnClickListener {
            var val1 = edt1.text;
            var val2 = edt2.text;

            var str1 = val1.toString()
            var str2 = val2.toString()

//            int n1 = Integer.parseInt(str1)

//            if(str1.equals("") || str2.equals(""))
            if(str1.trim() == "" || str2.trim() == "")
            {
                Toast.makeText(applicationContext,"값이 비었습니다!",Toast.LENGTH_SHORT).show()
            }
            else//str1이 공백이 아니면, 계산하라~!
            {
                if(str2.trim() == "0")
                {
                    Toast.makeText(applicationContext,"0으로 못나눔~!",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    //                var n1 = str1.toInt()
//                var n2 = str2.toInt()
//
//                var n3 = n1 + n2;
                    var n1 = str1.toDouble()
                    var n2 = str2.toDouble()

                    var n3 = n1 / n2;
                    n3=(n3*100).toInt()/100.0

                    tv1.setText("계산 결과 : "+n3)
                }

            }
        }

        btn5.setOnClickListener {
            var n1 = edt1.text.toString().toDouble()
            var n2 = edt2.text.toString().toDouble()
            var n3 = n1 % n2

            tv1.setText("계산 결과 : "+n3)
        }




    }
}