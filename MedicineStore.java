import java.util.Scanner;

public class MedicineStore {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
        System.out.println("-----Welcome to Dharan Aushadi Pasal-----");
        
        //for condition user should give vale 
        System.out.println("|  Press 1 for store medicine detail and for report \n|  Press 2 for display medicine detail");
        var press = sc.nextInt();
        
       
         //condition if esle
        if(press == 1){
            StoreMedicine.store();            
        }else if(press == 2){
            System.out.println("First Enter Details");
            DisplayMedicine.display();
        }else{
            System.out.println("Invalid value");
        }
 }   
}
