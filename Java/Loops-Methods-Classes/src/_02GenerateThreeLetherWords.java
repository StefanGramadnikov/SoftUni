import java.util.Scanner;


public class _02GenerateThreeLetherWords {

	 public static void main(String[] args) {

		 Scanner reader = new Scanner(System.in);
		 String[] alphabet = new String[] {" "};
		 
		 System.out.println("Enter letters: ");
		 
		 try{
		 String line = reader.nextLine();
		 alphabet = line.split("");
		 for (int i = 0; i < alphabet.length; i++){
			 if(alphabet[i] == ""){
				 System.out.print("Invalid entry!");
				 break;
			 }
		 }
		 }
		 catch(Exception e){
			 System.out.println("Invalid entry:");
		 }
		 StringExcersise.possibleStrings(3, alphabet,"");
		 
	    }
	 
	 static class StringExcersise {

		    public static void possibleStrings(int maxLength, String[] alphabet, String curr) {

		        if(curr.length() == maxLength) {
		            System.out.println(curr);

		        } else {
		            for(int i = 0; i < alphabet.length; i++) {
		                String oldCurr = curr;
		                curr += alphabet[i];
		                possibleStrings(maxLength,alphabet,curr);
		                curr = oldCurr;
		            }
		        }
		    }
	 }

}
