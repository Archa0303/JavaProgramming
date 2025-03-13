import java.util.Scanner;

public class StudGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int per = sc.nextInt();
        char grade;

    
        if (per >= 90) 
        {
            grade = 'A';
        } 
        else if (per >= 80) 
        {
            grade = 'B';
        } 
        else if (per >= 70) 
        {
            grade = 'C';
        }
        else if (per >= 60) 
        {
            grade = 'D';
        }
        else 
        {
            grade = 'F';
        }

       
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("You an do better");
                break;
            case 'D':
                System.out.println("Work harder");
                break;
            case 'F':
                System.out.println("Failed.Try again");
                break;
            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
