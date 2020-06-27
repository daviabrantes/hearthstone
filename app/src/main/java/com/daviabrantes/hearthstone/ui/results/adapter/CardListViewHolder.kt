package com.daviabrantes.hearthstone.ui.results.adapter

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.model.CardResponseModel
import kotlinx.android.synthetic.main.list_item_grid_card.view.*

class CardListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(cardModel: CardResponseModel) {
        itemView.card_image.load(cardModel.img) {
            placeholder(R.drawable.img_card)
        }
    }
}