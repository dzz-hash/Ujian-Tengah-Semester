package com.example.uts

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.uts.MainActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen) // Ganti ke layout kamu
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish() // menutup SplashScreen agar tidak bisa kembali ke sini
        }, 3000)

        val textView: TextView = findViewById(R.id.Text_View)
        val paint = textView.paint
        val width = paint.measureText(textView.text.toString())

        val textShader = LinearGradient(
            0f, 0f, width, textView.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textView.paint.shader = textShader

        val textView2: TextView = findViewById(R.id.Text_View2)
        val paint2 = textView.paint
        val width2 = paint.measureText(textView.text.toString())

        val textShader2 = LinearGradient(
            0f, 0f, width, textView2.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textView2.paint.shader = textShader

        val textView3: TextView = findViewById(R.id.Text_View3)
        val paint3 = textView.paint
        val width3 = paint.measureText(textView.text.toString())

        val textShader3 = LinearGradient(
            0f, 0f, width, textView3.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )

        textView3.paint.shader = textShader
    }
}


