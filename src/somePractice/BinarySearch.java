package somePractice;

public class BinarySearch {

	public static void main(String[] args){
	
		int[] a = new int[10];
		for(int i = 0;i<a.length;i++){
			a[i] = i;
		}
		System.out.println(binarySearch(a,7,0,a.length-1));
	}
		
	public static int binarySearch(int[] a, int x,int low,int high){
		
		int mid = (low+high)/2;
		if(a[mid]<x){
			return binarySearch(a,x,mid+1,high);
		} else if(a[mid]>x){
			return binarySearch(a,x,low,mid-1);
		} else {
			return mid;
		}
	
	}
}
