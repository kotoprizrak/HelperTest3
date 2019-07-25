package com.example.helpertest3.screens

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.helpertest3.R
import com.example.helpertest3.databinding.ActivityTestBinding
import com.example.helpertest3.presenters.TestPresenter
import com.example.helpertest3.views.TestView
import com.example.helpertest3.screens.ToolbarActivity
import com.arellomobile.mvp.presenter.InjectPresenter

class TestActivity : ToolbarActivity<ActivityTestBinding>(R.layout.activity_test), TestView {
	@InjectPresenter
	lateinit var presenter: TestPresenter

	override fun onCreate(inState: Bundle?) {
		super.onCreate(inState)
//		binding.test1Button.setOnClickListener(object : View.OnClickListener{
//			override fun onClick(v: View?) {
//				startActivity(Intent(applicationContext, Test2Activity::class.java))
//			}
//		})

	}
}
