/* Method that returns the number of elements in a two-dimensional array
*  Anderson, Franceschi
*/

public class NumberOfElements
{
  public static void main( String [] args )  // Main is included to test your method, do not change it!
  {
    float [][] numbers = { { 1.1f, 1.1f, 1.1f },
                           { 2.2f, 2.2f, 2.2f, 2.2f } };
    System.out.println( "Number of elements in numbers: "
                         + numberOfElementsInArray( numbers ) );

    float [][] temperatures = new float[7][52];
    System.out.println( "Number of elements in temperatures: "
                         + numberOfElementsInArray( temperatures ) );
  }

  public static int numberOfElementsInArray( float [][] array )
  {
    //Modify this code to properly return the number of elements in the array.
    return 0;
  }
}