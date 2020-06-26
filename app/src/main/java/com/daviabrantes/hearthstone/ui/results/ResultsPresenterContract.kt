package com.daviabrantes.hearthstone.ui.results

interface ResultsPresenterContract {

    fun getCards(param1 : String, param2 : String)
    fun setView(activity: ResultsViewContract)
}