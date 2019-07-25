package com.example.helpertest3.views

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.ironwaterstudio.mvp.BaseView

@StateStrategyType(OneExecutionStateStrategy::class)
interface TestView : BaseView {
}