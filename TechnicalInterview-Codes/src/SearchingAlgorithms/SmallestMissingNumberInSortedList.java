package SearchingAlgorithms;

public class SmallestMissingNumberInSortedList {

	//Given a sorted array of distinct non-negative integers, find smallest missing element in it. array started from 0 to n
	//Hint: Correct element should be at correct position
	
	public static int findSmallestMissingElement(int []arr,int low,int high) {
		
		if(low>high)
			return low;
		
		int mid=(low+high)/2;
		
		if(arr[mid]==mid)
			return findSmallestMissingElement(arr, mid+1, high);
		else 
			return findSmallestMissingElement(arr, low, mid-1);

	}
	
	public static void main(String[] args) {
		int arr []= {0,1,2,3,4,6,7,9};
		System.out.println("Missing number is: "+SmallestMissingNumberInSortedList.findSmallestMissingElement(arr,0,arr.length-1));
	}
}
