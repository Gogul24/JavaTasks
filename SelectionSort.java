package task;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {9,4,5,6,-2,6};
		for(int i = 0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
