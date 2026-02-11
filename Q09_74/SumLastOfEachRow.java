/* Method that returns the sum of the last elements of each row in a two-dim array
*  Anderson, Franceschi
*/

public class SumLastOfEachRow
{
  public static void main( String [] args )// Main is included to test your method, do not change it!
  {
    int [][] numbers1 = { { 3, 3, 3 }, { 2, 2, 2, 2 }, { 4, 4 } };
    System.out.println( "Sum of the elements in the last column of each row of numbers1: "
                        + sumLastElementsOfEachRow( numbers1 ) );

    int [][] numbers2 = { { 5 }, { 2, 2 }, { 4, 4, 4 } };
    System.out.println( "Sum of the elements in the last column of each row of numbers2: "
                        + sumLastElementsOfEachRow( numbers2 ) );
  }

  public static int sumLastElementsOfEachRow( int [][] array )
  {
  //Modify this code to return the sum of the elements in each row
    return 0;
  }

}