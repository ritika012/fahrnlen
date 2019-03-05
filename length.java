package temp;

import java.util.Scanner;

public class length {
	Scanner t = new Scanner(System.in);

	public int converttofoot() {
		// TODO Auto-generated method stub
    double fo,cm;
    System.out.println("Enter length in cm");
    cm=t.nextInt();
    	 fo = (1/30.48)* cm;
    	 System.out.println("length in foot = " + fo);
    	 return 0;
	}
     public int converttocm()
     {
    	double fo,cm;
    	System.out.println("Enter length in foot");
    	fo=t.nextInt();
    	 cm=30.48*fo;
    	 System.out.println("length in cm = " + cm);
    	 return 0;
     }
}
