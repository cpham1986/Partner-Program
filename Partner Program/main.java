
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
        double start, tgames, sgames, shots, scored;
        Scanner input = new Scanner(System.in);
        String name, sport;
        Sports player = new Sports("", "");;
        System.out.println("Enter the name of the athlete: ");
        name=input.nextLine();


        do{
            System.out.println("Enter sport: ");
            sport=input.nextLine();
        } while(sport.equalsIgnoreCase("hockey")!=true);
        switch(sport){
            case "hockey": player= new Hockey(name, sport);break;
            case "football": player = new Football(name, sport);break;
            case "basketball":player = new BasketBall(name, sport);break;
        }
        System.out.println("Enter number of games started: ");
        start=input.nextDouble();
        System.out.println("Entered total number of games played in: ");
        tgames=input.nextDouble();
        System.out.println("Enter the total games in the season: ");
        sgames=input.nextDouble();
        System.out.println("Enter total number of scoring attempts: ");
        shots=input.nextDouble();
        System.out.println("Enter total number points scored: ");
        scored=input.nextDouble();
        
        System.out.println("Started in "+player.getAvg(start, sgames)+"%");
        System.out.println("Played in "+player.getAvg(tgames, sgames)+"%");
        System.out.println("Scoring percentage: "+player.getAvg(scored, shots)+"%");

    }
}
