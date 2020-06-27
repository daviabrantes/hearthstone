package com.daviabrantes.hearthstone.model

import com.google.gson.annotations.SerializedName

class CardResponseModel {

    var cardId : String = ""
    var dbfId : String = ""
    var name : String = ""
    var cardSet : String = ""
    var type : String = ""
    var health : Int = 0
    var text : String = ""
    var artist : String = ""
    var playerClass : String = ""
    var img : String = ""
    var imgGold : String = ""
    var locale : String = ""
}