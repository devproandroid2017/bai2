package bai_2;

public class MyFunction {
	String[] ar = new String[10];
	int pos = 0;
	
	public MyFunction(){
		
	}
	
	
	
	public void setFuncion(String funcName){
		pos++;
		ar[pos] = funcName;
	}
	
	public void setFunction(String funcName, int index){
		pos++;
		ar[index] = funcName; 
	}
	
	public String getFunction(int index){
		return ar[index];
	}
	
	public String getFunction(int index, int max){
		return "";
	}
	
	public long giaiThua(int n){
		if(n  < 0){
			System.out.println("wrong number");
			return -1;
		}
		
		if(n == 0){
			return 1;
		}
		
		return giaiThua(n - 1) * n;
	}
	
	public static void main(String[] args){
		MyFunction myFunction = new MyFunction();
		myFunction.setFuncion("function 1");
		myFunction.setFuncion("function 2");
		System.out.println(myFunction.getFunction(1));
		
	}

}
