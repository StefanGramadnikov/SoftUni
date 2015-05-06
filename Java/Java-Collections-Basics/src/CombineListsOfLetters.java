import java.util.ArrayList;
import java.util.Scanner;


public class CombineListsOfLetters {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		String[] line1 = scan.nextLine().split(" ");
		String[] line2 = scan.nextLine().split(" ");
		
		ArrayList<Character> list1 = new ArrayList<>();
		for (String s: line1) {
			list1.add(s.charAt(0));
		}
		
		ArrayList<Character> list2 = new ArrayList<>();
		for (String s: line2) {
			list2.add(s.charAt(0));
		}
		
		for (char c: list2) {
			if (!list1.contains(c)){
				list1.add(c);
			}
		}
		
		for (char c: list1) {
			System.out.print(c + " ");
		}
		
	}

}
