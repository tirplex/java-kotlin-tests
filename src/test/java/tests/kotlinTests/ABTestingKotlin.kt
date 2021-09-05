package tests.kotlinTests

import org.junit.jupiter.api.Test
import pageObjects.ABTesting

class ABTestingKotlin {

    private val page = ABTesting()

    @Test
    fun `User should see correct title`() {
        page
            .open()
            .hasTitle("No A/B Test")
    }

    @Test
    fun `User should see correct description`() {
        page
            .open()
            .hasDescription("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn from different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).")
    }
}