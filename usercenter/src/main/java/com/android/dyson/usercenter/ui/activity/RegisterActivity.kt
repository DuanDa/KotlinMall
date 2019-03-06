package com.android.dyson.usercenter.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.dyson.usercenter.R
import com.android.dyson.usercenter.presenter.RegisterPresenter
import kotlinx.android.synthetic.main.activity_register.*
import java.util.*

class RegisterActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        btn_register.setOnClickListener {
            println("---> button clicked haha")
            println(TimeZone.getDefault().id)
        }
    }
}