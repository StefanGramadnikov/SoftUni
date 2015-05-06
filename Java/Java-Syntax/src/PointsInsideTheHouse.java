import java.util.Scanner;


public class PointsInsideTheHouse {

	public static void main(String[] args) {
	
		
		double pointX = 0, pointY = 0,
				aX = 12.5, aY = 8.5,
				bX = 22.5, bY = 8.5,
				cX = 17.5, cY = 3.5,
				resultAB, resultAC, resultBC;
		
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
		
		resultAB = ((bX - aX) * (pointY - aY) - (bY - aY) * (pointX - aX));
		resultAC = ((aX - cX) * (pointY - cY) - (aY - cY) * (pointX - cX));
		resultBC = ((cX - bX) * (pointY - bY) - (cY - bY) * (pointX - bX));
		
		
		if((pointX >= 12.5 && pointX <= 17.5) && (pointY >= 8.5 && pointY <= 13.5)){
			System.out.println("Inside bottom left square!");
		}
		else if((pointX >= 20 && pointX <= 22.5) && (pointY >= 8.5 && pointY <= 13.5)){
			System.out.println("Inside bottom right rectangle!");
		}
		else if(resultAB == 0 || resultBC == 0 || resultAC == 0){
			System.out.println("On the line of the triangle");
		}
		else if(resultAB < 0 && resultBC < 0 && resultAC < 0){
			System.out.println("Inside the trianle!");
		}
		else if(resultAB > 0 && resultBC > 0 && resultAC > 0){
			System.out.println("Outside the trianle!");
		}
		else{
			System.out.println("The point is outside the house!");
		}
		
	}
		
	}


