package com.example.ahmed.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun beginerlistner(view: View){
        ballerbtn.isChecked = false
        player.skill = "beginer"
    }

    fun ballerlistner(view: View){
        beginnerbtn.isChecked = false
        player.skill = "baller"
    }

    fun finishlistner(view: View){
        if(player.skill != ""){
            val finishIntent = Intent(this,FinishActivity::class.java)

            finishIntent.putExtra(EXTRA_PLAYER,player)

            startActivity(finishIntent)
        }
        else{
            Toast.makeText(this,"please select a skill !!!!", Toast.LENGTH_SHORT).show()
        }
    }
}
