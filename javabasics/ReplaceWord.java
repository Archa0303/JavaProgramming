import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String search = sc.next();

        // Check if the word is not found before asking for replacement
        if (!str.contains(search)) {  
            System.out.println("Word not found");
        } else {
            System.out.print("Enter the word to replace: ");
            String replace = sc.next();

            // Replace the word
            String newstr = str.replace(search, replace);
            System.out.println("New string: " + newstr);
        }

        sc.close();
    }
}
