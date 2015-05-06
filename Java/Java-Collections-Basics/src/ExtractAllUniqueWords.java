import java.util.Scanner;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().toLowerCase().split("\\W+");
		TreeSet <String> uniqueWords = new TreeSet<>();
		
		for (String word: words) {
			uniqueWords.add(word);
		}
		
		for (String word: uniqueWords) {
			System.out.print(word + " ");
		}
		
	}

}
