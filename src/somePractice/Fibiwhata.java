package somePractice;

public class Fibiwhata {
	
	public static void main(String[] args){
		System.out.println(fib(13));
	
	}
	
	public static int fib(int n){
		if(n==0||n==1){
			return n;
		}
		int a = 0;
		int b = 1;
		for(int i = 2;i<n;i++){
			int c = a + b;
			a = b;
			b = c;
		}
		return a+b;
	}
		
}
	

