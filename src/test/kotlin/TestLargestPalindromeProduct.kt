import junit.framework.Assert.assertEquals
import org.junit.Test

class TestLargestPalindromeProduct {
    val lpp = LargestPalindromeProduct()
    @Test
    fun testLargestPalindromeProduct3() {
        assertEquals(906609, lpp.findLargestPalindromeProduct(3))
    }

    @Test
    fun testLargestPalindromeProduct2() {
        assertEquals(9009, lpp.findLargestPalindromeProduct(2))
    }
}