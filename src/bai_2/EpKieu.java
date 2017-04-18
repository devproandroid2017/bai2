package bai_2;

public class EpKieu {

	public static void main(String[] args) {
		
		float a = 3.945f;
		float b = 5.6f;
		float c1 = 93.32f;
		double c2 = 93.32d;
		
		short s1 = 1000;
		short s2 = 1000;
		System.out.println(s1 * s2);///??
		if(c1 == c2){
			System.out.println("c1 = c2");
		}
		float r =  a * b;
		int r2 = (int) a * (int) b;
		int r3 = (int)(a * b);
		System.out.println("C1 = "+ c1 );
		System.out.println("C2 = "+ c2 );
		System.out.println("r = " + r);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);

	}

}
