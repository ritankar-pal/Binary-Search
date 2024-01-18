package in.ineuron.BS;


//Find nth root of m:

public class NthRootOfM {
	
	//return 1 is ans == m;
	//return 0 is ans < m;
	//return 2 is ans > m;
	
	private static int power(int mid, int n, int m) {
		
		long ans = 1;
		
		for(int i = 0; i < n; i++) {
			ans = ans * mid;
			
			if(ans > m) return 2;
		}
		
		if(ans == m) return 1;
		
		return 0;
	}
	
	public static int NthRoot(int n, int m) {
        // Write your code here.
		int low = 1; 
		int high = m;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			//Found the perfect root: 
			if(power(mid, n, m) == 1) return mid;
				
			else if(power(mid, n, mid) == 0) low = mid + 1; 
			else {
				high = mid - 1;
			}
		}
		
		return 0;
    }
}
