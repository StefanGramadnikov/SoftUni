import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class MostFrequentWord {

	
	public static void main(String[] args) {
	
				Scanner scan = new Scanner(System.in);
				String[] words = scan.nextLine().toLowerCase()
						.split("([.,()!?:;'\"-]|\\s)+");
				Map<String, Integer> wordsTree = new TreeMap<>();

				
				int maxCount = 0;
				for (String word : words) {
					Integer count = wordsTree.get(word);
					if (count == null) {
						count = 0;
					}
					if (count + 1 > maxCount) {
						maxCount = count + 1;
					}
					wordsTree.put(word, count + 1);
				}

				
				for (Map.Entry<String, Integer> word : wordsTree.entrySet()) {
					if (word.getValue() == maxCount) {
						System.out.printf("%s - > %d times \n", word.getKey(),
								word.getValue());
					}
				}
		
	}

}
