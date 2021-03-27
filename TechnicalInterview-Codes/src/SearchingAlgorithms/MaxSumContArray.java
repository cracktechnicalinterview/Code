package Searching;

public class MaxSumContArray {
	
	/////------------Kadane's Algorithm (Optimal Solution)--------/////////
	public static void kadane(int A[]) {
		int maxEndingHere=0;
		int maxSoFar=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			maxEndingHere=maxEndingHere+A[i];
			maxEndingHere=Math.max(maxEndingHere,A[i]);
			maxSoFar=Math.max(maxSoFar,maxEndingHere);
		}
		
		System.out.println(maxSoFar);
	}
	
	///------------BRUTE FORCE ALGO--------------/////
	public static void findMax(int A[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			int sum=0;
			for(int j=i;j<A.length;j++) {
				sum=sum+A[j];
				max=Math.max(max,sum);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] A = { 2,-3,-4,1,6,-9 };
		kadane(A);
		findMax(A);
	}

}
