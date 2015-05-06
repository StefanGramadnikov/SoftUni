import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		
		
		//v tazi zada4a ima su6tiq problem kato vuv minalata ne moga da namerq na4in da pro4eta celoq input;
		
		Scanner scan = new Scanner(System.in);
		String[] text = scan.nextLine().toLowerCase().split("\\W+");
		String targetWord = scan.next().toLowerCase();
		int count = 0;
		for (String word : text) {
			if (word.equals(targetWord)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
