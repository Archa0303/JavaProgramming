import java.util.Scanner;

public class EmpSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Select job role:");
         System.out.println("1. Manager \n2. Developer \n3. Intern");
        int role = sc.nextInt();
        int salary = 0;

        
        switch (role) {
            case 1:
                salary = 70000;
                break;
            case 2:
                salary = 50000;
                break;
            case 3:
                salary = 30000;
                break;
            default:
                System.out.println("Invalid");
                return;
        }

        
        System.out.print("Enter years of experience: ");
        int exp = sc.nextInt();
        double bonus = 0;
         if (exp > 5)
        {
            bonus = salary * 0.20; 
        }

       else if (exp >= 3 && exp <= 5)
        {
            bonus = salary * 0.10; 
        } 
       
       /* else if(exp < 3)
        {
            System.out.println("No Bonus");
        }*/

        double totalsal = salary + bonus;

        
        System.out.println("Total Salary : " + totalsal);
        
        sc.close();
    }
}
