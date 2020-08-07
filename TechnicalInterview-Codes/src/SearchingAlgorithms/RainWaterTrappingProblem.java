package SearchingAlgorithms;

public class RainWaterTrappingProblem {

	//-----------------SOLUTION 1---------------------//
	public static int calculateMinimum(int[] height,int position){
        int leftMax=0;
        int rightMax=0;
        for(int i=0;i<position;i++){
            if(leftMax<height[i])
                leftMax=height[i];
        }
        
        for(int j=position;j<height.length;j++){
            if(rightMax<height[j])
                rightMax=height[j];
        }
        
        return Math.min(leftMax,rightMax);
    }
    
    public static int trap(int[] height) {    
        int totalCapacity=0;
        for(int i=0;i<height.length;i++){
            int value=calculateMinimum(height,i)-height[i];
            if(value>0)
                totalCapacity=totalCapacity+value;
        }
        
        return totalCapacity;
    }
    ////////////////////////////////////////////////////////////
    
    ////////////------------SOLUTION 2 (Optimized O(n) )-------------////////////
    static int EfficientfindWater(int arr[], int n) 
    { 
        int result = 0; 
        int left_max = 0, right_max = 0; 
        int low = 0, high = n - 1; 
  
        while (low <= high) { 
            if (arr[low] < arr[high]) { 
                if (arr[low] > left_max) 
  
                    // update max in left 
                    left_max = arr[low]; 
                else
  
                    // water on curr element = 
                    // max - curr 
                    result += left_max - arr[low]; 
                low++; 
            } 
            else { 
                if (arr[high] > right_max) 
  
                    // update right maximum 
                    right_max = arr[high]; 
  
                else
                    result += right_max - arr[high]; 
                high--; 
            } 
        } 
  
        return result; 
    } 
    ////////////////////////////////////
    public static void main(String[] args) {
    	
    	int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
    	System.out.println(RainWaterTrappingProblem.trap(height));
    }
}
