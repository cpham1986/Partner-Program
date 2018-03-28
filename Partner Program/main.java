
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class main
{
    public static void main(){
        Scanner input = new Scanner(System.in);
        String name, sport;
        System.out.println("Enter the name of the athlete: ");
        name=input.nextLine();
        do{
            System.out.println("Enter sport: ");
            sport=input.nextLine();
        } while(sport.equalsIgnoreCase("hockey")!=false||sport.equalsIgnoreCase("football")!=false||sport.equalsIgnoreCase("basketball")!=false);
        
        
        
        
        
        
        switch(sport){
            case "hockey":;break;
            case "football":;break;
            case "basketball":;break;
        }
    }
}
