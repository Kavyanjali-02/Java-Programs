package arrays;

import java.util.Arrays;

public class bubble sort1{
public static void main(String[] args) {
	int a[]= {2,4,1,3,5,7,6};
	for(int i=0; i<a.length-1; i++) {
		for(int j=i+1; j<a.length; j++) {
			if (a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			}
		}
	}
	System.out.println(Arrays.toString(a));
}

}
