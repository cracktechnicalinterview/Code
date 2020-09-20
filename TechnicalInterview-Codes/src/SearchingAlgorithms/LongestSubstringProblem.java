package SearchingAlgorithms;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringProblem {

	//Efficient
	public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hMap=new HashMap<Character,Integer>();
        int result=0;
        int start=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hMap.containsKey(c))
                start=Math.max(start,hMap.get(c)+1);
 
            result=Math.max(result,i-start+1);
            hMap.put(c,i);
 
        }
        return result;
    }
	
	//----------------BruteForce --------
	public static boolean NoDuplicate(String str, int i, int j) 
	{ 
	    HashSet<Character> hs=new HashSet<Character>();
	    for (int k = i; k <= j; k++) { 
	        if (hs.contains(str.charAt(k))) 
	            return false; 
	        hs.add(str.charAt(k));
	    } 
	    return true; 
	} 
	  
	public static int longestUniqueSubsttr(String str) 
	{ 
	    int n = str.length(); 
	    int res = 0;
	    for (int i = 0; i < n; i++) 
	        for (int j = i; j < n; j++) 
	            if (NoDuplicate(str, i, j)) 
	                res = Math.max(res, j - i + 1); 
	    return res; 
	} 
	//----------end of brute force----------------
	
	public static void main(String[] args) {
		//Optimized
		System.out.println(LongestSubstringProblem.lengthOfLongestSubstring("abcabcbb"));
		
		//BruteForce
		System.out.println(LongestSubstringProblem.longestUniqueSubsttr("abcabcbb"));
		
	}

}
