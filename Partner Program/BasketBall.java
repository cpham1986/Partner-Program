
/**
 * Write a description of class BasketBall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasketBall extends Sports
{
    // instance variables - replace the example below with your own
    private   int dunks, blocks;

    /**
     * Constructor for objects of class BasketBall
     */
    public BasketBall(String x)
    {
        super(x);
        // initialise instance variables
    }


    public   void questions()
    {
        questions1();
        System.out.print("Enter total number of dunks");
        dunks = input.nextInt();
        System.out.print("Enter total number of blocks");
        blocks = input.nextInt();
<<<<<<< HEAD
        v2 = input.nextInt();
        System.out.print("Enter total number of blocks: ");
        blocks = input.nextInt();
        System.out.print("some questions about basketball goes here");
        v3 = input.nextInt();
=======
>>>>>>> 69478c9711929dce6f27bc4fb6d3b42ce80d5c9a
    }
    
    public   void print(){
        print1();
         System.out.println("Total number of dunks: " + dunks);
          System.out.println("Total number of blocks: " + blocks);
         System.out.println("Number of dunks per game: "+getAvg(dunks, sgames));
         System.out.println("Number of blocks per game: "+getAvg(blocks, sgames));
    }

}
