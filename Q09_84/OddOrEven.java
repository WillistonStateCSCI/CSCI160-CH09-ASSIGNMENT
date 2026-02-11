/* Method that checks if the number of elements in an ArrayList is even or odd
*  Anderson, Franceschi
*/

import java.util.ArrayList;

public class OddOrEven
{
  public static void main( String [] args )// Main is included to test your method, do not change it!
  {
    ArrayList<String> words1 = new ArrayList<String>( );
    words1.add( "Hello" );
    words1.add( "World" );

    System.out.println( "Parity of number of elements of words1: " + parity( words1 ) );

    ArrayList<String> words2 = new ArrayList<String>( );
    words2.add( "Programming" );
    words2.add( "is" );
    words2.add( "not a" );
    words2.add( "spectator" );
    words2.add( "sport!" );

    System.out.println( "Parity of number of elements of words2: " + parity( words2 ) );
  }

  public static String parity( ArrayList<String> al )
  {
    //modify this code to return even or odd based on the number of elements in the arraylist.
      return "";
  }
}