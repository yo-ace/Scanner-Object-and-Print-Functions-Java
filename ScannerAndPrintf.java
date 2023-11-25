/**
 * This java file includes scanner and printf usage.  
 */
import java.util.Scanner ;
public class Lab02_Q2
{
    public static void main(String[] args) 
    {
        final double SITE_WORK = 15903 ; // following is dollars
        final double FOUNDATIONS = 25671 ;
        final double FRAMING = 41123 ;
        final double EXTERIOR = 33066 ;
        final double UTILITY = 32746 ;
        final double INTERIOR_FINISHES = 67939 ;
        final double OUTDOOR = 16591 ;
        final double TOTAL = 237760 ; // COST OF THE HOUSE 
        final double UNEXPECTED_COSTS = TOTAL - ( SITE_WORK + FOUNDATIONS + FRAMING + EXTERIOR + UTILITY + INTERIOR_FINISHES + OUTDOOR) ;

        final double P_SITE_WORK = SITE_WORK / TOTAL * 100 ; // following are percentages 
        final double P_FOUNDATIONS = FOUNDATIONS / TOTAL * 100 ;
        final double P_FRAMING = FRAMING / TOTAL * 100 ; 
        final double P_EXTERIOR = EXTERIOR / TOTAL * 100 ;
        final double P_UTILITY = UTILITY / TOTAL * 100 ;
        final double P_INTERIOR_FINISHES = INTERIOR_FINISHES / TOTAL * 100 ;
        final double P_OUTDOOR = OUTDOOR / TOTAL * 100 ;
        final double P_UNEXPECTED_COSTS = UNEXPECTED_COSTS / TOTAL * 100 ;

        Scanner scan = new Scanner(System.in) ;
        System.out.print( "Enter the cost of building a house in USD: ") ;
        double costOfAHouse = scan.nextDouble() ;
        System.out.println();
        
        double siteWork = costOfAHouse * P_SITE_WORK / 100; 
        double foundation = costOfAHouse * P_FOUNDATIONS / 100 ;
        double framing = costOfAHouse * P_FRAMING / 100 ;
        double exterior = costOfAHouse * P_EXTERIOR / 100 ;
        double utility = costOfAHouse * P_UTILITY / 100 ;
        double interiorFinishes = costOfAHouse * P_INTERIOR_FINISHES / 100 ;
        double outdoor = costOfAHouse * P_OUTDOOR / 100 ;
        double unexpectedCosts = costOfAHouse * P_UNEXPECTED_COSTS / 100 ;

        System.out.println( "*************************************************") ;
        System.out.println("*****\t House Cost Distribution Table \t    *****") ;
        System.out.println( "*************************************************" ) ;
        
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Site Work", (int) P_SITE_WORK, siteWork);
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Foundations", (int) P_FOUNDATIONS, foundation);
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Framing", (int) P_FRAMING, framing);
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Exterior", (int) P_EXTERIOR, exterior);
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Utility", (int) P_UTILITY, utility);
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Interior Finishes", (int) P_INTERIOR_FINISHES, interiorFinishes);
        System.out.printf("* %-20s %%%-10d%-10.2f\t*\n" , "Outdoor", (int) P_OUTDOOR, outdoor);
        System.out.printf("* %-20s %%%-11d%-9.2f\t*\n" , "Unexpected Costs", (int) P_UNEXPECTED_COSTS, unexpectedCosts );
        System.out.printf("* %-20s %19.2f\t*\n" , "Total", costOfAHouse ) ;
        
        
        System.out.println( "*************************************************") ;

        scan.close() ;
    }
}
