package in.ineuron.BS;

import java.util.Iterator;

//https://www.codingninjas.com/studio/problems/minimum-rate-to-eat-bananas_7449064?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries

public class KokoEatingBananas {
	
	private static int findMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}
	
	
	public static int calculateTotalHours(int[] arr, int hours) {
		
		int res = 0;
		
		for(int i = 0; i < arr.length; i++) {
			res = (int) (res + Math.ceil( arr[i] / hours));
		}
		
		return res;
	}
	
	
	public static int minimumRateToEatBananas(int[] v, int h) {
        // Write Your Code Here
		
		//Find the max elem of the array v[]:
		int low = 1;
		int high = findMax(v);
		int ans = -1;
		
		//Now we have to reduce the high as much as possible such that all the bananas can be eaten in h hours:
		while(low <= high) {
			
			int mid = (low + high) / 2;     // bananas/hour
			
			int hours = calculateTotalHours(v, mid);
			
			if(hours <= h) {
				ans = hours;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
			
		}
		
		return ans;
    }
}
