import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class _07DaysBetweenTwoDates {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input two dates in dd-MM-yyyy format: ");
		
		String firstDateToParse = scan.next();
		String secondDateToParse = scan.next();
		
		try{
		Date firstDate = sdf.parse(firstDateToParse);
		Date secondDate = sdf.parse(secondDateToParse);
		
		System.out.println(firstDate);
		System.out.println(secondDate);
		
		int diffInDays = (int) ((firstDate.getTime() - secondDate.getTime()) / (1000 * 60 * 60 * 24));
		
		
		System.out.print("The difference in the two dates in days is " + diffInDays + " days.");
		}
		catch (Exception e){
			System.out.print("Invalid input");
		}
		
		
	}

}
