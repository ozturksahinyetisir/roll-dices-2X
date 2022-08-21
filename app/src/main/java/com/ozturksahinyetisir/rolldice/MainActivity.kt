package com.ozturksahinyetisir.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
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
            rollDices()
            rollDices2()
        }
    }
    private fun rollDices(){
        val randomInt = Random().nextInt(6)+1
        TextView1.text = "  ${randomInt}  ve"
        val drawableResource = when(randomInt){
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            6 -> R.drawable.ic_dice6
            else -> {R.drawable.ic_dice1}
        }
        imageView.setImageResource(drawableResource)

    }

    private fun rollDices2(){
        val randomInt = Random().nextInt(6)+1
        TextView2.text = "${randomInt} atıldı.  "
        val drawableResource = when(randomInt){
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            6 -> R.drawable.ic_dice6
            else -> {R.drawable.ic_dice1}
        }

        imageView2.setImageResource(drawableResource)
    }
}