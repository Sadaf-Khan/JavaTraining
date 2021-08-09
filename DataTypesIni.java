package lab3book.java;

public class DataTypesIni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		int _age;
		int $age;
		int ag2e;
		int a_g_2_$_;
		
	//Initialization of the variable of type int
		byte b=127;//range is between -128 to 127 - 8 bits
		short s=32767;//range is between -32768 to 32767 - 16 bits
		int score=214_74_83_64;//32 bit
		long l=234243;
		//System.out.println(score);
		//Declaration and Initialization of the Type Float & Long 
		double d=23.45;//64 bit
		float f=34.45f;//32 bit
		
		//Declaration and Initialization of Type Character
		char c='a';//32 bit
		
		//Declaration and Initialization of Type Boolean
		boolean boo1=true;
		boolean boo2=false;
		//Declaration and Initialization of the Type String
         String Str="Hello World";
         //Type Casting
         //Implicit Type Casting 
         byte b1=100;
         short s1=b1;
         int i=s;
         long l1=i;
         /*Printing the Values*/
         System.out.println("The Implicit Type casted values for int values......:");
         System.out.println("The Value of b1:"+b1);
         System.out.println("The Value of s1:"+s1);
         System.out.println("The Value of i:"+i);
         System.out.println("The Value of l1:"+l1);
         //Implicit Type Casting of Floating Value
         float f1=33.4f;
         double D1=f1;
         /*Printing the Values*/
         System.out.println("The Implicit Type casted values for floating values.....:");
         System.out.println("The Value of f1:"+f1);
         System.out.println("The Value of L1:"+D1);
         //Implicit Type Casting of Character
         char c1='A';
         int ch=c1;
         float cr=c1;
         long chr=c1;
         double d1=c1;
         /*Printing the Values*/
         System.out.println("The Implicit Type casted values for Char values......:");
         System.out.println("The Value of c1:"+c1);
         System.out.println("The Value of ch:"+ch);
         System.out.println("The Value of cr:"+cr);
         System.out.println("The Value of chr:"+chr);
         System.out.println("The Value of d1:"+d1); 
         //Explicit Type Casting of int values
         b1=(byte)s1;
         s1=(short)i;
         i=(int)l1;
         /*Printing the Values*/
         System.out.println("The Explicit Type casted values for int values......:");
         System.out.println("The Value of b1:"+b1);
         System.out.println("The Value of s1:"+s1);
         System.out.println("The Value of i:"+i);
         //Explicit Type Casting of FLoating value
         f1=(float)d1;
         System.out.println("The Explicit Type casted values for Floating value.....:");
         System.out.println("The vakue of f1:"+f1);
         //Explicit Type Casting values for Char 
         c1=(char)i;
         System.out.println("The Explicit Type casted values for Char values......:");
         System.out.println("The Value of i:"+c1);
         c1=(char)l1;
         System.out.println("The Value of l1:"+ch);
         c1=(char)f1;
         System.out.println("The Value of f1:"+cr);
         c1=(char)D1;
         System.out.println("The Value of D1:"+chr);
        //Explicit Type Casting in Type String         
         
	}

}
