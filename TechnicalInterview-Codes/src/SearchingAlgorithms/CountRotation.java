package SearchingAlgorithms;

public class CountRotation {

		public static int findRotationCount(int[] A)
		{
			// search space is A[left..right]
			int left = 0;
			int right = A.length - 1;

			while (left <= right)
			{
				// if the search space is already sorted, we have
				// found the minimum element (at index left)
				if (A[left] <= A[right]) {
					return left;
				}

				int mid = (left + right) / 2;

				// find next and previous element of the mid element
				// (in circular manner)
				int next = (mid + 1) % A.length;
				int prev = (mid - 1 + A.length) % A.length;

				//Finding the minimum element
				if (A[mid] <= A[next] && A[mid] <= A[prev]) {
					return mid;
				}
				
				if (A[mid] <= A[right]) {
					right = mid - 1;
				}else {
					left = mid + 1;
				}
			}

			return -1;
		}

		public static void main(String[] args)
		{
			int[] A = { 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7 };

			System.out.println("The array is rotated " + findRotationCount(A) + " times");
		}
}
