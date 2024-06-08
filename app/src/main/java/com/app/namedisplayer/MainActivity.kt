package com.app.namedisplayer

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvResult = findViewById<TextView>(R.id.tvNames)


        val names = arrayOf<String>(
            "Steven Ndaye", "Sne Zulu", "Njabulo", "Kuhle", "Matheba",
            "Khomotso", "Philips", "Pillay", "Rendani", "Kulani"
        )
        val numbers = arrayOf<Int>(1, 2, 3, 4, 6, 10, 12)
        val decimals = arrayOf<Double>(1.0, 2.4, 3.5, 4.2, 6.0, 10.1, 12.3)

        var size = names.size
        var firstElement = names[0]
        var lastElement = names[9]
        var lastElementBis = names[size - 1]

        var position = 0
        var output = ""

//        while (position < 10) {
//            output += names[position] + "\n"
//            position++
//        }

        while (position < names.size) { //names.count()

            if (position % 2 == 0) {
                output += names[position] + "\n"
            }

            position++
        }
//
//        for (element in names) {
//            output += element + "\n"
//        }


        for (position in 0..names.size - 1) {

            if (position % 2 == 0) {
                output += names[position] + " is at position $position \n"
            }

        }


        tvResult.text = output

//        tvResult.text =
//            size.toString() + "\n" + "First element = $firstElement \n, " +
//                    "last element = $lastElement \n, last elemenet bis = $lastElementBis"
    }
}