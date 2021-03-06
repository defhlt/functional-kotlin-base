package com.memoizrlabs.functional_kotlin_base

import org.junit.Assert.assertEquals
import org.junit.Test

class `List test` {
    @Test
    fun `Returns head of list`() {
        assertEquals(listOf(1,2,3,4,5).head, 1)
    }

    @Test
    fun `Returns tail of list`() {
        assertEquals(listOf(1,2,3,4,5).tail, listOf(2,3,4,5))
    }
}