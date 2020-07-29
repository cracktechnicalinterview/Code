package SearchingAlgorithms;

public class SeperateOddAndEven {

	static void segregateEvenOdd(int arr[]) 
    { 
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1; 
        while (left < right) 
        { 
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0 && left < right) 
                left++; 
  
            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1 && left < right) 
                right--; 
  
            if (left < right) 
            { 
                int temp = arr[left]; 
                arr[left] = arr[right]; 
                arr[right] = temp; 
                left++; 
                right--; 
            }
        }
    }
        
	public static void main(String[] args) {
		int arr[]= {12, 34, 45,9,8,90,3};
		SeperateOddAndEven.segregateEvenOdd(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
