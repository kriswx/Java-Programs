
import java.util.Scanner;

public class DisplayReport {
    public static void reports() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("******************************");
        System.out.println("--Display Report--");
        
        System.out.println("------------------------------");
        
        System.out.println("Enter buyer name: ");
        String name = sc.nextLine(); 
    
        System.out.println("Enter phone number: ");
        long number = sc.nextLong();
        
        
        
        System.out.println("------------------------------");
        
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+number);
        
    }
    
}
