package com.daviabrantes.hearthstone.activity.main

import android.graphics.Color
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.daviabrantes.hearthstone.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setButtons()
        supportActionBar?.hide()
    }

    fun applyButtonProperties() : PaintDrawable {
        var randomColor = Color.argb(255, nextInt(255), nextInt(255), nextInt(255))
        return PaintDrawable(randomColor).apply {
            setCornerRadius(64f)
        }
    }

    fun setButtons() {
        button_common.background = applyButtonProperties()
        button_druid.background = applyButtonProperties()
        button_epic.background = (applyButtonProperties())
        button_hero.background = (applyButtonProperties())
        button_hunter.background = (applyButtonProperties())
        button_legendary.background = (applyButtonProperties())
        button_mage.background = (applyButtonProperties())
        button_weapon.background = (applyButtonProperties())
        button_spell.background = (applyButtonProperties())
    }

    override fun onClick(p0: View?) {
    }
}
