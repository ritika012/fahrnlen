package temp;
import java.util.*;
public class fahrn {
	Scanner p = new Scanner(System.in);
	public int converttocelcius() {
	    float F,C;
	    //Scanner p = new Scanner(System.in);
	 
	    System.out.println("Enter temperature in Fahrenheit");
	     F= p.nextInt();
	 
	    C= ((F- 32)*5)/9;
	 
	    System.out.println("temperature in Celsius = " + C);
	    return 0;
	  }
	public int converttofahrn()
	{
		double C,F;
		System.out.println("Enter temperature in Celcius");
		//Scanner t = new Scanner(System.in);
		C= p.nextDouble();
		  F=(( C *9)/5) + 32;
		  System.out.println("temperature in Fahrenheit = " + F);
		return 0;
	}
	
}
