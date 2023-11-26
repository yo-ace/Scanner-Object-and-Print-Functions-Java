/**
 * Below is a simple usage of Scanner object and If-Else logic example. I recommend get used to writing neatly. 
 */
import java.util.Scanner;
public class ScannerAndIfElseLogic 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in) ;
        System.out.print( "Enter your credit units: ");
        int studentCreditUnit = scn.nextInt() ;
        System.out.print( "Enter your CGPA: ");
        double cumulativeGradePointAverage = scn.nextDouble() ; // (CGPA)
        
        if( studentCreditUnit > 120 )
        {
            if (cumulativeGradePointAverage > 2.00 )
            {
                System.out.println("The graduation requirements are satisfied.");
            }
            else // cumulativeGradePointAverage <= 2.00 
            {
                System.out.println( "The CGPA is not sufficient.");
                System.out.println( "The graduation requirements are NOT satisfied.");
            }
        }
        else // studentCreditUnit <= 120
        {
            System.out.println( "The credit units are not sufficient. ");
            System.out.println( "The graduation requirements are NOT satisfied.");
        }

    scn.close();
    }
}