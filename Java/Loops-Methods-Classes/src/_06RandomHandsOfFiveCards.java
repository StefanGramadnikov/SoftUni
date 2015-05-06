import java.util.Random;
import java.util.Scanner;


public class _06RandomHandsOfFiveCards {

	public static void main(String[] args) {
	
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] ranks = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		char[] suites = new char[]{'♥','♦','♠','♣'};
		int n = 0;
		
		try{
			System.out.println("Enter how many hands you would like to be printed: ");
			n = scan.nextInt();
		}
		catch (Exception e){
			System.out.print("Invalid input!");
		}
		
			for	(int i = 0; i < n; i++){
				System.out.println(ranks[random.nextInt(ranks.length)] + suites[random.nextInt(suites.length)] + 
						ranks[random.nextInt(ranks.length)] + suites[random.nextInt(suites.length)] + 
						ranks[random.nextInt(ranks.length)] + suites[random.nextInt(suites.length)] +
						ranks[random.nextInt(ranks.length)] + suites[random.nextInt(suites.length)] +
						ranks[random.nextInt(ranks.length)] + suites[random.nextInt(suites.length)]);
			}
	}

}
