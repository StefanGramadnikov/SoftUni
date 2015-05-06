import java.util.Scanner;


public class TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		
		int firstNumber = 0, secondNumber = 0, thirdNumber = 0;
		Scanner keyboard = new Scanner(System.in);
		
		try{
			System.out.print("Enter the first number: ");
			firstNumber = keyboard.nextInt();
			
			System.out.print("Enter the second number: ");
			secondNumber = keyboard.nextInt();
			
			System.out.print("Enter the third number: ");
			thirdNumber = keyboard.nextInt();
			
			}
			catch(Exception e){
				System.out.println("Invalid entry!");
			}	
		if (firstNumber <= secondNumber && firstNumber <= thirdNumber){
			if(firstNumber == secondNumber){
				System.out.println("The first and second numbers are the smallest: " + firstNumber);
			}
			if(firstNumber == thirdNumber){
				System.out.println("The first and third numbers are the smallest: " + firstNumber);
			}
			else
				System.out.println("The first number is the smallest: " + firstNumber);
		}
		else if(secondNumber <= firstNumber && secondNumber <= thirdNumber){
			if(secondNumber == firstNumber){
				System.out.println("The first and second numbers are the smallest: " + secondNumber);
			}
			if(secondNumber == thirdNumber){
				System.out.println("The second and third numbers are the smallest: " + secondNumber);
			}
			else
				System.out.println("The second number is the smallest: " + secondNumber);
		}
		else if(thirdNumber <= firstNumber && thirdNumber <= secondNumber){
			if(thirdNumber == secondNumber){
				System.out.println("The third and second numbers are the smallest: " + thirdNumber);
			}
			if(thirdNumber == firstNumber){
				System.out.println("The first and third numbers are the smallest: " + thirdNumber);
			}
			else
			System.out.println("The third number is the smallest: " + thirdNumber);
		}
			
	}

}
