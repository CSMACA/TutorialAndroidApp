package com.example.tutorialapp

import android.graphics.Paint
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*
import kotlinx.android.synthetic.main.activity_main.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.messageRepeated).apply {
            text = message
        }

        if (bold_switch.isChecked) {
            messageRepeated.setTypeface(textView.getTypeface(), Typeface.BOLD)
        }
        if (italic_switch.isChecked){
            messageRepeated.setTypeface(textView.getTypeface(), Typeface.ITALIC)
        }
        if (underline_switch.isChecked){
            messageRepeated.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG)
        }
    }
}