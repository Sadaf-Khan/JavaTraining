package revision;
import java.util.Scanner;
public class ReviseLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if, switch, ternary
		//both if and ternary accept a boolean
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some value...:");
		int x=scan.nextInt();
		
		boolean b=(x%2==0);
		if(b) {
			System.out.println("I am true..because reminder is zero..");
		}
		if(!b) {
			System.out.println("I am not true....");
		}
		
		String result=(b)?"true true true....":"false false false...";
		System.out.println(result);
		
		//switch case
		//in switch case we will have a evaluator using arithmetic operations
		int k=x%2;
		switch(k) {
		case 0:{
			System.out.println("00000000000000000000000000000");
			break;//this break is mandatory
		}
		case 1:{
			System.out.println("1111111111111111111111111111");
		}
		}
		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				//break;//break will break the for loop
				continue;//continue will continue the for loop
			}
			System.out.println(i);
		}//break at line 39 will break the for loop and come out at line 43, the statements inbetween will be ignored
		//continue at line 40 will go back and continue with the for loop i.e the cursor will go back to line37
		
	}

}
