package BasicProgram;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		while(num>0) {
			int dig=num%10;
			int K=dig*dig*dig;
			sum=sum+K;
			num=num/10;					
		}
		System.out.println(sum);
		
	    if(sum==temp) {
			System.out.println("its a armstrong");
	    }
        else {
		System.out.println("not a armstrong");
         }
}
}
	
