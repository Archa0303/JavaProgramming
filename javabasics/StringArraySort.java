import java.util.Arrays;
import java.util.Scanner;

public class StringArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] words = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        Arrays.sort(words);

        System.out.println("Sorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}
