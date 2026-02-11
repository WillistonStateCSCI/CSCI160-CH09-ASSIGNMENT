/* Method that inverts all the elements in a two-dim array of booleans
*  Anderson, Franceschi
*/

public class InvertAll
{
  public static void main( String [] args )// Main is included to test your method, do not change it!
  {
    boolean [][] answers1 = { { true, false, false, true },
                              { true, true },
                              { false, true },
                              { false, false, false, false, false },
                              { true, false } };

    System.out.println( "Before inverting values" );
    displayArray( answers1 );

    invertAllElements( answers1 );

    System.out.println( "\nAfter inverting values" );
    displayArray( answers1 );
  }

  public static void displayArray( boolean [][] array )
  {
    for ( int i = 0; i < array.length; i++ )
    {
      for ( int j = 0; j < array[i].length; j++ )
      {
        System.out.print( array[i][j] + "\t" );
      }
      System.out.println( );
    }
  }

  public static void invertAllElements( boolean [][] array )
  {
    //Add code here to invert the value of the booleans
  }
}