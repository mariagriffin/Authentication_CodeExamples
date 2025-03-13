import java.util.HashMap;  
import java.util.Scanner;  

public class SimpleSFA {  
    public static void main(String[] args) {  
        HashMap<String, String> users = new HashMap<>();  
        users.put("admin", "password123");  
        users.put("user1", "securepass");  

        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter username: ");  
        String username = scanner.nextLine();  
        System.out.print("Enter password: ");  
        String password = scanner.nextLine();  

        if (users.containsKey(username) && users.get(username).equals(password)) {  
            System.out.println("Login successful");  
        } else {  
            System.out.println("Invalid credentials");  
        }  
        scanner.close();  
    }  
} 


