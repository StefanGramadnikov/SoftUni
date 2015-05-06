import java.util.Scanner;


public class SequencesOfEqualStrings {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String[] arrInput = input.split(" ");
		
		for (int i = 0; i < arrInput.length - 1; i++){
			System.out.print(arrInput[i] + " ");
			if((!(arrInput[i]).equals(arrInput[i + 1])))
			{
				System.out.println();
			}
		}
		
		System.out.println(arrInput[arrInput.length - 1]);
		
	}

}
