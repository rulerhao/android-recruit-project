package `in`.hahow.android_recruit_project.countdown_time

import `in`.hahow.android_recruit_project.view.util.time.TimeHelper
import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class CountdownTimeTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    private lateinit var context: Context

    val mockItems = CountdownTimeMockItems()

    @Before
    fun setup() {
        hiltRule.inject()

        context = InstrumentationRegistry.getInstrumentation().targetContext
    }


    @Test
    fun testOutOfDateData() {
        val mockItem = TimeHelper.getCountDownText(context, mockItems.testOutOfDateData.proposalDueTime)
        val expected = mockItems.testOutOfDateDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testDayData() {
        val mockItem = TimeHelper.getCountDownText(context, mockItems.testDayData.proposalDueTime)
        val expected = mockItems.testDayDataExpected

        Assert.assertEquals(expected, mockItem)
    }

}