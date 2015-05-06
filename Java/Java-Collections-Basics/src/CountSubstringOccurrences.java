import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().toLowerCase();
		String target = scan.next().toLowerCase();
		int index = 0, count = 0; 
		
		while (index < text.length() - target.length() + 1) {
			if (text.substring(index, index + target.length()).equals(target)) {
				count++;
			}
			index++;
		}
		System.out.println(count);
	}

}
