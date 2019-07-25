package com.example.helpertest3;

//import com.ironwaterstudio.server.http.HttpHelper
import android.app.Application
import com.ironwaterstudio.requests.http.HttpHelper
import com.ironwaterstudio.utils.Utils

class ApplicationEx : Application() {
	override fun onCreate() {
		super.onCreate()
		Utils.context = this
//		HttpHelper.init()
	}

	companion object {
	}
}
