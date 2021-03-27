package SearchingAlgorithms;

public class MimimumDeletion {

	public int findMinimumDeletions(int nums[]) {
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]>nums[i+1])
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		MimimumDeletion md=new MimimumDeletion();
		int[] nums = {4,2,3,6,10,1,12};
	    System.out.println(md.findMinimumDeletions(nums));
	    nums = new int[]{-4,10,3,7,15};
	    System.out.println(md.findMinimumDeletions(nums));
	    nums = new int[]{3,2,1,0};
	    System.out.println(md.findMinimumDeletions(nums));
	}

}
