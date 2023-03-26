import java.util.Scanner;

public class XaE {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        System.out.println("Hello, I am XaE. What can I do for you today?");

        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("> ");
            input = sc.nextLine();

            // Add code for XaE's responses here

        }

        sc.close();
        System.out.println("Goodbye!");
    }
}
