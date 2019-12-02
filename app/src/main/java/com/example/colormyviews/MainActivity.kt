package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            box1_text, box2_text, box3_text, box4_text, box5_text, constraint_layout, red_button, yellow_button, green_button
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.box1_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box3_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box4_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box5_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> box3_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box4_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box5_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
