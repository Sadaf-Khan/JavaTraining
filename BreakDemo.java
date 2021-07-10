package inspi.java;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;boolean b=false;
		a:{
			System.out.println("a block.....");			
			b:{
				System.out.println("b block.....");
				b=true;
				c:{
					System.out.println("c block.....");
					if(b) {
						break a;//here break will take the curosor from here to the end of b
					}
				}
				System.out.println("job over....after c block...");
			}
			System.out.println("job over....after b block...");
		}
		System.out.println("job over....after a block...");
	}

}
