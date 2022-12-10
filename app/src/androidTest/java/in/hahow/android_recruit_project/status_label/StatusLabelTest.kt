package `in`.hahow.android_recruit_project.status_label

import `in`.hahow.android_recruit_project.view.util.status.StatusHelper
import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class StatusLabelTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    private lateinit var context: Context

    val mockItems = StatusLabelMockItems()

    @Before
    fun setup() {
        hiltRule.inject()

        context = InstrumentationRegistry.getInstrumentation().targetContext
    }


    @Test
    fun testCriteriaIncubatingData() {
        val mockItem = StatusHelper.getStatusString(context, mockItems.testCriteriaIncubatingData)
        val expected = mockItems.testCriteriaIncubatingDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testCriteriaPublishedData() {
        val mockItem = StatusHelper.getStatusString(context, mockItems.testCriteriaPublishedData)
        val expected = mockItems.testCriteriaPublishedDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testNonCriteriaPublishedData() {
        val mockItem = StatusHelper.getStatusString(context, mockItems.testNonCriteriaPublishedData)
        val expected = mockItems.testNonCriteriaPublishedDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testCriteriaSuccessData() {
        val mockItem = StatusHelper.getStatusString(context, mockItems.testCriteriaSuccessData)
        val expected = mockItems.testCriteriaSuccessDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testNonCriteriaSuccessData() {
        val mockItem = StatusHelper.getStatusString(context, mockItems.testNonCriteriaSuccessData)
        val expected = mockItems.testNonCriteriaSuccessDataExpected

        Assert.assertEquals(expected, mockItem)
    }

}