package br.com.antoniojose.projetotesteui


import android.support.test.rule.ActivityTestRule
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

   @Test
   fun testeLogin(){
      val launch: ActivityScenario<MainActivity> = ActivityScenario.launch(MainActivity::class.java)

      onView(withText("Tela login")).check(matches(isDisplayed()))
      onView(withId(R.id.edi_usuario)).perform(typeText("antonio"))
      closeSoftKeyboard()
      onView(withId(R.id.edit_senha)).perform(typeText("123"))
      closeSoftKeyboard()
      onView(withId(R.id.button_entrar)).perform(click())

      onView(withText("Conteúdo Principal")).check(matches(isDisplayed()))

      launch.close()
   }



}