package com.daviabrantes.hearthstone.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.daviabrantes.hearthstone.entities.CardResponseModel
import kotlinx.android.synthetic.main.list_item_grid_card.view.*

class CardListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(cardModel: CardResponseModel) {
        itemView.card_image.load(cardModel.img)
    }
}