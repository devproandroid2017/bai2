package bai_2;
//trong java chi su dung tham tri
public class ThamChieuTri {
	
	public void test(String a){
		System.out.println(a);
		a = "123456";
	}
	public String test2(final String a){
		System.out.println(a);
		return "12345678";
	}
	public static void main(String[] args){
		String a = "123";
		
		ThamChieuTri tc = new ThamChieuTri();
		tc.test(a);
		
		String b = tc.test2(a);
		
		System.out.println(a);
	}

}
