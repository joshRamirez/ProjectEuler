import junit.framework.Assert.assertEquals
import org.junit.Test

class TestLargestPrimeFactor {
    val lpf = LargestPrimeFactor()
    @Test
    fun testExample() {
        assertEquals(29, lpf.findLargestPrimeFactor(13195))
    }

    @Test
    fun testProblem() {
        assertEquals(6857, lpf.findLargestPrimeFactor(600851475143))
    }
}