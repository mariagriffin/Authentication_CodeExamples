import java.util.HashMap;  
import java.util.Scanner;  

public class SimpleSFA_MFA {  
    public static void main(String[] args) {  
        HashMap<String, String> users = new HashMap<>();  
        users.put("admin", "password123");  
        users.put("user1", "securepass");  

        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter username: ");  
        String username = scanner.nextLine();  
        System.out.print("Enter password: ");  
        String password = scanner.nextLine();  

        System.out.print("OTP has been sent to the phone nuber ending 9999 : " + '\n'); 

        // Simulate OTP input
        scanner = new Scanner(System.in);
        System.out.print("Enter the OTP: ");
        String userOTP = scanner.nextLine();
        
        if (validateOTP(userOTP)) {
            if (users.containsKey(username) && users.get(username).equals(password)) {  
                System.out.println("Login successful");  
            } else {  
                System.out.println("Invalid credentials");  
            }  
            scanner.close();
        } else {
            System.out.println("Invalid OTP");
        }
        
        scanner.close();

         
    }  

        // Simulated OTP validation
        public static boolean validateOTP(String userOTP) {
            return userOTP.equals("123456"); // Replace with real OTP logic
        }
} 


