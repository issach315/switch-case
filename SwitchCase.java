package SwitchCase;
import java.util.Scanner;
public class SwitchCase 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month Number ");
        int month =sc.nextInt();
        
        // jumping statement in java 1.switch case
        
        switch (month)
         {
           
            case 1:
                    System.out.println("Janury");
            break;

            case 2:
                System.out.println("FEB");
            break;    
            
            case 3:
                    System.out.println("MAR");
             break;

            case 4:
                System.out.println("APRL");
             break;
            
            case 5:
                System.out.println("MAY");
             break;

             case 6:
                System.out.println("JUN");
             break; 
             case 7:
                System.out.println("JLY");
             break;
             case 8:
                System.out.println("AUG");
             break;
            
             case 9:
                System.out.println("SEPT");
             break;
            
             case 10:
                System.out.println("OCT");
             break;
             case 11:
                System.out.println("NOV");
             break; 

             case 12:
             System.out.println("DEC");
          break;

            default:
                System.out.println("Enter valid day Number between 1 - 7 ");
               
        }
        
    }
    
}
