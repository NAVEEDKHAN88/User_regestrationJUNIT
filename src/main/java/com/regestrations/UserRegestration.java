package com.regestrations;

import java.util.regex.Pattern;

public class UserRegestration {
    public boolean firstName(String fname) {
        boolean result = Pattern.matches("[A-Z]+[A-Za-z]{2,}", fname);
        if (result) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid first name ");
        }

        return result;
    }

    public boolean lastName(String lname) {
        boolean answer = Pattern.matches("([A-Z]+[A-Za-z]){2,}", lname);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid last name ");
        }
        return answer;
    }

    public boolean Email(String email) {
        Boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", email);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid email ID ");
        }
        return answer;
    }

    public boolean contactNumber(String ContactNumber) {
        boolean answer = Pattern.matches("91\\s[0-9]{10}", ContactNumber);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid contact number");
        }
        return answer;
    }

    public boolean password1(String password) {
        // rule1 = minimum 8 characters
        boolean answer = Pattern.matches("[a-zA-Z]{8,}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
        return answer;
    }

    public boolean password2(String password) {
        // rule2 = minimum 8 characters & atleast 1 upper case
        boolean answer = Pattern.matches("[A-Z][a-z]{8,}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
        return answer;
    }

    public boolean password3(String password) {
        // rule3 = minimum 8 characters & at least 1 upper case at least one numeric
        boolean answer = Pattern.matches("([A-Z][a-z][0-9]){8,}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
        return answer;
    }

    public boolean password4(String password) {
        // rule = minimum 8 characters & at least 1 upper case at least one numeric & only 1 special character
        boolean answer = Pattern.matches("[A-Za-z0-9]{8,}+[!@#$%^&*+-|'~`,<>.?_]{1}", password);
        if (answer) {
            System.out.println("Thank you");
        } else {
            System.out.println("enter valid password");
        }
        return answer;
    }

    public boolean EmailValidation(String email) {
        Boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid email ID ");
        }
        return answer;

    }


}