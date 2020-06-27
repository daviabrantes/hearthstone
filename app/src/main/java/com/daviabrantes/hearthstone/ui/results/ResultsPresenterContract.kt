package com.daviabrantes.hearthstone.ui.results

interface ResultsPresenterContract {

    fun getCards(getParameters : String)
    fun setView(activity: ResultsViewContract)
}