import java.util.Scanner;

class InvalidPhone extends Exception {
    String message;
    InvalidPhone(String message) {
        this.message = message;
    }
    public void getMessageDetails() {
        System.out.print(message);
    }
}

public class PhoneValidate {
    public static void validatePhoneNumber(String phoneno) throws InvalidPhone {
        if (!phoneno.matches("\\d{10}")) {
            throw new InvalidPhone("Phone number must have exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneno = sc.nextLine();
        
        try {
            validatePhoneNumber(phoneno);
            System.out.println("Phone number is valid.");
        } catch (InvalidPhone e) {
            e.getMessageDetails();
        }
    }
}
