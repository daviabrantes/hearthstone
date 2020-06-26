package com.daviabrantes.hearthstone.activity.results

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.activity.main.MainActivity
import com.daviabrantes.hearthstone.adapter.CardListGridRecyclerAdapter
import com.daviabrantes.hearthstone.entities.CardResponseModel
import com.daviabrantes.hearthstone.model.Card
import com.daviabrantes.hearthstone.service.GetService
import com.daviabrantes.hearthstone.service.RetrofitClient
import kotlinx.android.synthetic.main.activity_results.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        initView()

        button_back.setOnClickListener {
            View.OnClickListener {
                val intent = Intent(this, (MainActivity::class.java))
                startActivity(intent)
            }
        }
    }

    fun configureRetrofit() {
        val remote = RetrofitClient.createService(GetService::class.java)
        val call : Call<List<CardResponseModel>> = remote.getDruids()
    }

    private fun getData(): List<Card> {
        val listOfCard = mutableListOf<Card>()

        var cardModel = Card("http://www.androidtutorialshub.com/wp-content/uploads/2016/01/banner_glide.png")
        listOfCard.add(cardModel)

        cardModel = Card("http://www.androidtutorialshub.com/wp-content/uploads/2016/01/banner_glide.png")
        listOfCard.add(cardModel)

        cardModel = Card("http://www.androidtutorialshub.com/wp-content/uploads/2016/01/banner_glide.png")
        listOfCard.add(cardModel)

        return listOfCard

    }

    private fun initView() {
        recycler_view.layoutManager = GridLayoutManager(this,2)

        val cardListAdapter = CardListGridRecyclerAdapter()
        recycler_view.adapter = cardListAdapter
        cardListAdapter.setCardList(getData())
        }
}

