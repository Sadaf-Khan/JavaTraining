package revision;

public class Revision1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=100;
		short s=b;
		int i=s;
		long l=i;
		
		long ll=257344;//64
		System.out.println("logn..:"+ll);
		int ii=(int)ll;//32
		System.out.println("int..:"+ii);
		short ss=(short)ii;
		System.out.println("short..:"+ss);
		byte bb=(byte)ss;
		System.out.println("byte..:"+bb);
		
		//under nor circumnstances (i.e if the data is acceptable by all the types then no problem
		//but if the data is not acceptable then u face the problem of loosing data accuracy or precision
		
		//automatic type promotion
		byte mynum1=120;
		byte mynum2=2;
		byte result=(byte)(mynum1*mynum2);//the result of two bytes will be integer
		int re=mynum1*mynum2;
		System.out.println(result);
		System.out.println(re);
		
		//float numbers
		double d=344.56;
		System.out.println("double value..:"+d);
		float f=(float)d;
		System.out.println("float value.:"+f);
		
		int myintfloat=(int)f;
		System.out.println(myintfloat);//by casting a float to integer, u loose the decimal points.
		
		
	}

}
