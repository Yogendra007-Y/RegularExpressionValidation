package com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationFormatValidation {
    Matcher matcher;
    Pattern pattern;
    String Regex = "^[A-Z]{1}+[a-z]{2,}"; //User Registration Pattern For First Name

    public void nameValidation(String name) {
        pattern = Pattern.compile(Regex);
        matcher = pattern.matcher(name);
        boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("Name Should Begin With Capital Letter And Have Minimum 3 Letters");
        }
    }
}