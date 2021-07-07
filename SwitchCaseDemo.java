package inspi.java;
import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a value...");
		int i=scan.nextInt();
		
		switch(i)
		{			
			case 100:
			{
				System.out.println("the value is 100....");
				break;
			}
			case 200:
			{
				System.out.println("the value is 200.....");
				break;
			}
			default:
			{
				System.out.println("the value entered should either 100 or 200");
			}
				
		}
	}

}
