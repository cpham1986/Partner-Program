
/**
 * Write a description of class Hockey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hockey extends Sports
{
    // instance variables - replace the example below with your own
    private int assists, checks;

    /**
     * Constructor for objects of class Hockey
     */
    public Hockey(String x, String y)
    {
        super(x,y);
    }

    public void questions()
    {
        System.out.print("Enter total number of assists");
        assists = input.nextInt();
        System.out.print("Enter number of checks");
        checks = input.nextInt();
    }
    
    public void print(){
        System.out.print("print the thing");
    }
}
