/* Method that returns the average of all the elements
*  in a two-dimensional array of ints
*  Anderson, Franceschi
*/

public class AverageAll
{
  public static void main( String [] args )// Main is included to test your method, do not change it!
  {
    int [][] numbers1 = { { 3, 3, 3 }, { 2, 2, 2, 2 }, { 4, 4 } };
    System.out.println( "Average of all the elements of numbers1: "
                        + averageAllElements( numbers1 ) );

    int [][] numbers2 = { { 5 }, { 2, 2 }, { 4, 4, 4 } };
    System.out.println( "Average of all the elements of numbers2: "
                        + averageAllElements( numbers2 ) );
  }

  public static double averageAllElements( int [][] array )
  {
    //Modify this code to calculate the average of all the elements in the array
    return 0.0;
  }

}