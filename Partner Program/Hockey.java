
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
    public Hockey(String x)
    {
        super(x);
    }

    public void questions()
    {
        System.out.print("Enter total number of assists");
        assists = input.nextInt();
        System.out.print("Enter number of checks");
        checks = input.nextInt();
    }
    
    public void print(double total){
         System.out.println("Total number of assists: " + assists);
          System.out.println("Total number of checks: " + checks);
         System.out.println("Number of assists per game: "+getAvg(assists, total));
         System.out.println("Number of checks per game: "+getAvg(checks, total));
    }
}
