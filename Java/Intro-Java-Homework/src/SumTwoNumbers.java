import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		
		int firstNumber, secondNumber;
		
		try{
			System.out.println("Enter the first number");
			Scanner keyboard = new Scanner(System.in);
			firstNumber = keyboard.nextInt();
			
			System.out.println("Enter the second number");
			secondNumber = keyboard.nextInt();
			int sum = firstNumber + secondNumber;
			System.out.println(sum);
		}
		catch (Exception e){
			System.out.println("Invalid entry!");
		}
	}

}
