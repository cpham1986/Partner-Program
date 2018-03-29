
/**
 * Write a description of class BasketBall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasketBall extends Sports
{
    // instance variables - replace the example below with your own
    private int dunks, blocks;

    /**
     * Constructor for objects of class BasketBall
     */
    public BasketBall(String x)
    {
        super(x);
        // initialise instance variables
    }


    public void questions()
    {
        System.out.print("Enter total number of dunks");
        dunks = input.nextInt();
        System.out.print("Enter total number of blocks");
        blocks = input.nextInt();
    }
    
    public void print(double total){
         System.out.println("Total number of dunks: " + dunks);
          System.out.println("Total number of blocks: " + blocks);
         System.out.println("Number of dunks per game: "+getAvg(dunks, total));
         System.out.println("Number of blocks per game: "+getAvg(blocks, total));
    }

}
