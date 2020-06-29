package com.daviabrantes.hearthstone.ui.results

import android.view.View
import com.daviabrantes.hearthstone.service.GetService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ResultsPresenter(val getService: GetService) : ResultsPresenterContract {

    private lateinit var activity: ResultsViewContract

    override fun getCards(getParameters: String) {
        getService.getCards(getParameters).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result -> activity.getCardsSuccess(result) },
                { result -> activity.getCardsError() },
                {})
    }

    override fun setView(activity: ResultsViewContract) {
        this.activity = activity
    }


}