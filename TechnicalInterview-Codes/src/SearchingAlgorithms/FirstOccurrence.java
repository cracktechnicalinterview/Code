package SearchingAlgorithms;

public class FirstOccurrence {
	
	
	public static int findFirstOccurence(int [] a,int target) {
		
		int low = 0;
		int high = a.length - 1;

		while (low <= high)
		{
			int mid = (low + high) / 2;

			if ((target == a[mid] && low==mid ) || (target == a[mid] && a[mid-1]!=target)) {
				return mid;
			}
			else if(target==a[mid] && a[mid-1]==target) {
				high=mid-1;
			}
			else if (target < a[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static int moreOptimised_findFirstOccurence(int [] a,int target) {

		int left = 0;
		int right = a.length - 1;
		int result = -1;

		while (left <= right)
		{
			int mid = (left + right) / 2;
			if (target == a[mid]) {
				result = mid;
				right = mid - 1;
			}
			else if (target < a[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		int a[]= {5,5,5,5,6,6,8,9,9,9};
		System.out.println(FirstOccurrence.findFirstOccurence(a,5));

	}

}
