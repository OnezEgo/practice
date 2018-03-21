package somePractice;

import java.util.Random;

public class FunWithSorting {
	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		for(int i = 0; i<a.length;i++){
			a[i] = rand.nextInt(50) + 1;
		}
		for(int i = 0; i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
		
		quickSort(a,0,a.length-1);
		System.out.println("");
		
		for(int i = 0; i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
		
	}
	
	public static void quickSort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		if(left<index-1){
			quickSort(arr, left, index-1);
		}
		if(index<right){
			quickSort(arr, index, right);
		}
	}
	
	public static int partition(int[] arr, int left, int right){
		int pivot = arr[(left+right)/2];
		while(left<=right){
			while(arr[left]<pivot){left++;}
			while(arr[right]>pivot){right--;}
			if(left<=right){
				int temp = arr[left];
				arr[left]= arr[right];
				arr[right]= temp;
				left++;
				right--;
			}
		}
		return left;
		
	}
	

}
