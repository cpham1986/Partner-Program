
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
        System.out.print("Enter total number of touchdowns: ");
        touchdowns = input.nextInt();
        System.out.print("Enter number of yards gained: ");
        yards = input.nextInt();
<<<<<<< HEAD

=======
>>>>>>> d1c1fde59abb03eb402bd13fa4e7e6f0cbfb7d33
    }
    
    public void print(){
        System.out.print("Total number of touchdowns: " + touchdowns);
        System.out.print("Total number of yards gained: " + yards);
        //String.format("%.1g%n", 0.912385);
    }

}

