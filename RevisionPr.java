package inspi.java;
import java.util.Scanner;
public class RevisionPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int _age_;
		int a$ge;
		int $age;
		int ag2e;
		
		//invalid identifiers
	//	int 2age;//cannot start a name with a number
	//	int #age;//other than $ and _ no other special character is accepted
	//	int a g e;//you cannot have space
	//	int switch;//you cannot use keywords
		
		//initializing and casting - Number types
		byte b=100;
		short s=b;
		int i=s;
		long l=i;
		
		//reverse
		long ll=257;//long is 64 bit
		System.out.println("long value..:"+ll);
		int ii=(int)ll;//int is 32 bit
		System.out.println("int value..:"+ii);
		short ss=(short)ii;//short is 16 bit
		System.out.println("short value..:"+ss);
		byte bb=(byte)ss;//byte can only accept values between -128 and 127
		System.out.println("byte value..:"+bb);//divides the number by 256 and assigns the reminder
		//we loose precision when higher data types are casted with lower types
		
		//FLOAT CASTING
		//float f=100.23f;//32 bit
		double d=132.34;//32 bit
		System.out.println("double value..:"+d);
		float f=(float)d;
		System.out.println("float value.."+f);
		
		int myfloatint=(int)f;
		System.out.println(myfloatint);//i will loose the decimal points
		
		//CHARACTER
		char ch='a';
		int mycharint=(int)ch;
		System.out.println(mycharint);//this will print the ascii value..
		
		int mychar=97;
		char myintchar=(char)mychar;
		System.out.println(myintchar);
		
		//Operators
		//arithmetic operators
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter x value..:");
		int x=scan.nextInt();
		System.out.println("Please enter z value..:");
		int z=scan.nextInt();
		
		int add=x+z;
		System.out.println("Addition..:"+add);
		int mul=x*z;
		System.out.println("Multi..:"+x*z);
		int div=x/z;
		System.out.println("quotient.:"+div);
		int sub=x-z;
		System.out.println("sub..:"+sub);
		int reminder=x%z;
		System.out.println("Reminder..:"+reminder);
		
		//increment and decrement operators
		System.out.println("__________________________________________");
		System.out.println(x);
		System.out.println(x++);//first it will print and then increment
		System.out.println(x);
		System.out.println("__________________________________________");
		System.out.println(x);
		System.out.println(++x);//first it will increment and then print
		System.out.println(x);
		
		x+=10;//x=x+10;
		x-=10;//x=x-10;
		x/=10;//x=x/10;//quotient
		x%=2;//x%2;//reminder
		//all relational operators return a boolean...
		System.out.println(10==10);
		boolean boo=10>20;
		System.out.println(boo);
		
		//logical operators - && and ||
		boolean boole=10<20 && 20>10;//if both the operations are true, the expression will return true
		System.out.println(boole);
		boole=10<20 && 20<10;
		System.out.println(boole);
		
		boole=10<20 || 20<10;//any one of the operations are true, the expression will return true
		System.out.println(boole);
		
		if(x%2==0) {
			System.out.println("Even Number..");
		}
		else {
			System.out.println("Odd Number...");
		}
		
		String result=(x%2==0)?"even..................":"odd.........................";
		System.out.println(result);
		
		switch(x%2) {
		case 0:{
			System.out.println("evenenvenevenvenven......");
			break;
		}
		case 1:{
			System.out.println("odododododododododododo");
			break;
		}
		}
		
	}

}
