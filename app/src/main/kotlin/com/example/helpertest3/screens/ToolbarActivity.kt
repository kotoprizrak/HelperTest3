package com.example.helpertest3.screens

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.helpertest3.R
import com.ironwaterstudio.mvp.MvpActivity

@Suppress("PARAMETER_NAME_CHANGED_ON_OVERRIDE")
abstract class ToolbarActivity<T : ViewDataBinding>(private val layoutResId: Int) : MvpActivity() {
	protected lateinit var binding: T
	var toolbar: Toolbar? = null
		private set

	override fun onCreate(inState: Bundle?) {
		super.onCreate(inState)
		binding = DataBindingUtil.setContentView(this, layoutResId)
		toolbar = findViewById(R.id.toolbar)
		toolbar?.let { setSupportActionBar(it); supportActionBar?.setDisplayHomeAsUpEnabled(!isTaskRoot) }
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			android.R.id.home -> {
				onBackPressed()
				true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}
}