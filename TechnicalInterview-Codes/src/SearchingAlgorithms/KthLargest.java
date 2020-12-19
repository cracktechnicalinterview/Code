package SearchingAlgorithms;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
	
	public static int findKMaximum(int arr[],int k) {
		int max=0;
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			if(!q.contains(arr[i]))
				q.add(arr[i]);
		}
		
		while(k!=0) {	
			max=q.poll();
			k--;
		}

		return max;
	}

	public static void main(String[] args) {
		
		int arr[]= {7, 4, 6, 3, 9, 1, 9};
		System.out.println(KthLargest.findKMaximum(arr, 2));
		

	}

}
