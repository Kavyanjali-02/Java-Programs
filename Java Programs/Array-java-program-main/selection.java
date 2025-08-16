package arrays;

import java.util.Arrays;

public class Seletionsort {
public static void main(String[] args) {
	int a[]= {2,4,5,8,9,1,6};
	for(int i=0;i<a.length-1;i++) {
		int min=i;
		int temp;
		for(int j=i+1;j<a.length;j++) {
			if(a[min]>a[j]) {
			  temp=a[j];
               a[j]=a[min];
               a[min]=temp;
				
			}
				
			}
		}
	System.out.println(Arrays.toString(a));
	}
}
