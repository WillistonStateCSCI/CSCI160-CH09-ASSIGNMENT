/* Method that returns the number of columns with n elements in a two-dim array
*  Anderson, Franceschi
*/

import java.util.Scanner;

public class NumberOfColumnsWithN
{
  public static void main( String [] args ) // Main is included to test your method, do not change it!
  {
    Scanner scan = new Scanner( System.in );
    System.out.print( "Enter a number of elements > " );
    int number = scan.nextInt( );

    char [][] grades1 = { { 'A', 'B', 'C', 'D' },
                          { 'A', 'B' },
                          { 'A', 'B' },
                          { 'A', 'B', 'C', 'D', 'F' },
                          { 'A', 'B' } };

    System.out.println( "Number of columns with " + number + " elements in grades1: "
                       + numberOfColumnsWithNElements( grades1, number ) );

    char [][] grades2 = new char[2][5];
    System.out.println( "Number of columns with " + number + " elements in grades2: "
                       + numberOfColumnsWithNElements( grades2, number ) );

    char [][] grades3 = new char[7][5];
    System.out.println( "Number of columns with " + number + " elements in grades3: "
                       + numberOfColumnsWithNElements( grades3, number ) );
    scan.close();
  }

  public static int maxNumberOfColumns( char [][] array )
  {
    //Modify this code to return the max number of columns
    return 0;
  }

  public static int numberOfColumnsWithNElements( char [][] array, int n )
  {
    //Modify this code to return the number of columns with N elements
    return 0;
  }
}