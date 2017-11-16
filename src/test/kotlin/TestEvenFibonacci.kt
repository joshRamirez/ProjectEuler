import junit.framework.Assert.assertEquals
import org.junit.Test

class TestEvenFibonacci {
    val ef = EvenFibonacci()
    @Test
    fun testFindEvenFib() {
        assertEquals(4613732, ef.findEvenFib(4000000))
    }
}