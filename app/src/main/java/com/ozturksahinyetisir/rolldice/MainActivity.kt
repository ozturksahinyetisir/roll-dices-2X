package com.ozturksahinyetisir.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*



class MainActivity : AppCompatActivity() {
    // variables
    private lateinit var button: Button
    private lateinit var imageView:ImageView
    private lateinit var imageView2:ImageView
    private lateinit var TextView1:TextView
    private lateinit var TextView2:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonroll)
        imageView = findViewById(R.id.imageView)
        imageView2 = findViewById(R.id.imageView2)
        TextView1 = findViewById(R.id.textView1)
        TextView2 = findViewById(R.id.textView2)


        button.setOnClickListener{
            // when button clicked calling these functions.
            rollDices()
            rollDices2()
            Toast.makeText(this, "Zar atılıyor.", Toast.LENGTH_SHORT).show()
        }
    }
         // function 1
    private fun rollDices(){
             // rolls 1 to 6 random number.
        val animation: Animation = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val randomInt = Random().nextInt(6)+1
        TextView1.text = "  ${randomInt}  ve"
        val drawableResource = when(randomInt){
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            else -> R.drawable.ic_dice6

        }
        imageView.startAnimation(animation)
        imageView.setImageResource(drawableResource)

    }
        // function 2
    private fun rollDices2(){
            // rolls 1 to 6 random number for 2nd dice.

        val animation: Animation = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val randomInt = Random().nextInt(6)+1
        TextView2.text = "${randomInt} atıldı.  "
        val drawableResource = when(randomInt){
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            else -> R.drawable.ic_dice6
        }
        imageView2.startAnimation(animation)
        imageView2.setImageResource(drawableResource)
    }
}