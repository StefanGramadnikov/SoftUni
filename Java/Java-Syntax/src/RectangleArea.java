import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		
		int length, width, area;
		
		Scanner keyboard = new Scanner(System.in);
		
		try{
		System.out.print("Enter the lengtg: ");
		length = keyboard.nextInt();
		
		System.out.print("Enter the width: ");
		width = keyboard.nextInt();
		
		area = (length * width);
		System.out.print("The area is: " + area);
		}
		catch(Exception e){
			System.out.println("Invalid entry!");
		}	
		
		
	}

}
