import java.text.DecimalFormat;
import java.util.Scanner;


public class _05AngleUnitConverter {

	public static void main(String[] args) {

		double number = 0, result = 0;
		String type = "";
		DecimalFormat df = new DecimalFormat("#.000000"); 
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter input: ");
		 
		 try{	
			 number = reader.nextDouble();
			 type = reader.next();
			 
			 }
		 catch(Exception e){
			 System.out.println("Invalid entry:");
		 }
		 
		 result = converter(number, type);
		 System.out.print(df.format(result));
		 
	}
	public static double converter(double inputNumber, String inputType){
		
		double number = 0;
        
        if(inputType.equals("deg")){
        	
        	System.out.print("The number in degrees converted to radians : ");
                return Math.toRadians(inputNumber);
        }
        else if (inputType.equals("rad")){
        	
    		System.out.print("The number in radians converted to degrees : ");
        		return Math.toDegrees(inputNumber);
        }
        return number;
		
	}
}
