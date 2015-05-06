import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
 

public class SortArrayOfStrings {

	public static void main(String[] args) {
		
	    ArrayList<String> myList = new ArrayList<String>();
	    Scanner in = new Scanner(System.in);
	    int number = 1;

	    try{
	    	System.out.println("Enter a number for how many strings you would like to input: ");
		    number = in.nextInt();
		    
	    }
	    catch (Exception e){
	    	System.out.println("Invalid input");
	    	return;
	    }
	   
	    String input;
	    
	    while (myList.size() < number) {
	        System.out.println("Enter a string: ");
	        input = in.next().trim();
	        
	        if (input.isEmpty()) {
	            System.out.println("Empty inputs not accepted!");
	            continue;
	        }
	        if (!myList.add(input))
	           System.out.println("You have already entered this string (" + input + ')');
	        
	    }
	    
	    Collections.sort(myList);
	    System.out.println("The strings sorted alphabeticaly: " + myList);
	}

}
