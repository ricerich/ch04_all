package com.example.ch04_animal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.kotlin객체 만들면서, 2.바인딩
//        var chk1 = findViewById<CheckBox>(R.id.ChkAgree)
        var sw1 = findViewById<Switch>(R.id.swAgree)

        var tv2 = findViewById<TextView>(R.id.Text2)

        var rg1 = findViewById<RadioGroup>(R.id.Rgroup1)
        var rdo1 = findViewById<RadioButton>(R.id.RdoDog)
        var rdo2 = findViewById<RadioButton>(R.id.RdoCat)
        var rdo3 = findViewById<RadioButton>(R.id.RdoRabbit)

//        var btn1 = findViewById<Button>(R.id.BtnOK)//버튼 없앰
        var iv1 = findViewById<ImageView>(R.id.ImgPet)

        var btnFinish = findViewById<Button>(R.id.BtnFinish)
        var btnInit = findViewById<Button>(R.id.BtnInit)

        //3-1.이벤트 처리 -> checkBox같은 컴파운드 버튼 계열
//        chk1.setOnCheckedChangeListener { compoundButton, b ->
//
////            if(chk1.isChecked == true)
//            if(chk1.isChecked)
//            {
//                tv2.visibility = View.VISIBLE
//                rg1.visibility = View.VISIBLE
//                btn1.visibility = View.VISIBLE
//                iv1.visibility = View.VISIBLE
//            }
//            else if(!chk1.isChecked)
//            {
//                tv2.visibility = View.INVISIBLE
//                rg1.visibility = View.INVISIBLE
//                btn1.visibility = View.INVISIBLE
//                iv1.visibility = View.INVISIBLE
//            }
//        }
        sw1.setOnCheckedChangeListener { compoundButton, b ->

//            if(chk1.isChecked == true)
            if(sw1.isChecked)
            {
                tv2.visibility = View.VISIBLE
                rg1.visibility = View.VISIBLE
//                btn1.visibility = View.VISIBLE
                iv1.visibility = View.VISIBLE

                btnFinish.visibility = View.VISIBLE
                btnInit.visibility = View.VISIBLE
            }
            else if(!sw1.isChecked)
            {
                tv2.visibility = View.INVISIBLE
                rg1.visibility = View.INVISIBLE
//                btn1.visibility = View.INVISIBLE
                iv1.visibility = View.INVISIBLE

                btnFinish.visibility = View.INVISIBLE
                btnInit.visibility = View.INVISIBLE
            }
        }

        //3-2.버튼 이벤트처리
//        btn1.setOnClickListener {
//            when(rg1.checkedRadioButtonId)
//            {
//                R.id.RdoDog -> iv1.setImageResource(R.drawable.dog)
//                R.id.RdoCat -> iv1.setImageResource(R.drawable.cat)
//                R.id.RdoRabbit -> iv1.setImageResource(R.drawable.rabbit)
//                else -> Toast.makeText(applicationContext, "동물 선택 요망!", Toast.LENGTH_SHORT).show()
//            }
//        }
        
        //3-3.라디오 버튼(라디오그룹X) 이벤트 처리

        rdo1.setOnClickListener {
            iv1.setImageResource(R.drawable.dog)
        }

        rdo2.setOnClickListener {
            iv1.setImageResource(R.drawable.cat)
        }

        rdo3.setOnClickListener {
            iv1.setImageResource(R.drawable.rabbit)
        }

        //3-4. 종료 버튼 이벤트 처리
        btnFinish.setOnClickListener {
            finish();//액티비티 종료
        }

        //3-5. 초기화 버튼 이벤트 처리
        btnInit.setOnClickListener {

            tv2.visibility = View.INVISIBLE
            rg1.visibility = View.INVISIBLE
            iv1.visibility = View.INVISIBLE

            btnFinish.visibility = View.INVISIBLE
            btnInit.visibility = View.INVISIBLE

//            sw1.setChecked(false)//java 엄격한 스타일
            sw1.isChecked = false //kotlin 새로운 유연한 스타일

            rg1.clearCheck()
            iv1.setImageResource(0)
        }
    }
}