package com.daviabrantes.hearthstone.ui.results

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.ui.main.MainActivity
import com.daviabrantes.hearthstone.ui.results.adapter.CardListGridRecyclerAdapter
import com.daviabrantes.hearthstone.model.CardResponseModel
import kotlinx.android.synthetic.main.activity_results.*
import org.koin.android.ext.android.inject

class ResultsActivity : AppCompatActivity(), ResultsViewContract {

    val cardListAdapter = CardListGridRecyclerAdapter()
    val presenter : ResultsPresenterContract by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        supportActionBar?.hide()
        presenter.setView(this)
        initView()

        presenter.getCards(intent.getStringExtra("getParameters"))

        button_back.setOnClickListener {
                val intent = Intent(this, (MainActivity::class.java))
                startActivity(intent)
        }
    }

    private fun initView() {
        recycler_view.layoutManager = GridLayoutManager(this, 2)
        recycler_view.adapter = cardListAdapter
        text_filter.text = intent.getStringExtra("filterName")
    }

    override fun getCardsSuccess(cardList: List<CardResponseModel>) {
        cardListAdapter.setCardList(cardList)
    }

    override fun getCardsError() {
        Toast.makeText(this, "Ocorreu um erro ao realizar operação.", Toast.LENGTH_LONG).show()
    }
}

