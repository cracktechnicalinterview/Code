package SearchingAlgorithms;

public class LongestBitonic {
	
	public static int calculateLBS(int nums[],int low,int high,int count) {
		
		if(low>high)
			return 0;
		
		int mid=(low+high)/2;
		System.out.println(low+" "+mid+" "+high);
		System.out.println(nums[low]+" "+nums[mid]+" "+nums[high]);
		System.out.println();
		if(nums[low]<nums[mid] && nums[mid]>nums[high]) {
			int max=Math.max(count,high-low+1);
			return max;
		}
		return Math.max(calculateLBS(nums,low,mid-1,count),calculateLBS(nums, mid+1, high, count));
		
	}

	public static int findLBSLength(int nums[]) {
		
		return calculateLBS(nums,0,nums.length-1,0); 
	}
	
	public static void main(String[] args) {
		int[] nums = {4,2,3,6,10,1,12};
	    System.out.println(LongestBitonic.findLBSLength(nums));

	}

}
