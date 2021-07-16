package revision;

public class ReviseArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ii[]= {34,56,67,67,67};//you declare and initialize an array
		
		int arr[]=new int[5];//you declare an array of size 5, and the default values are initialized(0)
		
		System.out.println(ii[0]);
		System.out.println(arr[4]);
		
		arr[3]=444;//allocating a value to the array
		System.out.println(arr[3]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(ii[i]);
		}
		
		//new for loop which was introduced in jdk5
		
		for(int x:arr) {
			System.out.println(x);
		}
		for(int y:ii) {
			System.out.println(y);
		}
		
	}

}
