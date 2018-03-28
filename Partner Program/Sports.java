
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
    int AVG, penalty, ps;
    Scanner input=new Scanner(System.in);
    /**
     * Constructor for objects of class Sports
     */
    public Sports(String name, String sport)
    {
        n = name;
        s = sport.toLowerCase();
    }
    public int getAvg(int attempt, int total)
    {
        AVG=(int)(attempt/total);
        return AVG;
    }
    public int PartScore(int assist, int score)
    {
        return ps;
    }
    
    
}
