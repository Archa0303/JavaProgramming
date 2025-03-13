import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

     
        String rev = new StringBuffer(str).reverse().toString();


        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

   
        System.out.println("Reversed String: " + rev);

        sc.close();
    }
}
