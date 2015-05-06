import java.util.Scanner;


public class LongestIncreasingSequence {

	public static void main(String[] args) {
		
		
		
		//Ne uspqh da izkaram nai dulgata poredica no moje da se vidi kakva mi be6e ideqta :(

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strArray = input.split(" ");
		int[] numbers = new int[strArray.length];
		int sequenceLenght = 0;
		int startingPosition = 0;
		int tempSequenceLenght = 0;
		boolean startNew = true;
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = Integer.parseInt(strArray[i]);
		}
		
		for (int j = 1; j < numbers.length;j++){
			
			if(numbers[j - 1] == numbers[j]){
				System.out.println(numbers[j - 1]);
			}
			else{
				startNew = false;
			System.out.print(numbers[j - 1] + " ");
			tempSequenceLenght++;
			if(sequenceLenght < tempSequenceLenght){
				sequenceLenght = tempSequenceLenght;
			}
			}
			if (numbers[j - 1] > numbers[j]){
				System.out.println();
				startNew = true;
				}
			if (startNew){
				startingPosition = j - 1;
				tempSequenceLenght = 0;
			}
		}
		if (numbers[numbers.length - 1] > numbers[numbers.length - 2]){
			System.out.println(numbers[numbers.length - 1]);
		}
		
		for (int j = startingPosition; j < sequenceLenght; j++){
			System.out.println(numbers[j]); 
		}
		
	}

}
