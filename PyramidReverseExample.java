package inspi.java;

public class PyramidReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term=6;
		for(int i=1;i<=term;i++)
		{
		for(int j=term;j>=i;j--)
		{
		System.out.print("* ");
		}
		System.out.println();//new line
		}
	}

}
