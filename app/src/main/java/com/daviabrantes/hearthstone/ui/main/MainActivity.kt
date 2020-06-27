package com.daviabrantes.hearthstone.ui.main

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.ui.results.ResultsActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        applyButtonProperties()
        supportActionBar?.hide()

        setupObservers()
    }

    private fun setupObservers() {
        button_druid.setOnClickListener {
            startResultsActivity("classes/Druid")
        }

        button_hunter.setOnClickListener {
            startResultsActivity("classes/Hunter")
        }

        button_mage.setOnClickListener {
            startResultsActivity("classes/Mage")
        }

        button_weapon.setOnClickListener {
            startResultsActivity("types/Weapon")
        }

        button_spell.setOnClickListener {
            startResultsActivity("types/Spell")
        }

        button_hero.setOnClickListener {
            startResultsActivity("types/Hero")
        }

        button_common.setOnClickListener {
            startResultsActivity("qualities/Common")
        }

        button_epic.setOnClickListener {
            startResultsActivity("qualities/Epic")
        }

        button_legendary.setOnClickListener {
            startResultsActivity("qualities/Legendary")
        }
    }

    fun setButtonProperties() : PaintDrawable {
        var randomColor = Color.argb(255, nextInt(255), nextInt(255), nextInt(255))
        return PaintDrawable(randomColor).apply {
            setCornerRadius(64f)
        }
    }

    fun applyButtonProperties() {
        button_common.background = setButtonProperties()
        button_druid.background = setButtonProperties()
        button_epic.background = (setButtonProperties())
        button_hero.background = (setButtonProperties())
        button_hunter.background = (setButtonProperties())
        button_legendary.background = (setButtonProperties())
        button_mage.background = (setButtonProperties())
        button_weapon.background = (setButtonProperties())
        button_spell.background = (setButtonProperties())
    }

    fun startResultsActivity(getParameters : String) {
        val intent = Intent(this, (ResultsActivity::class.java)).putExtra("getParameters", getParameters)
        startActivity(intent)
    }

}
