package com.example.helpertest3.server

import com.ironwaterstudio.requests.http.HttpRequest
//import com.ironwaterstudio.server.http.HttpRequest

class AppRequest : HttpRequest {
	constructor(action: String) : super(action)

	constructor(request: AppRequest) : super(request)

	override fun copy() = AppRequest(this)
}