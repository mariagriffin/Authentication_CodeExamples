import java.util.Scanner;

public class SimpleMFA {
    public static void main(String[] args) {
        
        // Simulate OTP input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the OTP: ");
        String userOTP = scanner.nextLine();
        
        if (validateOTP(userOTP)) {
            System.out.println("Login successful");
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



