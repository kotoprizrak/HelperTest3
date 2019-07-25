package com.example.helpertest3.fragments

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import android.view.*
import com.example.helpertest3.R
import com.ironwaterstudio.mvp.MvpFragment

abstract class ToolbarFragment<T : ViewDataBinding>(private val layoutResId: Int) : MvpFragment() {
	protected lateinit var binding: T
	var toolbar: Toolbar? = null
		private set

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, inState: Bundle?): View? {
		binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
		toolbar = binding.root.findViewById(R.id.toolbar)
		return binding.root
	}

	override fun onActivityCreated(inState: Bundle?) {
		super.onActivityCreated(inState)
		if (toolbar == null)
			return

		onCreateOptionsMenu(toolbar?.menu, activity?.menuInflater)
		toolbar?.setOnMenuItemClickListener { item -> onOptionsItemSelected(item) }
		toolbar?.setNavigationOnClickListener { if (activity?.isFinishing == false) onNavigationClick() }
	}

	protected open fun onNavigationClick() {
		activity?.onBackPressed()
	}

	override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {}

	override fun onOptionsItemSelected(item: MenuItem?) = false
}
