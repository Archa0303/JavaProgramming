import  java.util.Scanner;

class InvalidPassword extends Exception {
    String message;
    InvalidPassword(String message) {
        this.message = message;
    }
    public void display()
    {
        System.out.println(message);
    }
}

public class PasswordValidate {
    public static void validatePassword(String password) throws InvalidPassword {
        if (password.length() < 8 || !password.matches(".*\\d.*") || !password.matches(".*[\\@\\$#&)].*")) {
            throw new InvalidPassword("Password must be at least 8 characters long, contain at least one number, and have at least one special character (, $, #, &, )). ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        
        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } 
        catch (InvalidPassword e) {
            e.display();
        }
    }
}
