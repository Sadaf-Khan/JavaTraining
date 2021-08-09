package lab3book.java;
import java.util.Scanner;
public class AvgNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AvgNumber avg=new AvgNumber();
 avg.averagenum();
	}
void averagenum()
{
int num, sum=0;
System.out.println("Enter the value of num:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(int i=1;i<=num;i++)
{
sum=i+sum;
}
float avg=sum/num;
System.out.println("The average is:"+avg);
}
}
