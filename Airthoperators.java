package revision;
import java.util.Scanner;
public class Airthoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter x value..:");
		int x=scan.nextInt();
		
		System.out.println("Please Enter y Value..:");
		int y=scan.nextInt();
		
		int add=x+y;
		System.out.println("Addtion..:"+add);
		
		int sub=x-y;
		System.out.println("Subtraction..:"+sub);
		
		int mul=x*y;
		System.out.println("Multi...:"+mul);
		
		int div=x/y;//will return quotient of the division
		System.out.println("div...:"+div);
		
		int reminder=x%y;//will return reminder of the division
		System.out.println("Reminder..:"+reminder);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		int n=10;
		System.out.println(n);//10
		System.out.println(n++);//10 - first prints then increment - post increment
		System.out.println(n);//11
		
		System.out.println(".................................");
		n=10;
		System.out.println(n);//10
		System.out.println(++n);//11 - first increments then prints - pre increment
		System.out.println(n);//11
		//repeat the same for --n and n--
		//pre decrement and post decrement
		//n=n+1 or n=n-1
		
		//how to add a number other than 1
		//n=n+10;
		n=10;
		n+=10;//n=n+10
		System.out.println(n);//20
		n=10;
		n-=10;//n=n-10;
		System.out.println(n);//0
		n=10;
		n*=10;//n=n*10;
		System.out.println(n);//100
		n=10;
		n/=10;//n=n/10;
		System.out.println(n);//1
		n=10;
		n%=10;//n=n%10;
		System.out.println(n);//0
	}

}
