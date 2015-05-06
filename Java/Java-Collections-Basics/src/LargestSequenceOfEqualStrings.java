import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();	
		String[] arrInput = input.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionOfWord = 0; 

		for (int i = 1; i < arrInput.length; i++) {
			if (arrInput[i].equals(arrInput[i - 1])) {
			counterTemp++;
		} 
		else {
			counterTemp = 1;
		}
		if (counterTemp > counter) {
			counter = counterTemp;
			positionOfWord = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(arrInput[positionOfWord] + " ");
		}
		System.out.println(arrInput[positionOfWord]);
	}
}

