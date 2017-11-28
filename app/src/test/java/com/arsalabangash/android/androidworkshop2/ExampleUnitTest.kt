package com.arsalabangash.android.androidworkshop2

import com.arsalabangash.android.androidworkshop2.learning.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun helloWorldTest() {
        assertEquals(helloWorld(), "Hello World")
    }

    @Test
    fun stringTimesTest() {
        assertEquals(stringTimes("Hi", 2), "HiHi")
        assertEquals(stringTimes("Hi", 3), "HiHiHi")
        assertEquals(stringTimes("Hi", 1), "Hi")
        assertEquals(stringTimes("UTM", 0), "")
    }



    @Test
    fun repeatFrontTest() {
        assertEquals(repeatFront("Chocolate", 3), "ChoChC")
        assertEquals(repeatFront("Ice Cream", 2), "IcI")
        assertEquals(repeatFront("Chocolate", 4), "ChocChoChC")
    }


    @Test
    fun evenlySpacedTest() {
        assertEquals(evenlySpaced(Triple(2, 4, 6)), true)
        assertEquals(evenlySpaced(Triple(4, 6, 2)), true)
        assertEquals(evenlySpaced(Triple(4, 6, 3)), false)
    }

    @Test
    fun isEveryWhereTest() {
        assertEquals(isEveryWhere(arrayOf(1, 2, 1, 3), 1), true)
        assertEquals(isEveryWhere(arrayOf(1, 2, 1, 3), 2), false)
        assertEquals(isEveryWhere(arrayOf(1, 2, 1, 3, 4), 1), false)
    }

    @Test
    fun wordMultipleTest() {
        assertEquals(wordMultiple(arrayOf("a", "b", "a", "c", "b")),
                hashMapOf(Pair("a", true), Pair("b", true), Pair("c", false)))
        assertEquals(wordMultiple(arrayOf("c", "b", "a")),
                hashMapOf(Pair("a", false), Pair("b", false), Pair("c", false)))
        assertEquals(wordMultiple(arrayOf("c", "c", "c", "c")),
                hashMapOf(Pair("a", true), Pair("b", true), Pair("c", false)))
    }

    @Test
    fun seriesUpTest() {
        assertEquals(seriesUp(3), arrayListOf(1, 1, 2, 1, 2, 3))
        assertEquals(seriesUp(4), arrayListOf(1, 1, 2, 1, 2, 3, 1, 2, 3, 4))
        assertEquals(seriesUp(2), arrayListOf(1, 1, 2))

    }

    @Test
    fun countTripleTest() {
        assertEquals(countTriple("abcXXXabc"), 1)
        assertEquals(countTriple("xxxabyyyycd"), 3)
        assertEquals(countTriple("a"), 0)
    }


}
