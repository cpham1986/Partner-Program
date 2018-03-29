
/**
 * Write a description of class Sports here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Sports
{
    String n, s;
    double start, tgames, sgames, shots, scored;
    double temp;
    int AVG, penalty, ps;
    Scanner input=new Scanner(System.in);
    /**
     * Constructor for objects of class Sports
     */
    public Sports(String name)
    {
        n = name;
    }
    public double getAvg(double attempt, double total)
    {
        temp=(double)(attempt/total);
        temp*=100;
        AVG=(int)temp;
        return temp;
    }
    public int PartScore(int assist, int score)
    {
        return ps;
    }
    public void questions1()
    {
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
    }
    
    public void print1(){
         System.out.println("Started in "+getAvg(start, sgames)+"%");
        System.out.println("Played in "+getAvg(tgames, sgames)+"%");
        System.out.println("Scoring percentage: "+getAvg(scored, shots)+"%");

    }
}
