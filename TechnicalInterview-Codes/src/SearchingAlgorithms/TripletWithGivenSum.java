package SearchingAlgorithms;

import java.util.HashSet;

public class TripletWithGivenSum {

	public static void findTripletWithGivenSum(int arr[],int sum) {
        for (int i = 0; i < arr.length - 2; i++) { 
  
            HashSet<Integer> s = new HashSet<Integer>(); 
            int curr_sum = sum - arr[i]; 
            for (int j = i + 1; j < arr.length; j++) { 
                if (s.contains(curr_sum - arr[j])) { 
                    System.out.printf("Triplet is %d, %d, %d", arr[i], 
                    		arr[j], curr_sum - arr[j]); 
                } 
                s.add(arr[j]); 
            } 
        } 
	}
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		findTripletWithGivenSum(arr, 22);
	}

}
