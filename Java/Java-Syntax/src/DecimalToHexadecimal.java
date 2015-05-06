import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		
		int number = 0;
		String hex;
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.print("Enter a number: ");
			number = scan.nextInt();
			}
			catch(Exception e){
				System.out.println("Invalid entry!");
			}	
		
		hex = Integer.toHexString(number);
		System.out.println("The number in hexadecimal is: " + hex);
	}

}
