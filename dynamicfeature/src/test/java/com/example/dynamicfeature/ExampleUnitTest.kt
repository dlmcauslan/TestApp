package com.example.dynamicfeature

import com.example.testapp.Tester
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val test = Tester(true)
        assertEquals(true, test.isWorking)
    }
}