
/**
 * Write a description of class Football here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Football extends Sports
{
    // instance variables - replace the example below with your own
    private  int touchdowns, yards;

    /**
     * Constructor for objects of class Football
     */
    public Football(String x)
    {
        super(x);
    }


    public  void questions()
    {
        questions1();
        System.out.print("Enter total number of touchdowns");
        touchdowns = input.nextInt();
        System.out.print("Enter number of yards gained");
        yards = input.nextInt();

    }
    
    public  void print(){
        print1();
        System.out.print("Total number of touchdowns: " + touchdowns);
        System.out.println("Total number of yards: " + yards);
        System.out.println("Number of touchdowns per game: "+getAvg(touchdowns, sgames));
        System.out.println("Number of yards per game: "+getAvg(yards, sgames));
    }

}

