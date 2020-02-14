package com.example.ahmed.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player("","")


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        leaguenextbtn.setOnClickListener {
            if(player.league != ""){
                val skillIntent = Intent(this,SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_PLAYER,player)
                startActivity(skillIntent)
            }
            else{
                Toast.makeText(this,"please select !!!!",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun menlistner(view: View){
        womenleaguebtn.isChecked = false
        shemalleaguebtn.isChecked = false
        player.league = "men"
    }
    fun womenlistner(view: View){
        menleaguebtn.isChecked = false
        shemalleaguebtn.isChecked = false
        player.league = "women"
    }
    fun shemalistner(view: View){
        womenleaguebtn.isChecked = false
        menleaguebtn.isChecked = false
        player.league = "Player"
    }

}
