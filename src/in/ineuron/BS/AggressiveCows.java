package in.ineuron.BS;

import java.util.Arrays;

public class AggressiveCows {
	
	private static boolean canWePlace(int[] stalls, int mid, int cows) {
		
		int count = 1;
		int lastCowPosition = stalls[0];
		
		for(int i = 1; i < stalls.length; i++) {
			if(stalls[i] - lastCowPosition <= mid) {
				count++;
				lastCowPosition = stalls[i];
			}
			
			if(count == cows) return true;
		}
		
		return false;
	}
	
	public static int aggressiveCows(int []stalls, int cows) {
		//Write your code here
		Arrays.sort(stalls);
		int n = stalls.length;
		
		int low = 1;                    //Distance b/w 2 stall positions
		int high = stalls[n-1];
		
		int ans = -1;
		
		while(low <= high) {
			
			if(low > high) return ans;
			
			int mid = (low + high) / 2;
			
			if(canWePlace(stalls, mid, cows) == true) {
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid - 1;
			}
		}
		return ans;
	}
}
