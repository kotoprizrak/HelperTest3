package com.example.helpertest3.screens

import android.os.Bundle
import com.example.helpertest3.R
import com.example.helpertest3.databinding.ActivityTest2Binding
import com.example.helpertest3.presenters.Test2Presenter
import com.example.helpertest3.views.Test2View
import com.example.helpertest3.screens.ToolbarActivity
import com.arellomobile.mvp.presenter.InjectPresenter

class Test2Activity : ToolbarActivity<ActivityTest2Binding>(R.layout.activity_test2), Test2View {
	@InjectPresenter
	lateinit var presenter: Test2Presenter

	override fun onCreate(inState: Bundle?) {
		super.onCreate(inState)
	}
}
