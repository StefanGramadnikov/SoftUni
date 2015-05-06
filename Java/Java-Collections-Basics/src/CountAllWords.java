import java.util.Arrays;
import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int wordss = 0;
		
		
		String[] words = scan.nextLine().split("[\\W\\d]+");
		System.out.println(words.length);
		
		//S dolnoto re6enie kato podam golemiq primer ot doma6noto gi dokarva do 60 no ne gi printira za6toto scanera o4akva input i ne mojah da namerq re6enie.
		//Molq ako znaete kak da pro4eta celiq tekst i da go vkaram v masiv ili string ili ne6to drugo napi6ete mi go kato komentar :)
		
//		while(scan.hasNextLine()){
//		String[] words = scan.nextLine().split("[\\W\\d]+"); 
//		wordss += words.length;
//		
//		}
//		scan.close();
		
//		System.out.print(wordss);
		
	}

}
