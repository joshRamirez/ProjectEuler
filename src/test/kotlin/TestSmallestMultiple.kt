import junit.framework.Assert.assertEquals
import org.junit.Test

class TestSmallestMultiple {
    val sm = SmallestMultiple()
    @Test
    fun testFindSmallestMutliple() {
        assertEquals(232792560, sm.getSmallestMultiple(20))
    }

    @Test
    fun testFindSmallestMutlipleOf10() {
        assertEquals(2520, sm.getSmallestMultiple(10))
    }
}