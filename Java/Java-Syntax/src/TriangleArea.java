import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		
		int aX, aY, bX, bY, cX, cY;
		int area;
		Scanner keyboard = new Scanner(System.in);
		
		try{
			System.out.print("Enter Ax: ");
			aX = keyboard.nextInt();
			
			System.out.print("Enter Ay: ");
			aY = keyboard.nextInt();

			System.out.print("Enter Bx: ");
			bX = keyboard.nextInt();
			
			System.out.print("Enter By: ");
			bY = keyboard.nextInt();
			
			System.out.print("Enter Cx: ");
			cX = keyboard.nextInt();
			
			System.out.print("Enter Cy: ");
			cY = keyboard.nextInt();
			
			area = (((aX * (bY - cY)) + (bX * (cY - aY)) + (cX * (aY - bY))) / 2);
			//Math.round(area);
			
			System.out.print("The area is: " + area);
			}
			catch(Exception e){
				System.out.println("Invalid entry!");
			}	
	}

}
