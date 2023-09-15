package com.example.class_activity_checkbox

import android.graphics.Typeface.CustomFallbackBuilder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity(){

    lateinit var checkStudent:CheckBox
    lateinit var checkFaculty:CheckBox
    lateinit var textResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkStudent = findViewById(R.id.checkboxStudent)
        checkFaculty = findViewById(R.id.checkboxFaculty)
        textResult = findViewById(R.id.resultText)
        textResult.setText("What is your role?")


        checkStudent.setOnClickListener {
           if (checkStudent.isChecked) {
               textResult.setText("You checked in as a student")
   //            checkFaculty.isChecked = false
           }
       }

        checkFaculty.setOnClickListener {
            if (checkFaculty.isChecked) {
                textResult.setText("You checked in as a faculty")
    //            checkStudent.isChecked =false
            }
        }


    }


}