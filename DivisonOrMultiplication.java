/**
 * In this implementation you can choose to divide or multiplicate
 */
import java.util.Scanner;
public class DivisonOrMultiplication 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        String divison = "d";
        String multiplying = "m";
        boolean continuing = true ;
        int sum = 0;

        while (continuing)
        {    
            System.out.print("Enter input n: ");
            int number = scn.nextInt();
            System.out.print("Please choose the operation. Division or Multiplication 'd' or 'm'?: ");
            String choose = scn.next();
            int countOfProcess = 0;
                
            if (choose.equals(divison))
            {
                System.out.print("Enter the multiplier or divisor that is a multiple of two: ");
                int a = scn.nextInt();
                int b = (int)(Math.log(a) / Math.log(2)) ;
                int divided = number >> b ;
                
                while (divided > 0)
                {
                    int remainder = divided % 2;
                    divided = divided / 2;
                    countOfProcess++ ;
                    if (remainder == 1)
                    {
                        sum = sum + (int)Math.pow(10, (countOfProcess - 1)) ;
                    }
                }
                
                System.out.println("0b" + sum);
            }
            
            else if (choose.equals(multiplying))
            {
                System.out.print("Enter the multiplier or divisor that is a multiple of two: ");
                int a = scn.nextInt();
                int b = (int)(Math.log(a) / Math.log(2)) ;
                int multiplied = number << b ;

                while (multiplied > 0)
                {
                    int remainder = multiplied % 2;
                    multiplied = multiplied / 2;
                    countOfProcess++ ;
                    if (remainder == 1)
                    {
                        sum = sum + (int)Math.pow(10, (countOfProcess - 1));
                    }
                }
                
                System.out.println("0b" + sum);
            }
            sum = 0 ;

            System.out.print("Do you want to do another operation? 'y' (yes) or 'n' (no): ");
            String str = scn.next();

            if (str.equals("n"))
            {
                continuing = false ;
            }
        }
    scn.close();
    } 
}
