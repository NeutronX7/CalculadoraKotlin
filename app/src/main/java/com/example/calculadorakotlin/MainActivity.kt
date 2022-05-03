package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var chain = "";

        val text: TextView = findViewById(R.id.numbers)

        val button1: Button = findViewById(R.id.btn1)
        val button2: Button = findViewById(R.id.btn2)
        val button3: Button = findViewById(R.id.btn3)
        val button4: Button = findViewById(R.id.btn4)
        val button5: Button = findViewById(R.id.btn5)
        val button6: Button = findViewById(R.id.btn6)
        val button7: Button = findViewById(R.id.btn7)
        val button8: Button = findViewById(R.id.btn8)
        val button9: Button = findViewById(R.id.btn9)
        var buttonDot: Button = findViewById(R.id.btnDot)
        var buttonTimes: Button = findViewById(R.id.btnTimes)
        var buttonPlus: Button = findViewById(R.id.btnPlus)
        var buttonSubtract: Button = findViewById(R.id.btnSubtract)
        var buttonDivide: Button = findViewById(R.id.btnDivide)
        val buttonDelete: Button = findViewById(R.id.btnDelete)

        button1.setOnClickListener{
            chain +="1"
            text.text = chain
        }

        button2.setOnClickListener{
            chain +=  "2"
            text.text = chain
        }

        button3.setOnClickListener{
            chain += "3"
            text.text = chain
        }

        button4.setOnClickListener{
            chain += "4"
            text.text = chain
        }

        button5.setOnClickListener{
            chain += "5"
            text.text = chain
        }

        button6.setOnClickListener{
            chain += "6"
            text.text = chain
        }

        button7.setOnClickListener{
            chain += "7"
            text.text = chain
        }

        button8.setOnClickListener{
            chain += "8"
            text.text = chain
        }

        button9.setOnClickListener{
            chain += "9"
            text.text = chain
        }

        buttonDelete.setOnClickListener(){
            chain = chain.substring(0, chain.length-1)
            println("q honda $chain")
            text.text = chain
        }

    }
}