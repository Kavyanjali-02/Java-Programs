package BasicProgram;

public class spynumber {
	public static void main(String[] args) {
		int a=123;
		int sum=0;
		int prod=1;
		while(a>0) {
			int dig=a%10;
			sum=sum+dig;
			prod=prod*dig;
			a=a/10;
		}
		if(sum==prod) {
			System.out.println("spy number");		
			
		}
		else {
			System.out.println("its not a spy number");
		}
		}
				
	}

