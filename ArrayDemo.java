package inspi.java;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Normally variables can store only one value..
				//but arrays can store more than 1 value...
				
			//	int marks[]= {90,83,85};//single dimensional array with initialization
				
				int marks[]=new int[3];//single dimensional array without initialization -3 is size of array
				marks[0]=90;//array index always starts with zero
				marks[1]=83;
				marks[2]=85;
				
				for(int i=0;i<marks.length;i++) {//marks.length will get you the size of the array
					System.out.println(marks[i]);
				}
	}

}
