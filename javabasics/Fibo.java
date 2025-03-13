import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit");
        int n = sc.nextInt();
        
        int a = 0, b= 1;
        
        System.out.println("Fibonacci sequence :");
        for (int i = 0; i < n; i++) 
         {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        
        sc.close();
    }
}

    

