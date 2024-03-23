package com.example.app_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 在setContentView之后获取视图引用
        val comView = findViewById<ImageView>(R.id.comView)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnScissors = findViewById<ImageButton>(R.id.btnScissor)
        val btnStone = findViewById<ImageButton>(R.id.btnStone)
        val btnPaper = findViewById<ImageButton>(R.id.btnPaper)

        btnPaper.setOnClickListener {
            var iComPlay =20
            iComPlay = Random.nextInt(1, 101)
            txtResult.setText("") // 清空结果文本
            comView.setImageResource(android.R.color.transparent)
            when (iComPlay) {
                in 71..100 -> {
                    comView.setImageResource(R.drawable.stone)
                    txtResult.setText(R.string.win)
                }
                in 41..70 -> {
                    comView.setImageResource(R.drawable.paper)
                    txtResult.setText(R.string.draw)
                }
                in 1..40 -> {
                    comView.setImageResource(R.drawable.scissor)
                    txtResult.setText(R.string.lose)
                }
            }
        }

        btnScissors.setOnClickListener {
            var iComPlay =20
            iComPlay = Random.nextInt(1, 101)
            txtResult.setText("") // 清空结果文本
            comView.setImageResource(android.R.color.transparent)
            when (iComPlay) {
                in 71..100 -> {
                    comView.setImageResource(R.drawable.paper)
                    txtResult.setText(R.string.win)
                }
                in 41..70 -> {
                    comView.setImageResource(R.drawable.scissor)
                    txtResult.setText(R.string.draw)
                }
                in 1..40 -> {
                    comView.setImageResource(R.drawable.stone)
                    txtResult.setText(R.string.lose)
                }
            }
        }

        btnStone.setOnClickListener {
            var iComPlay =20
            iComPlay = Random.nextInt(1, 101)
            txtResult.setText("") // 清空结果文本
            comView.setImageResource(android.R.color.transparent)
            when (iComPlay) {
                in 71..100 -> {
                    comView.setImageResource(R.drawable.scissor)
                    txtResult.setText(R.string.win)
                }
                in 41..70 -> {
                    comView.setImageResource(R.drawable.stone)
                    txtResult.setText(R.string.draw)
                }
                in 1 .. 40-> {
                    comView.setImageResource(R.drawable.paper)
                    txtResult.setText(R.string.lose)
                }
            }
        }
    }
}
