package com.cysion.usercenter.ui.iview

import com.cysion.ktbox.listener.IView
import com.cysion.usercenter.entity.Carousel

interface SquareView : IView {
    fun setCarousels(carousels: MutableList<Carousel>)
}
