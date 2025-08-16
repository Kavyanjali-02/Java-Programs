public class CountEvenAndOdd {
	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				evencount=evencount+1;
				System.out.println(evencount);
				System.out.println("printed nums");	
				System.out.println(i);
				}
			else {
				oddcount=oddcount+1;
				
			}
		}
	}
	

}
