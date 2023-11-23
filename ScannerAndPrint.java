/**
 * This program aims to show the basic usage of print, 
 * println, printf commands and the scanner object. Note
 * that you need to import the scanner class from the library
 * in order to work with the scanner object. I recommend you 
 * to get yourself used to writing neatly and commenting. 
 */
import java.util.Scanner ;
public class Lab02_Q1 
{
    public static void main(String[] args) 
    {
        Scanner value = new Scanner(System.in); // you can read other things -such as files- with a scanner, by writing "System.in", we specify that we read the terminal.
        System.out.print( "Enter length of the semi major axis of the ellipse: "); // println ends the line after printing whereas print command does not.
        double semiMajor = value.nextDouble(); // careful with your implementation, note that in here we assume the user enters a double and not a string for example. Else this gives an exception.
        System.out.print("Enter length of the semi minor axis: ");
        double semiMinor = value.nextDouble();
        
        final double pi = Math.PI ; // declare with final if you dont want a value to be changed (in this case pi is always pi, we do not change it.)
        double area = pi * semiMajor * semiMinor ;
        double circumference = 2 * pi * Math.sqrt((semiMajor*semiMajor+semiMinor*semiMinor) / 2) ;

        System.out.print( "\nThe area of the ellipse is \t\t:\t") ;
        System.out.printf( "%.3f%n", area); // use printf function to organize the data you want to print in terminal

        System.out.print( "The circumference of the ellipse is ~ \t:\t" ) ;
        System.out.printf( "%.3f%n", circumference ) ;
        
        System.out.print( "\nEnter the length of the sides:");
        double length = value.nextDouble();
        System.out.println("");
        System.out.println("The length of the sides: " + length );

        area = length * length * Math.sqrt(3) /  4 ;
        circumference = 3 * length ; 
        double height = length * Math.sqrt(3) / 2 ;
        
        System.out.print("The area of the triangle: " ) ;
        System.out.printf( "%.3f%n", area);
        System.out.println("The circumference of the triangle: " + circumference) ;
        System.out.print("The height of the triangle: " );
        System.out.printf("%.3f%n", height);

        value.close(); // remember to close the scanner (it is not a crucial point, but it is annoying to see "Resource leak:...")
    }
}
