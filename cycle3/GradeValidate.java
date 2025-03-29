import java.util.Scanner;


class InvalidGradeException extends Exception {
     String message;
    
     InvalidGradeException(String message) {
        this.message = message;
    }
    
    public void display() {
        System.out.println(message);
    }
}

public class GradeValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's grade : ");
        char grade = sc.next().charAt(0);
        
        try {
            if (grade < 'A' || grade > 'F') {
                throw new InvalidGradeException("Invalid grade: " + grade);
            }
            System.out.println("Valid grade: " + grade);
        } 
        catch (InvalidGradeException e) {
            e.display();
        }
    }
}
