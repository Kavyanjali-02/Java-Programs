package arrays;

public class ArrayIsSortedorNot {
public static void main(String[] args) {
	int a[]= {4,8,9,3,2,1};
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(min<a[i]) {
			min=a[i];
		}
		else{
			System.out.println(" its not sorted");
			return;
		}
			
		}
	System.out.println(" its sorted");
	}
}