package com.daviabrantes.hearthstone

import com.daviabrantes.hearthstone.model.CardResponseModel
import java.util.*

class MockModelsFactory {
    fun createCard(img : String): CardResponseModel {
        return CardResponseModel().apply { this.img = img}
    }

    fun createCardList(count: Int): List<CardResponseModel> {
        val cards: MutableList<CardResponseModel> = ArrayList<CardResponseModel>()
        for (i in 0 until count) {
            cards.add(CardResponseModel().apply { this.img = "Image$i" })
        }
        return cards
    }
}