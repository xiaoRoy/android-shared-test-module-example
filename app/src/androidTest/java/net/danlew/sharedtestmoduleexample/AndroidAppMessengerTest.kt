package net.danlew.sharedtestmoduleexample

import net.danlew.sharedtestmoduleexample.library.sharedtest.FakeMessenger
import org.junit.Assert.assertEquals
import org.junit.Test

class AndroidAppMessengerTest {

    @Test
    fun messenger() {
        assertEquals("Hello", FakeMessenger("Hello").createMessage())
    }

}