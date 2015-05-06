import java.util.Random;



public class DeckOfCards {

	public static void main(String[] args) {
		
		Random diceRoller = new Random();
		
		int[] deck = new int[52];
		String[] ranks = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		char[] suites = new char[]{'♥','♦','♠','♣'};
		
		for (int i = 0; i < deck.length; i++) {
		      deck[i] = i;
		    }
		
		 for (int i = 0; i < 5 ; i++) {
			 
		      char suit = suites[deck[i]];
		      String rank = ranks[deck[i]];
		      System.out.print(rank +  suit);
		      
				 }
//		  
//		    	        PDDocument doc = null;
//		    	        PDPage page = null;
//
//		    	       try{
//		    	           doc = new PDDocument();
//		    	           page = new PDPage();
//
//		    	           doc.addPage(page);
//		    	           PDFont font = PDType1Font.HELVETICA_BOLD;
//
//		    	           PDPageContentStream content = new PDPageContentStream(doc, page);
//		    	           content.beginText();
//		    	           content.setFont( font, 12 );
//		    	           content.moveTextPositionByAmount( 100, 700 );
//		    	           content.drawString(rank + suit);
//
//		    	           content.endText();
//		    	           content.close();
//		    	          doc.save("PDFWithText.pdf");
//		    	          doc.close();
//		    	    } catch (Exception e){
//		    	        System.out.println(e);
//		    	    }
		 }
	}
}