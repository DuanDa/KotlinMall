package com.duan.baselibrary.presenter

import com.duan.baselibrary.presenter.view.BaseView

open class BasePresenter<T: BaseView> {

    lateinit var view: T
}