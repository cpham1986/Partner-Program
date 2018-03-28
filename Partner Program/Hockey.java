
/**
 * Write a description of class Hockey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hockey extends Sports
{
    // instance variables - replace the example below with your own
    private int goals, v2, v3;

    /**
     * Constructor for objects of class Hockey
     */
    public Hockey(String x, String y)
    {
        super(x,y);
    }

    public void questions()
    {
        System.out.print("Entered total number of goals");
        goals = input.nextInt();
        System.out.print("Enter total number of assists");
        v2 = input.nextInt();
        System.out.print("some questions about hockey goes here");
        v3 = input.nextInt();
    }
    
    public void print(){
        System.out.print("print the thing");
    }
}
