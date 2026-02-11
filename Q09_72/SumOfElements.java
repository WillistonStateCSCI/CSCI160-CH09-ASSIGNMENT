/* Method that returns the sum of all the elements in a two-dim array
*  Anderson, Franceschi
*/

public class SumOfElements
{
  public static void main( String [] args ) // Main is included to test your method, do not change it!
  {
    float [][] numbers = { { 1.1f, 1.1f, 1.1f },
                           { 2.2f, 2.2f, 2.2f, 2.2f } };
    System.out.println( "Sum of elements in numbers: "
                         + sumOfElementsInArray( numbers ) );

    float [][] temperatures = new float[7][52];
    System.out.println( "Sum of elements in temperatures: "
                         + sumOfElementsInArray( temperatures ) );
  }

  public static float sumOfElementsInArray( float [][] array )
  {
    //Modify this code to return the sum of the elements in the array.
    return 0;
  }
}