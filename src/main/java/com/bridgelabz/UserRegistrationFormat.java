package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationFormat {
    Pattern pattern;
    Matcher matcher;
    /* method firstName to validate the first name of the user
     * @param name return boolean value
     */
    public boolean firstName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* methodlastName to validation of the name value
       @param name return boolean value
     */
    public boolean lastName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* method emailValidation to validate email format0
       @param name return boolean value
     */
    public boolean emailValidation(String Email){
        String regx = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(Email);
        return matcher.matches();
    }
    /* method  numberValidationto validate phone no format
     * @param PhoneNo return boolean value
     */
    public boolean numberValidation(String PhoneNo){
        String regx = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(PhoneNo);
        return matcher.matches();
    }
    /* method loginValidation to validate password format 1
   @param Password return boolean value
 */
    public boolean loginValidation(String Password) {
        String regexPassword = "[A-Za-z0-9]{8,}";
        pattern = Pattern.compile(regexPassword);
        matcher = pattern.matcher(Password);
        return matcher.matches();
    }
    public boolean loginValidation2(String Password) {
        String regexPassword = "[A-Za-z0-9]{8,}";
        pattern = Pattern.compile(regexPassword);
        matcher = pattern.matcher(Password);
        return matcher.matches();
    }
}
