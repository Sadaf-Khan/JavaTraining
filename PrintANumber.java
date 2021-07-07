package inspi.java;
import java.util.Scanner;
public class PrintANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner rea = new Scanner(System.in);
		System.out.print("Enter a number: ");
		// nextInt() reads the next integer from the keyboard
		int number = rea.nextInt();
		// println() prints the following line to the output screen
		System.out.println("You entered: " + number);
	}

}
