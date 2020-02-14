package com.example.ahmed.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        finishtxt.text = "looking for ${player.league} ${player.skill} ..."

    }
}
