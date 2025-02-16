package com.muneebamir.i221188


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest2 {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityTest2() {
        val relativeLayout = onView(
            allOf(
                withId(R.id.login),
                childAtPosition(
                    allOf(
                        withId(R.id.main),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    6
                ),
                isDisplayed()
            )
        )
        relativeLayout.perform(click())

        val materialTextView = onView(
            allOf(
                withId(R.id.contactstext), withText("Contacts"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomnav),
                        4
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView.perform(click())

        val appCompatImageView = onView(
            allOf(
                withId(R.id.imageView),
                childAtPosition(
                    allOf(
                        withId(R.id.top1),
                        childAtPosition(
                            withId(R.id.main),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView.perform(click())

        val appCompatImageView2 = onView(
            allOf(
                withId(R.id.profileicon),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomnav),
                        3
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView2.perform(click())

        val materialTextView2 = onView(
            allOf(
                withId(R.id.followers), withText("followers"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.posts_count2),
                        1
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView2.perform(click())

        val materialTextView3 = onView(
            allOf(
                withId(R.id.requests), withText("387 Following"),
                childAtPosition(
                    allOf(
                        withId(R.id.nav),
                        childAtPosition(
                            withId(R.id.main),
                            1
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView3.perform(click())

        val appCompatImageView3 = onView(
            allOf(
                withId(R.id.imageView),
                childAtPosition(
                    allOf(
                        withId(R.id.top1),
                        childAtPosition(
                            withId(R.id.main),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView3.perform(click())

        val appCompatImageView4 = onView(
            allOf(
                withId(R.id.edit),
                childAtPosition(
                    allOf(
                        withId(R.id.main),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageView4.perform(click())

        val materialTextView4 = onView(
            allOf(
                withId(R.id.done), withText("Done"),
                childAtPosition(
                    allOf(
                        withId(R.id.main),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView4.perform(click())

        val materialTextView5 = onView(
            allOf(
                withId(R.id.hometext), withText("Home"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.home),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView5.perform(click())

        val appCompatImageView5 = onView(
            allOf(
                withId(R.id.addicon),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomnav),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView5.perform(click())

        val appCompatImageView6 = onView(
            allOf(
                withId(R.id.cameraIcon),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.main),
                        2
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        appCompatImageView6.perform(click())

        val materialTextView6 = onView(
            allOf(
                withId(R.id.btnNext), withText("Next"),
                childAtPosition(
                    allOf(
                        withId(R.id.topBar),
                        childAtPosition(
                            withId(R.id.main),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView6.perform(click())

        val relativeLayout2 = onView(
            allOf(
                withId(R.id.register),
                childAtPosition(
                    allOf(
                        withId(R.id.main),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        relativeLayout2.perform(click())

        val materialTextView7 = onView(
            allOf(
                withId(R.id.contactstext), withText("Contacts"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomnav),
                        4
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialTextView7.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
