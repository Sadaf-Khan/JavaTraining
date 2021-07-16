package revision;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//looping constructs - while,dowhile,for
		
				//while - pre condition check
				//fox example, you will allowed in the cinema theatre only if you have the ticket
				//do-while - post condition check
				//for example, you will be allowed to enter a train and after entering ticket is checked.
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter some value.below 10..:");
				//int x=scan.nextInt();
//				boolean b=(x<10);
//				while(x<10) {
//					System.out.println("while loop.....");
//					x++;
//				}
//				
//				do {
//					System.out.println("do while loop....");
//					x--;
//				}while(x>0);
				
				for(int x=10 ; x>0 ; --x) {
					System.out.println("for loop...."+x);		
				}
				
				for(int x=0,y=10; x<10 && y>0;x++,y--) {
					System.out.println(x+":"+y);
				}
				
				//nested forloops
				for(int i=0;i<5;i++) {//outer for loop - 5 times
					for(int j=0;j<5;j++) {//inner for loop - each value of i it will 5 times
						System.out.print("*"+"\t");
					}
					System.out.println();
				}
	}

}
