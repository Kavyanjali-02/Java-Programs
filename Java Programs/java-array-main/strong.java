package BasicProgram;

public class strong {
	public static void main(String[] args) {
		int a=145;
		int temp=a;
		int sum=0;
		while(a>0) {
		int dig=a%10;
		int prd=1;
		for(int i=1;i<=dig;i++) {
			prd=prd*i;
			}
		sum=sum+prd;
		a=a/10;
		}
		if(temp==sum) {
			System.out.println("its a strong num");
		}
		else {
			System.out.println("not a strong num");
		}
	}

}
