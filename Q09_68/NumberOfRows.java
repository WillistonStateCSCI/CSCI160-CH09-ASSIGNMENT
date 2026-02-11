/* Method that returns the number of rows in a two-dimensional array
*  Anderson, Franceschi
*/

public class NumberOfRows
{
  public static void main( String [] args ) // Main is included to test your method, do not change it!
  {
    double [][] numbers = { { 1, 1, 1 }, { 2, 2, 2, 2 } };
    System.out.println( "Number of rows in numbers: "
                         + numberOfRowsInArray( numbers ) );

    double [][] temperatures = new double[7][52];
    System.out.println( "Number of rows in temperatures: "
                         + numberOfRowsInArray( temperatures ) );
  }

  public static int numberOfRowsInArray( double [][] array )
  {
    //Modify this portion of code to properly return the number of rows in the array.
    return 0;
  }
}