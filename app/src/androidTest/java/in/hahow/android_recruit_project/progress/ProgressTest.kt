package `in`.hahow.android_recruit_project.progress

import `in`.hahow.android_recruit_project.view.util.progress.ProgressHelper
import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class ProgressTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    private lateinit var context: Context

    val mockItems = ProgressMockItems()

    @Before
    fun setup() {
        hiltRule.inject()

        context = InstrumentationRegistry.getInstrumentation().targetContext
    }


    @Test
    fun testCriteriaZeroData() {
        val mockItem = ProgressHelper.getProgressString(context, mockItems.testCriteriaZeroData)
        val expected = mockItems.testCriteriaZeroDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testCriteriaPublishedData() {
        val mockItem = ProgressHelper.getProgressString(context, mockItems.testCriteriaPublishedData)
        val expected = mockItems.testCriteriaPublishedDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testNonCriteriaPublishedData() {
        val mockItem = ProgressHelper.getProgressString(context, mockItems.testNonCriteriaPublishedData)
        val expected = mockItems.testNonCriteriaPublishedDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testNonCriteriaNonPublishedData() {
        val mockItem = ProgressHelper.getProgressString(context, mockItems.testNonCriteriaNonPublishedData)
        val expected = mockItems.testNonCriteriaNonPublishedDataExpected

        Assert.assertEquals(expected, mockItem)
    }

    @Test
    fun testCriteriaNonPublishedData() {
        val mockItem = ProgressHelper.getProgressString(context, mockItems.testCriteriaNonPublishedData)
        val expected = mockItems.testCriteriaNonPublishedDataExpected

        Assert.assertEquals(expected, mockItem)
    }

}