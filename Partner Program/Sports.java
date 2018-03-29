
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
    public void print(){
        
    }
    
}
