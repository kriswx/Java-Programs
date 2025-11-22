import java.util.Scanner;

public class TaxiFareCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter distance in km: ");
        double distance = sc.nextDouble();
        
        
        System.out.println("Enter time in minute: ");
        double time = sc.nextDouble();
                                   
        
        sc.nextLine();  //Clear leftover newline
        
        
        System.out.println("Press \"A\" for local or \npress \"B\" for not-local");
        String local = sc.nextLine();
        
        var first = (local.equalsIgnoreCase("A"))?"true":"false";
        
        double localfare = 0;
        
         if (first.equals("true")){
            localfare = 5;
        }else{
            System.out.println("Thankyou you are not local so discount is not added\n");
           
        }
  
       
        
        System.out.println("Press \"C\" if it is night or \npress \"D\" if it is not night");
        String night = sc.nextLine();
        
        var second = (night.equalsIgnoreCase("C"))?"true":"false";
        
        double nightfare = 0;
        
        if (second.equals("true")){
            nightfare = 5;
        }else{
            System.out.println("Thankyou, your nightfare is not added\n");
            
        }
        
        double total = (distance *5) + (time *2) + (localfare *0.5) + (nightfare /0.5);
        System.out.println("Your total rickshaw fare is Rs." + total);
        
    }
    
}