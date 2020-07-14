package SearchingAlgorithms;

public class DutchNationalFlagProblem {

	public static void codeDutchNationalFlagProblem(int a[]) {
	
		int low=0,mid=0;
		int high=a.length-1;
		int temp;
		while(mid<=high) {
			switch(a[mid]) {
				case 0: temp=a[low];
						a[low]=a[mid];
						a[mid]=temp;
						low++;
						mid++;
						break;
						
				case 1: mid++;
						break;
						
				case 2: temp=a[mid];
						a[mid]=a[high];
						a[high]=temp;
						high--;
						break;
			}
			
		}
		System.out.println("asd");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void swap(int val1,int val2) {
		int temp=val1;
		val1=val2;
		val2=temp;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,1,0,1,2,0,0,2,1,2,0,1};
		DutchNationalFlagProblem.codeDutchNationalFlagProblem(arr);
		
		
		
	}

}
