package BasicProgram;

public class neon {
	public static void main(String[] args) {
		int a=36;
		int squ=a*a;
		int sum=0;
		int ans=0;
		while(a>0) {
			int dig=a%10;
			sum=sum+dig;
			a=a/10;
		}
		while(squ>0) {
			int b=squ%10;
			ans=ans*b;
			squ=squ/10;
		}
		if(sum==ans) {
			System.out.println("neon");
		}
		else {
		System.out.println("not neon");
		}
	}
}