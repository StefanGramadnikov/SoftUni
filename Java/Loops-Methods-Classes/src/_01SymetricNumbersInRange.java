import java.util.Scanner;


public class _01SymetricNumbersInRange {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int start = 0, end = 0, firstDigit = 0, lastDigit = 0;
		
		try{
			System.out.print("Enter start and end (0 ≤ start ≤ end ≤ 999)");
			start = keyboard.nextInt();
			end = keyboard.nextInt();
			
			}
			catch(Exception e){
				System.out.println("Invalid entry!");
			}
		
		for (int i = start; i <= end; i++){
		
			firstDigit = (i / 100) % 10;
			lastDigit = i % 10;
			
			if (i <= 11 && i != 10){
				System.out.print(i + " ");
			}
			else if (i % 11 == 0 && i < 100){
				System.out.print(i + " ");
			}
			else if (firstDigit == lastDigit){
				System.out.print(i + " ");
			}
			
		}
		
	}

}
