import java.util.Scanner;

public class StudEli {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();
        
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        

        int total = maths + phy+ chem;
        int mathsPhy = maths + phy;
        
        if (total>= 150 && mathsPhy >= 100) 
        {
            System.out.println("Student is Eligible");
        } 
        else 
        {
            System.out.println("Student is Not Eligible");
        }
        
        sc.close();
    }
}

    
