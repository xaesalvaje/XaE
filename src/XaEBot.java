import java.util.Scanner;

public class XaEBot {
    
    private static XaE xaE = new XaE();
    
    public static void main(String[] args) {
        
        System.out.println("Hello! I am XaE. How can I assist you?");
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                
                String userInput = scanner.nextLine();
                
                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }
                
                String response = xaE.generateResponse(userInput);
                System.out.println(response);
                
            }
        }
        
    }
    
}
