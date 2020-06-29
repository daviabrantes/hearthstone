package com.daviabrantes.hearthstone.ui

import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.daviabrantes.hearthstone.HearthstoneApplication
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.ui.main.MainActivity
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(application = HearthstoneApplication::class, sdk = [Build.VERSION_CODES.O_MR1], manifest = "AndroidManifest.xml")
class MainActivityTest {

    private var activity: MainActivity = MainActivity()
    private var appTitle : TextView? = null
    private var filterDruid : Button? = null
    private var filterHunter : Button? = null
    private var filterMage : Button? = null
    private var filterSpell : Button? = null
    private var filterWeapon : Button? = null
    private var filterHero : Button? = null
    private var filterCommon : Button? = null
    private var filterEpic : Button? = null
    private var filterLegendary : Button? = null

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        activity = Robolectric.buildActivity(MainActivity::class.java).create().get()
        findViews()
    }

    private fun findViews() {
       appTitle = activity.findViewById(R.id.page_title)
       filterDruid = activity.findViewById(R.id.button_druid)
       filterHunter = activity.findViewById(R.id.button_hunter)
       filterMage = activity.findViewById(R.id.button_mage)
       filterSpell = activity.findViewById(R.id.button_spell)
       filterWeapon = activity.findViewById(R.id.button_weapon)
       filterHero = activity.findViewById(R.id.button_hero)
       filterCommon = activity.findViewById(R.id.button_common)
       filterEpic = activity.findViewById(R.id.button_epic)
       filterLegendary = activity.findViewById(R.id.button_legendary)
    }

    @Test
    fun filterButtonsShouldBePresentAndVisible() {
        assertThat(filterDruid,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterDruid?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterHunter,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterHunter?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterMage,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterMage?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterSpell,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterSpell?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterWeapon,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterWeapon?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterHero,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterHero?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterCommon,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterCommon?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterEpic,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterEpic?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(filterLegendary,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterLegendary?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(appTitle,Matchers.`is`(Matchers.notNullValue()))
        assertThat(appTitle?.visibility, Matchers.`is`(View.VISIBLE))
    }
}