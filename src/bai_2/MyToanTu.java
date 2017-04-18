package bai_2;

public class MyToanTu {
	
	public static void main(String[] arr){
		int a = 3;
		int b = 5;
		System.out.println(arr[0]);
//		System.out.println(a + b);
//		System.out.println(b - a);
//		System.out.println(a * b);
//		System.out.println(b / a);
//		System.out.println(b % a);
//		a++;
//		System.out.println(a + b);
//		a--;
//		System.out.println(a + b);
//		System.out.println(a++);
//		System.out.println(a--);
//		b--;
//		if(a == b){
//			System.out.println(a);
//		}
//		if(a != b){
//			System.out.println(a);
//		}
//		if(a >= b){
//			System.out.println(a);
//		}
//		if(a <= b){
//			System.out.println(b);
//		}
		
//		System.out.println(a & b);
//		System.out.println(a | b);
//		System.out.println(a ^ b);
//		System.out.println(~a);
//		System.out.println(b << 1);
//		System.out.println(b);//??
//		System.out.println(a >> 1);
//		System.out.println(a);//??
//		System.out.println(a >>> 1);
		char c = 'a';
		if(c > a){
			System.out.println("'a' > 3");
		}else{
			System.out.println("3 > 'a'");
		}
		a = 97;///???? '0' <> 0
		if(a == c){
			System.out.println("equal");
		}
		if(!(a == b)){
			System.out.println("a == b ?");
		}
		boolean isMax = false;
		if(!isMax){
			System.out.println("not max yet");
		}
		
		if((a == b) && (a == 97)){
			System.out.println("&& a == b == 97");
		}
		
		if((a == b) || (a == 97)){
			System.out.println("|| a == b == 97");
		}
		String d = null;
		
		if( (a == 97)|| (d =="a")){
			System.out.println("no exception");
		}
	}

}
