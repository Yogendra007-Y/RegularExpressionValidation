package com.Bridgelabz;
import java.util.Scanner;
public class UserRegistrationFormatValidationMain {
    public static void welcome(){
        System.out.println("Welcome to User Registration System Problem");
    }
    public static void main(String[] args) {
        welcome();
        UserRegistrationFormatValidation user = new UserRegistrationFormatValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Address ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistrationFormatValidation.validFirstName();
                break;
            case 2:
                UserRegistrationFormatValidation.validLastName();
                break;
            case 3:
                UserRegistrationFormatValidation.validEmailId();
                break;
            case 4:
                UserRegistrationFormatValidation.validMobileNumber();
                break;
            case 5:
            UserRegistrationFormatValidation.validPassRule1();
            break;
            case 6:
                UserRegistrationFormatValidation.validPassRule2();
                break;
            case 7:
                UserRegistrationFormatValidation.validPassRule3();
                break;
            case 8:
                UserRegistrationFormatValidation.validPassRule4();
                break;
            default:
                System.out.println("Select a valid number");
        }
    }
}
