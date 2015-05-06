import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		Matcher emailMatcher = Pattern.compile("[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}").matcher(text);
		while (emailMatcher.find()) {
			System.out.println(emailMatcher.group());
		}
		
	}

}
