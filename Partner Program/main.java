
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
        Sports player = new Sports("");;
        System.out.println("Enter the name of the athlete: ");
        name=input.nextLine();


        do{
            System.out.println("Enter sport: ");
            sport=input.nextLine();
        } while(sport.equalsIgnoreCase("hockey")!=true);
        switch(sport){
            case "hockey": player= new Hockey(name);break;
            case "football": player = new Football(name);break;
            case "basketball":player = new BasketBall(name);break;
        }
        
        player.questions1();
        
       
    }
}
