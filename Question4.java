import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

    Scanner in = new Scanner(System.in);
    int userint = in.nextInt();

   
    for (int i = userint; i > 0; i--){

        for (int j = i; j > 0; j--){
          
          System.out.print("*");
          
        }
        System.out.println();
      
    
      
    } 
    
  }
}
