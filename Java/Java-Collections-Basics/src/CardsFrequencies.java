import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class CardsFrequencies {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] cards = input.nextLine().split("\\W+");
		double singleCardWeigth = 100.0 / cards.length;
		LinkedHashMap<String, Double> cardFrequences = new LinkedHashMap<>();
		
		for (String card : cards) {
			if (cardFrequences.containsKey(card)) {
				cardFrequences.put(card, cardFrequences.get(card) + singleCardWeigth);
			}
			else {
				cardFrequences.put(card, singleCardWeigth);
			}
		}
		
		for (java.util.Map.Entry<String, Double> pair : cardFrequences.entrySet()) {
				System.out.printf("%s -> %.2f%%", pair.getKey(), pair.getValue());
				System.out.println();
		}
		
	}

}
