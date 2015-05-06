import java.io.File;
import java.util.Scanner;


public class _08SumNumbersFromATextFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = new int [100];
		int m = 0 , result = 0;
		
		try{
		scan = new Scanner(new File("src/input.txt"));
		
		while(scan.hasNextInt())
		{
		     numbers[m++] = scan.nextInt();
		}
		for (int i = 0; i < numbers.length; i++){
			result += numbers[i];
		}
		if (result < 1){
			System.out.print("Empty file");
		}
		else 
			System.out.print(result);
		}
	catch(Exception e){
		System.out.println("Invalid input");
	}
	}
}
