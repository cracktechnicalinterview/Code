package SystemDesign;

import java.util.LinkedHashSet;
//Least Recently Used
public class LRU {
	
	LinkedHashSet<Integer> list; //Data Structure to implement cache
	int MAXSIZE;				//Maximum size of the cache
	static int faults;			//Count the total number of page faults
	
	public LRU(int cacheSize) {
		list=new LinkedHashSet<Integer>();
		MAXSIZE=cacheSize;
	}
	
	public void faultHandle(int page) {
		if(list.size()==MAXSIZE) {
			//eviction policy
			int first=list.iterator().next(); 
			list.remove(first);
			list.add(page);
		}else {
			list.add(page);
		}
		faults++;
	}
	
	public void shuffle(int page) { // 2 3 4 (3)
		list.remove(page); 			// 2 4
		list.add(page);				// 2 4 3
	}

	public void refer(int page) {
		if(list.contains(page)) { //if the hashset already contains the page
			shuffle(page);
		}else {
			faultHandle(page);
		}
	}
	
	public static void main(String[] args) {
	
		int pages[]= {3,2,1,3,4,1,6,2,4,3,4,2,1,4,5,2,1,3,4};
		
		LRU cache=new LRU(3);
		
		for(int page:pages) {
			cache.refer(page);
		}
		
		System.out.println("Pages in cache: "+cache.list);
		System.out.println("Number of page faults: "+faults);

		
	}

}
