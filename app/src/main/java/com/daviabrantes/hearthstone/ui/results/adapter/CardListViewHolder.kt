package com.daviabrantes.hearthstone.ui.results.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.daviabrantes.hearthstone.R
import com.daviabrantes.hearthstone.model.CardResponseModel
import kotlinx.android.synthetic.main.list_item_grid_card.view.*


class CardListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(cardModel: CardResponseModel) {

        var image = cardModel.img?.replace("http", "https")
        Glide.with(itemView)  //2
            .load(image) //3
            .centerCrop() //4
            .placeholder(R.drawable.ic_broken_image)
            .fallback(R.drawable.img_card)
            .into(itemView.card_image) //8
    }

}
