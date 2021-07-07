package inspi.java;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value for i..:");
		int i=scan.nextInt();
		System.out.println("Enter value for j...:");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("The Multiplication of i and j is..:"+mul);
	}

}
