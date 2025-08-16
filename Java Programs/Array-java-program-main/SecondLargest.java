package arrays;

public class SecondLargestNum {
		public static void main(String[] args) {
			int a[]= {1,2,3,4,5};
			int max=a[0];
			int min=a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}}
				for(int j=1;j<a.length;j++) {
                if(max>a[j]){
					min=a[j];
				}
					
				}
				
			System.out.println(min);
	

}
}