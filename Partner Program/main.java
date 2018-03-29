
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
        } while(sport.equalsIgnoreCase("hockey")!=true || sport.equalsIgnoreCase("football")!=true||sport.equalsIgnoreCase("Basketball")!=true);
        if(sport.equalsIgnoreCase("hockey")==true){
             Hockey player= new Hockey(name);
             player.questions();
             player.print();
        } else if(sport.equalsIgnoreCase("football")==true){
            Football player = new Football(name);
            player.questions();
            player.print();
        } else {
            BasketBall player = new BasketBall(name);
            player.questions();
            player.print();
        }
        
        
     
        
       
    }
}
