/* Method that returns the percentage of false elements
*  in a two-dimensional array of booleans
*  Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class CountFalsePercentage
{
  public static void main( String [] args ) // Main is included to test your method, do not change it!
  {
    DecimalFormat percentFormat = new DecimalFormat( "#0.00%" );

    boolean [][] answers1 = { { true, false, false, true },
                              { true, true },
                              { false, true },
                              { false, false, false, false, false },
                              { true, false } };

    System.out.println( "Percentage of false values in answers1: "
                        + percentFormat.format( computeFalsePercentage( answers1 ) ) );
  }

  public static double computeFalsePercentage( boolean [][] array )
  {
    //Modify this code to return the percentage of falses in the array
    return 0.0;
  }
}