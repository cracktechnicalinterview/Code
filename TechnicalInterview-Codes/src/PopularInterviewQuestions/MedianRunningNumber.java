package PopularInterviewQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianRunningNumber {

	public static void printMedian(int arr[]) {

		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		
		maxHeap.offer(arr[0]);
		System.out.println("Median "+maxHeap.peek());
		double median=0.0f;
		
		for(int i=1;i<arr.length;i++) {
			int x=arr[i];
			//Insertion
			
			if(x <=maxHeap.peek()) {
				maxHeap.offer(x);
			}else {
				minHeap.offer(x);
			}
			
			
			//Balancing
			if(maxHeap.size() - 2 ==minHeap.size() ) {
				minHeap.offer(maxHeap.poll());
			}else if(maxHeap.size() == minHeap.size()-2) {
				maxHeap.offer(minHeap.poll());
			}
			
			
			//Median
			
			if(minHeap.size() == maxHeap.size()) {
				median = (double) (maxHeap.peek() + minHeap.peek())/2;
			}else if(minHeap.size() > maxHeap.size()) {
				median=minHeap.peek();
			}else {
				median=maxHeap.peek();
			}
			
			
			System.out.println(median);
			
		}	
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 15, 10, 20, 3 };
		printMedian(arr);
	}

}
