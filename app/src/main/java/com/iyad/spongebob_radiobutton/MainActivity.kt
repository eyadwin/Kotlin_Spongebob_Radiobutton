package com.iyad.spongebob_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun radioButtonClick(view: View) {

        if (view == rbSponge) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.spongebob)
        }
        else if (view == rbSandy) {
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.sandy)
        }
        else if (view == rbPatrick) {
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.patrick)
        }
        else if (view == rbSquid) {
            Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.squedword)
        }
    }

}