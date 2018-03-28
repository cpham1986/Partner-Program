
/**
 * Write a description of class BasketBall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasketBall extends Sports
{
    // instance variables - replace the example below with your own
    private int dunks, v2, v3;

    /**
     * Constructor for objects of class BasketBall
     */
    public BasketBall(String x, String y)
    {
        super(x,y);
        // initialise instance variables
    }


    public void questions()
    {
        System.out.print("Enter total number of dunks");
        dunks = input.nextInt();
        System.out.print("Enter total number of blocks");
        v2 = input.nextInt();
        System.out.print("some questions about basketball goes here");
        v3 = input.nextInt();
    }
    
    public void print(){
        System.out.print("print the thing");
    }

}
