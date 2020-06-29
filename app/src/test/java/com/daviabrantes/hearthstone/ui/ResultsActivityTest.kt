package com.daviabrantes.hearthstone.ui

import android.content.Intent
import android.os.Build
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.daviabrantes.hearthstone.HearthstoneApplication
import com.daviabrantes.hearthstone.MockModelsFactory
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.service.GetService
import com.daviabrantes.hearthstone.ui.results.ResultsActivity
import com.daviabrantes.hearthstone.ui.results.ResultsPresenter
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(application = HearthstoneApplication::class, sdk = [Build.VERSION_CODES.O_MR1], manifest = "AndroidManifest.xml")
class ResultsActivityTest {

    @Mock var getService: GetService? = null

    private var activity: ResultsActivity? = null
    private var presenter: ResultsPresenter? = null
    private var filterButton : Button? = null

    private var recyclerView : RecyclerView? = null
    private var buttonBack : Button? = null

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        val intent = Intent()
        intent.putExtra("getParameters", "image")

        activity = Robolectric.buildActivity(ResultsActivity::class.java).create().get()
        presenter?.setView(ResultsActivity())
        findViews()
    }

    private fun findViews() {
       recyclerView = activity?.findViewById(R.id.recycler_view)
       buttonBack = activity?.findViewById(R.id.button_back)
    }

    @Test
    fun viewsShouldBePresentAndVisible() {
        assertThat(filterButton,Matchers.`is`(Matchers.notNullValue()))
        assertThat(filterButton?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(recyclerView,Matchers.`is`(Matchers.notNullValue()))
        assertThat(recyclerView?.visibility, Matchers.`is`(View.VISIBLE))

        assertThat(buttonBack,Matchers.`is`(Matchers.notNullValue()))
        assertThat(buttonBack?.visibility, Matchers.`is`(View.VISIBLE))
    }
}