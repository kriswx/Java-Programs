import java.util.Scanner;

public class StoreMedicine {
    //static varibales so we can use this another different classes
    static String a;
    static String b;
    static String c;

    public static void store(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("******************************");
        System.out.println("--Enter Medicine Detail--");
        
        System.out.println("Enter Medicine name: ");
         a = sc.nextLine();   
        
        System.out.println("Enter Medicine price : ");
         b = sc.nextLine();
        
        System.out.println("Enter Medicine quantity: ");
         c = sc.nextLine();
        
        
        
        System.out.println("Enter `1` for report \n or \nEnter any `2` to exist program");
        var enter = sc.nextInt();
        
        if(enter==1){
            DisplayReport.reports();
            
            DisplayMedicine.display();
            
        }else if (enter == 2){
            System.out.println("Thankyou for using our technology");
        }    
    }
    
}
