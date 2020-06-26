package com.daviabrantes.hearthstone.ui.results

import com.daviabrantes.hearthstone.entities.CardResponseModel

interface ResultsViewContract {

    fun getCardsSuccess(cardList : List<CardResponseModel>)
    fun getCardsError()
}