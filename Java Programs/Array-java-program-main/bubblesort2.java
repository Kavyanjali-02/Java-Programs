package arrays;

import java.util.Arrays;

public class Bubblesort2 {
public static void main(String [] args) {
	int a[]= {2,4,6,1,3,7};
	for(int i=0; i<a.length-1; i++) {
		for(int j=0; j<a.length-1; j++) {
	          if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
			
		}
	}
	System.out.println(Arrays.toString(a));
}

}
