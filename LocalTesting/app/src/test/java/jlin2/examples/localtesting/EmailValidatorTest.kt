package jlin2.examples.localtesting

import org.junit.Assert.*
import org.junit.Test




class EmailValidatorTest {

    @Test
    fun validEmail_CorrectFormat_ReturnsTrue() {
        val email = "123@abc.com"
        assertTrue(EmailValidator.isValidEmail(email))
    }

    @Test
    fun validEmail_SubdomainFormat_ReturnsTrue() {
        val email = "123@abc.co.ca"
        assertTrue(EmailValidator.isValidEmail(email))
    }


}