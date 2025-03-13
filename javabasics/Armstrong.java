import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	      

	        int s= 0, rem, temp=n;
	        
	        while(temp >0) {
	            rem= temp%10;
	        	s =s + rem *rem *rem;
	        	temp/=10;
	        }

	    
	        if (s==n)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not an Armstrong Number");
		sc.close();
	    }
	
	
	}


