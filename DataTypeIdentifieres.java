package revision;

public class DataTypeIdentifieres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		//value 10 is assigned to a variable by name age of type int
		//Valid identifier name
		int _age;
		int $age;
		int ag2e;
		int a_g_2_$_;
		
		//invalid identifiers
//		int 2age;//name cannot start with a number
//		int @age;//special characters others than $ and _ cannot be used
//		int a g e;//space cannot be used
//		int package;//keywords cannot be used to name the variable
		
		//variable declaration and initialization
		//number types
		byte b=127;//range is between -128 to 127 - 8 bits
		short s=32767;//range is between -32768 to 32767 - 16 bits
		int score=214_74_83_64;//32 bit
		long l=234243;
		System.out.println(score);
		//Floating Numbers.
		double d=23.45;//64 bit
		float f=34.45f;//32 bit
		
		//character
		char c='a';
		
		//boolean
		boolean boo1=true;
		boolean boo2=false;
		//boolean boooo=1; invlid data - boolean can either have true or false
	}

}
