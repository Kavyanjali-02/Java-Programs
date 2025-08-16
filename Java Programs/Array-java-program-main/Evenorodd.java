package arrays;

public class EvenOrOdd {
	public static void main(String[]args) {
		int a[]= {0,1,2,3,4,5,6,7,8};
		 int evencount=0;
		 int oddcount=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				evencount=evencount+1;
				System.out.println("evencount");	
				System.out.println(i);
				}
			else {
				oddcount=oddcount+1;
				System.out.println("oddcount");
				System.out.println(i);
			}
				
			}
		}
	

}
