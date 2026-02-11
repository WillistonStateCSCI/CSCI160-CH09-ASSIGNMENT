/* Method that concatenates the elements of each row
*  in a two-dimensional array
*  Anderson, Franceschi
*/

public class ConcatenatePerRow
{
  public static void main( String [] args ) // Main is included to test your method, do not change it!
  {
    char [][] letters = { { 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' },
                          { 'i', 's' },
                          { 'n', 'o', 't' },
                          { 'a' },
                          { 's', 'p', 'e', 'c', 't', 'a', 't', 'o', 'r' },
                          { 's', 'p', 'o', 'r', 't', '!' } };

    String [] concat = concatenateColumnsPerRow( letters );

    System.out.println( "The resulting array is:" );
    displayArray( concat );
  }

  public static String [] concatenateColumnsPerRow( char [][] array )
  {
    //Modify this code to concatenate all columns in a row;
    return null;
  }

  public static void displayArray( String [] array )
  {
    for ( int i = 0; i < array.length; i++ )
      System.out.println( array[i] );
  }
}