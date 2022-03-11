package com.example.ex04_17

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. kotlin 객체 만들기
        //2. kotlin 객체에, xml객체를 꽂는다,연결한다. (=바인딩)
        //3. ktilin 객체로, 변화를 준다! 메소드로~!

        //1. kotlin 객체 만들기
        var tv1 : TextView
        var tv2 : TextView
        var tv3 : TextView

        //2. kotlin 객체에, xml객체를 꽂는다,연결한다. (=바인딩)
        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);

        //3. ktilin 객체로, 변화를 준다! 메소드로~!
        tv1.setText("안녕하신가요???")
        tv1.setTextColor(Color.RED)
        tv2.setTextSize(30f)
        tv2.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC)
        tv3.setText("가나다라마바사아자차카타바하가나다라마바사아자차카타바하가나다라마바사아자차카타바하")
        tv3.setSingleLine()




    }
}