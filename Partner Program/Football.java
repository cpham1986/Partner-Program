
/**
 * Write a description of class Football here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Football extends Sports
{
    // instance variables - replace the example below with your own
    private int touchdowns, yards;

    /**
     * Constructor for objects of class Football
     */
    public Football(String x, String y)
    {
        super(x,y);
    }


    public void questions()
    {
        System.out.print("Enter total number of touchdowns");
        touchdowns = input.nextInt();
        System.out.print("Enter number of yards gained");
        yards = input.nextInt();

    }
    
    public void print(){
        System.out.print("print the thing");
    }

}

