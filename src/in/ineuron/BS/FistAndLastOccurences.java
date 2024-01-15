package in.ineuron.BS;

import java.util.ArrayList;


public class FistAndLastOccurences {

	private static int lowerBound(ArrayList<Integer> arr, int n, int low, int high, int k) {

		int ans = n;

		while(low <= high) {

			int mid = (low + high) / 2;

			if(arr.get(mid) >= k) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}

		return ans;
	}


	private static int upperBound(ArrayList<Integer> arr, int n, int low, int high, int k) {

		int ans = n;

		while(low <= high) {

			int mid = (low + high) / 2;

			if(arr.get(mid) > k) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}

		return ans;
	}


	public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.

		int first = lowerBound(arr, n, 0, n-1, k);
		//		int second = upperBound(arr, n, 0, n-1, k);

		if(first == n || arr.get(first) != k) return new int[] {-1, -1};

		return new int[] {first, upperBound(arr, n, 0, n-1, k)-1};

	}


}
