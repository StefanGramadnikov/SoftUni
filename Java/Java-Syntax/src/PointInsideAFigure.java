import java.util.Scanner;


public class PointInsideAFigure {

	public static void main(String[] args) {
	
		double pointX = 0, pointY = 0;
		Scanner keyboard = new Scanner(System.in);
		
		try{
			System.out.print("Enter point X and point Y separated with space:");
			pointX = keyboard.nextDouble();
			pointY = keyboard.nextDouble();
			
			System.out.println(pointX + " " + pointY);
			}
			catch(Exception e){
				System.out.println("Invalid entry!");
			}	
		
		if((pointX >= 12.5 && pointX <= 22.5) && (pointY >= 6 && pointY <= 8.5)){
			System.out.println("Inside top rectangle!");
		}
		else if((pointX >= 12.5 && pointX <= 17.5) && (pointY >= 8.5 && pointY <= 13.5)){
			System.out.println("Inside bottom left square!");
		}
		else if((pointX >= 20 && pointX <= 22.5) && (pointY >= 8.5 && pointY <= 13.5)){
			System.out.println("Inside bottom left rectangle!");
		}
		else{
			System.out.println("The point is outside the figures!");
		}
	}

}
