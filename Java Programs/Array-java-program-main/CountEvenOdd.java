package arrays;

public class CountEvenOdd {
	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int sum=0;
		int a[]= {0,1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even=even+1;
				sum=sum+even;
				System.out.println("its is even");
				
				System.out.println(sum);
			}
			else {
				odd=odd+1;
				sum=sum+odd;
				System.out.println("its is odd");
				System.out.println(sum);
			}
			
		}
	}

}
