import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {

		int a = 1;
		double b = 0, c = 0;
		String hexA, binary;
		Scanner keyboard = new Scanner(System.in);
		try{
			System.out.print("Enter the first number: ");
			a = keyboard.nextInt();
			}
		catch(Exception e){
				System.out.println("Invalid entry!");
			}
		if(a < 0 || a > 500){
			System.out.println("Number is not between 0 and 500!");
			return;
			}
		try{
			System.out.print("Enter the second number: ");
			b = keyboard.nextDouble();
			System.out.print("Enter the third number: ");
			c = keyboard.nextDouble();
		}
		catch (Exception e){
			System.out.println("Invalid entry");
		}
		hexA = Integer.toHexString(a);
		binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		System.out.printf("%-10s%10s%s%10.2f%s%-10.3f%s","|" + hexA ,"|" + binary,"|",b,"|",c,"|");
	}
}


