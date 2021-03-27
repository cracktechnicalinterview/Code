package SearchingAlgorithms;

import java.util.HashSet;

public class ZeroSumSubArray {
	
	
	public static boolean zeroSumSubarray(int arr[]) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(0);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(hs.contains(sum)) {
				return  true;
			}else {
				hs.add(sum);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {3,4,-7,3,1,3,1,-4,-2,-2};
		System.out.println(zeroSumSubarray(arr));
	}

}
