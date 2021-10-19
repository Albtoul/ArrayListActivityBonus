package com.example.arraylistactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var ed1:EditText
    lateinit var ed2:EditText
    lateinit var tv:TextView
    lateinit var bt1:Button
    lateinit var bt2:Button
    var arr=ArrayList<String>()
    var  index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed1=findViewById(R.id.editTextTextPersonName)
        ed2=findViewById(R.id.editTextTextPersonName2)
        tv=findViewById(R.id.tv)
        bt1=findViewById(R.id.button)
        bt2=findViewById(R.id.button2)

        bt1.setOnClickListener {
          arr.add(ed1.text.toString())
            ed1.clearFocus()
            index++
          Toast.makeText(applicationContext,"saved name ",Toast.LENGTH_SHORT).show()

        }
        bt2.setOnClickListener {
            index=ed2.text.toString().toInt()
            index--
            if(index<arr.size){
                tv.text="${arr.get(index)}"

            }else{
                Toast.makeText(applicationContext,"!! invalid ",Toast.LENGTH_SHORT).show()

            }
        }
    }
}