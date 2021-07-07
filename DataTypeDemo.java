package inspi.java;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b=-129;
				//byte b=128;
				//range should between -128 to 127
				//short s=32768;
				//range for short is -32768 to 32767
				
				/*
				 * Multi line comment
				 *
				 */
				
				//TYPE PROMOTION AND TYPE CASTING
				byte b=10;
				byte c=10;
				
				int d=b*c;//the result of a arithmetic operation will give u a integer by default - type promotion has happened
				
				System.out.println(d);
				byte ee=(byte)d;
				System.out.println(ee);
				
				int value=257;
				byte e=(byte)value;
				System.out.println(e);
				
				byte x=100;
				int xint=x;//compatible - its like a bigger vessel taking a smaller vessel in it.
				
				double dd=23.456;
				int intdd=(int)dd;
				
				System.out.println(intdd);//this will also loose the precision
				
				//VALID IDENTIFIERS
				
				// variables are suppose to adhere with qualified names (valid identifiers)
				
				//int 2i; - Variable name cannot start with a number
				//int %i; - Variable name cannot start with a special character other than $ and _ .
				int _i;// valid identifier - _ is accepted
				int $i;// valid identifier - $ is accepted
				int money$_1;//valid identifier - can also be combination - number can be added in between or at the end.
				
				
				//IDENTIFIER DECLARATION AND INITIALIZATION
				//number types
				
				byte bnum=100;
				short snum=100;
				int num=100;
				long lnum=100;
				
				//floating
				float fnum=100.12f;
				double dnum=34.434;
				
				//character
				char cc='A';// character is of int type
				int ccint=cc;
				System.out.println("ASCII value of a...."+ccint);
				
				int myint=169;
				System.out.println((char)myint);
				
				boolean boo=true;//in java it wont accept 0 or 1
				
				String str="hello world";
				
	}

}
