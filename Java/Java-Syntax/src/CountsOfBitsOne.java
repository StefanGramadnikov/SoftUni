import java.util.Scanner;


public class CountsOfBitsOne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String bin = " ";
		
		try{
			System.out.println("Enter a number: ");
			i = scan.nextInt();
		}
		catch (Exception e)
		{
			System.out.println("Invalid entry");
		}
		
		bin = String.format("%16s", Integer.toBinaryString(i)).replace(' ', '0');
		System.out.println("Binary number is: " + bin);
		System.out.println("Number of one bits = " + Integer.bitCount(i)); 
		
		
	}

}
