package com.daviabrantes.hearthstone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.entities.CardResponseModel

class CardListGridRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var cardList = listOf<CardResponseModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CardListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_grid_card, parent, false))
    }

    override fun getItemCount(): Int = cardList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val cardViewHolder = holder as CardListViewHolder
        cardViewHolder.bindView(cardList[position])
    }

    fun setCardList(listOfCards: List<CardResponseModel>) {
        cardList = listOfCards
        notifyDataSetChanged()
    }










}