package com.example.week_7.my_integration_espresso

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.week_7.R
import org.junit.Test


internal class MyEspressoActivityTest{

    @Test
    fun checkEspressoActivityDisplay(){
        val scenario = ActivityScenario.launch(MyEspressoActivity::class.java)
        onView(withId(R.id.activity_my_espresso)).check(matches(isDisplayed()))
    }

    @Test
    fun checkTextViewVisible(){
        val scenario = ActivityScenario.launch(MyEspressoActivity::class.java)
        scenario.moveToState(Lifecycle.State.RESUMED)
        onView(withId(R.id.espresso_TV)).check(matches(isDisplayed()))
    }

    @Test
    fun checkBtnViewVisible(){
        val scenario = ActivityScenario.launch(MyEspressoActivity::class.java)
        scenario.moveToState(Lifecycle.State.RESUMED)
        onView(withId(R.id.gotoSecondActivity_Btn)).check(matches(isDisplayed()))
    }

    @Test
    fun checkActivityChange(){
        val scenario = ActivityScenario.launch(MyEspressoActivity::class.java)
        scenario.moveToState(Lifecycle.State.RESUMED)

        onView(withId(R.id.gotoSecondActivity_Btn)).perform(click())

        onView(withId(R.id.second_Activity_layout)).check(matches(isDisplayed()))


    }
}