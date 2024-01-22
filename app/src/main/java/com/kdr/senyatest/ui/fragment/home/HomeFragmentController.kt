package com.kdr.senyatest.ui.fragment.home

import com.airbnb.epoxy.EpoxyController
import com.kdr.senyatest.ui.epoxy.LoadingEpoxyModel

class HomeFragmentController (
    private val onClickedCallback : (String) -> Unit
): EpoxyController(){
    var isLoading: Boolean = false
        set(value){
            field = value
            if(field){
                requestModelBuild()
            }
        }
    override fun buildModels() {
        if (isLoading) {
            LoadingEpoxyModel().id("loading_state").addTo(this)
            return
        }

    }


}