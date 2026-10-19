// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of -5 gives a ? `() {
        assertEquals("?", grade(-5))
    }

    @Test
    fun `Mark of -1 gives a ? `() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 15 gives a Fail`() {
        assertEquals("Fail", grade(15))
    }

    @Test
    fun `Mark of 39 gives a Fail`() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 50 gives a Pass`() {
        assertEquals("Pass", grade(50))
    }

    @Test
    fun `Mark of 69 gives a Pass`() {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Pass", grade(70))
    }

    @Test
    fun `Mark of 84 gives a Distinction`() {
        assertEquals("Distinction", grade(84))
    }

    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of 101 gives a ?`() {
        assertEquals("?", grade(101))
    }

    @Test
    fun `Mark of 150 gives a ?`() {
        assertEquals("?", grade(150))
    }


}
