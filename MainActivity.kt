package com.example.tetrisnoactivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(){
    private var tvHighScore : TextView? = null
    override fun onCreate (savedinstanceState:Bundle?) {
        super.onCreate(savedinstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btnNewGame = findViewById<Button>(R.id.btn_new_game)
        val btnResetScore = findViewById<Button>(R.id.btn_reset_score)
        val btnExit = findViewById<Button>(R.id.btn_exit)
        tvHighScore = findViewById<TextView>(R.id.tv_high_score)
        btnNewGame.setOnClickListener(this::onBtnNewGameClick)
    }

    private fun onBtnNewGameClick ( view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
    private fun onBtnResetScoreClick ( view: View) { }
    private fun onBtnExitClick ( view: View) {
        exitProcess(0)
    }
}