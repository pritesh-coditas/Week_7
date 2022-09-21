package com.example.week_7.my_integration_espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.week_7.R
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test

internal class MyEspressoActivityTest{

/*    @Before
    fun initScenario(){ // Resumed state indicate activity is running and visible to user.
        val scenario = ActivityScenario.launch(MyEspressoActivity::class.java)
        scenario.moveToState(Lifecycle.State.RESUMED)
    }*/

    @get:Rule
    var scenario = ActivityScenarioRule(MyEspressoActivity::class.java)

    @Test
    fun checkEspressoActivityDisplay(){
        onView(withId(R.id.activity_my_espresso)).check(matches(isDisplayed()))
    }

    @Test
    fun checkTextViewVisible(){
        onView(withId(R.id.espresso_TV)).check(matches(isDisplayed()))
    }

    @Test
    fun checkTextInTextView(){
        onView(withText(R.string.espresso)).check(matches(withText("Espresso")))
    }

    @Test
    fun checkEditTextHasErrorTest(){
        onView(allOf(withId(R.id.espresso_ET), hasErrorText("Enter name")))
    }

    @Test
    fun checkBtnViewVisible(){
        onView(withId(R.id.gotoSecondActivity_Btn)).check(matches(isDisplayed()))
    }

    @Test
    fun checkActivityChange(){
        onView(withId(R.id.gotoSecondActivity_Btn)).perform(click())

        onView(withId(R.id.second_Activity_layout)).check(matches(isDisplayed()))


    }
}