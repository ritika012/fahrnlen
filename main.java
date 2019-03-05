package temp;
import java.util.Scanner;
public class main {

	public static void main(String[] args)
	{
		fahrn ob = new fahrn();
		length ob1= new length();
		
		int choice=0;
		System.out.println("enter the choice");
		Scanner in=new Scanner(System.in);
		choice=in.nextInt();
		if(choice==1)
		{
			
			ob.converttocelcius();
		}
		
		if(choice==2)
		{
			
			ob.converttofahrn();
		}
		if(choice==3)
		{
			
			ob1.converttofoot();
		}
		if(choice==4)
		{
			
			ob1.converttocm();
		}
 }
}
