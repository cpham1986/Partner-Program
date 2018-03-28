
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
        int start, tgames, sgames, shots, scored;
        Scanner input = new Scanner(System.in);
        String name, sport;
        Sports player = new Sports("");
        System.out.println("Enter the name of the athlete: ");
        name=input.nextLine();

        System.out.println("Enter sport: ");
        sport=input.nextLine();

        do{
            System.out.println("Enter sport: ");
            sport=input.nextLine();
        } while(sport.equalsIgnoreCase("hockey")!=false||sport.equalsIgnoreCase("football")!=false||sport.equalsIgnoreCase("basketball")!=false);

        switch(sport){
            case "hockey": player= new Hockey(name);break;
            case "football": player = new Football(name);break;
            case "basketball":player = new BasketBall(name);break;
        }
        
        
        
        System.out.println("Enter number of games started: ");
        start=input.nextInt();
        System.out.println("Entered total number of games played in: ");
        tgames=input.nextInt();
        System.out.println("Enter the total games in the season: ");
        sgames=input.nextInt();
        System.out.println("Enter total number of scoring attempts: ");
        shots=input.nextInt();
        System.out.println("Enter total number points scored: ");
        scored=input.nextInt();
        
        System.out.println("Started in "+player.getAvg(start, sgames));
        System.out.println("Played in "+player.getAvg(tgames, sgames));
        System.out.println("Scoring percentage: "+player.getAvg(shots, scored));

    }
}
