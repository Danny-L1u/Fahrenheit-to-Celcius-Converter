package arithmatic;
import java.util.*;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			System.out.print("Input your Farhenheight temperature: "); 
			double farhenheight = in.nextDouble();
			
			double celcius = (farhenheight - 32) * 5/9;
			
			System.out.println("The temperature in Celcius is: " + celcius);
	}

}
