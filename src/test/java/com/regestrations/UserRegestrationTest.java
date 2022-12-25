package com.regestrations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class UserRegestrationTest {

    UserRegestration userRegestration = new UserRegestration();
    // Test cases to validate First Name.
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {

        boolean result = userRegestration.firstName("Naveed");
        Assertions.assertTrue(result);
    }


    // Test cases to Short FIrst Name.
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        boolean result = userRegestration.firstName("Na");
        Assertions.assertEquals(false, result);
    }
    // Test cases to Special char First Name.
    @Test
    public void givenFirstName_WhenSpChar_ShouldReturnFalse() {
        boolean result = userRegestration.firstName("N@veed");
        Assertions.assertEquals(false,result);
    }
    // Test cases to validate Last Name.
    @Test
    public void LastName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegestration.lastName("Khans");
        Assertions.assertEquals(true,result);
    }
    // Test cases to Sort Last Name.
    @Test
    public void LastName_WhenShort_ShouldReturnFalse() {

        boolean result = userRegestration.lastName("Kha");
        Assertions.assertEquals(false,result);
    }
    // Test cases to validate Email Name.
    @Test
    public void Email_WhenValid_ShouldReturnTrue(){

        boolean result = userRegestration.Email("abc@bl.co");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void Email_WhenInValid_ShouldReturnFalse(){

        boolean result = userRegestration.Email(".xyz@bl.");
        Assertions.assertEquals(false,result);
    }
    // Test cases to validate Contact Number.
    @Test
    public void contactNumber_WhenValid_ShouldReturnTrue(){
        boolean result = userRegestration.contactNumber( "91 1234567890");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void contactNumber_WhenShort_ShouldReturnFalse(){

        boolean result = userRegestration.contactNumber( "91 123456790");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void password1_WhenValid_ShouldReturnTrue(){

        boolean result = userRegestration.password1("abcdfghjk");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void password1_WhenPassShort_ShouldReturnFalse(){

        boolean result = userRegestration.password1("abcd");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void password2_WhenValid_ShouldReturnTrue(){

        boolean result = userRegestration.password2("Abcdfhyup");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void password2_WhenNoUpCase_ShouldReturnFalse(){

        boolean result = userRegestration.password2("abcdfhyup");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void password3_WhenValid_ShouldReturnTrue(){

        boolean result = userRegestration.password3("Abccda123");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void password3_WhenNoNumeric_ShouldReturnFlase(){

        boolean result = userRegestration.password3("abcdfhgjkd");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void password4_WhenValid_ShouldReturnTrue(){

        boolean result = userRegestration.password4("abcDfh12$");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void password4_WhenNoSpChar_ShouldReturnFalse(){

        boolean result = userRegestration.password4("abcDfh123");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void Email_WhenValidated_ShouldReturnTrue(){

        boolean result = userRegestration.EmailValidation("abc@yahoo.com");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void Email_WhenNotValidated_ShouldReturnFalse(){

        boolean result = userRegestration.EmailValidation("abc@.com.my");
        Assertions.assertEquals(false,result);
    }
}
