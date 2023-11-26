/**
 * This code takes a title from the user and displays some of its features. 
 */
import java.util.Scanner;

 public class StringFunctionsAndScanner 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in) ;
        System.out.print( "Enter the title:");
        String title = scn.nextLine();
        System.out.println();
        System.out.println(title);
        System.out.println("--------------------------------------");
        
        System.out.print( "Number of characters: " ) ; 
        System.out.println(title.length()); 
        System.out.print( "All lowercase: \"");
        System.out.print(title.toLowerCase());
        System.out.println("\""); 
        System.out.print( "Character at index position 4 : \'");
        System.out.print(title.charAt(4));
        System.out.println( "\'");
        System.out.println( "Title from 3rd character to 5th character (both included): \"" + title.substring(2,5) 
        + "\"");
        System.out.println( "First occurrence of character 'e':\'" + title.indexOf("e") + "\'");
        System.out.println( "Last occurrence of character 'e': \'" + title.lastIndexOf("e") + "\'" ) ;
        
        scn.close(); 
    }
}