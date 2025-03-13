import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();

	        int temp = num;
	        int rev = 0;

	        while (num > 0) {
	            int rem = num % 10;  
	            rev = rev * 10 + rem; 
	            num /= 10;  
	        }

	        if (temp == rev) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }
	    }
	}



