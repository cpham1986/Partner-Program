
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
        int start, tgames, sgames;
        Scanner input = new Scanner(System.in);
        String name, sport;
        Sports player = new Sports("", "");;
        System.out.println("Enter the name of the athlete: ");
        name=input.nextLine();

        System.out.println("Enter sport: ");
        sport=input.nextLine();

        do{
            System.out.println("Enter sport: ");
            sport=input.nextLine();
        } while(sport.equalsIgnoreCase("hockey")!=false||sport.equalsIgnoreCase("football")!=false||sport.equalsIgnoreCase("basketball")!=false);

        switch(sport){
            case "hockey": player= new Hockey(name, sport);break;
            case "football": player = new Football(name, sport);break;
            case "basketball":player = new BasketBall(name, sport);break;
        }
        System.out.println("Enter number of games started: ");
        start=input.nextInt();
        System.out.println("Entered total number of games played in: ");
        tgames=input.nextInt();
        System.out.println("Enter the total games in the season: ");
        sgames=input.nextInt();

        
        System.out.println("Started in "+player.getAvg(start, sgames));
        System.out.println("Played in "+player.getAvg(tgames, sgames));
        

    }
}
