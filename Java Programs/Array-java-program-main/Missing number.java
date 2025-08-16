package arrays;
import java.util.Arrays;

public class MissingNumber {
	public static void sort(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;			
			}}}}
public static void main(String[] args) {
	int arr[]= {2,5,6,9,12};
	sort(arr);
int n=0;
for(int i=0;i<arr.length;i++) {
	if(n!=arr[i]) {
		System.out.println(n);
		i--;
	}
	n++;
}
}
}
