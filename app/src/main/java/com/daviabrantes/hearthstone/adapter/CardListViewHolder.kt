package com.daviabrantes.hearthstone.adapter

import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.daviabrantes.hearthstone.model.Card
import kotlinx.android.synthetic.main.list_item_grid_card.view.*

class CardListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(cardModel: Card) {
        itemView.card_image.load(cardModel.cardImage)
    }
}