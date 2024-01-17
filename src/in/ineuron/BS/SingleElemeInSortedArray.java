package in.ineuron.BS;

import java.util.ArrayList;

public class SingleElemeInSortedArray {

	public static int singleNonDuplicate(ArrayList<Integer> arr)
	{//Write your code here.

		//if list has 1 elem:
		if(arr.size() == 1) return arr.get(0);

		//If first elem itself is the single elem:
		if(arr.get(0) != arr.get(1)) return arr.get(0);

		//If Last elem is the unique elem:
		if(arr.get(arr.size()-1) != arr.get(arr.size()-2)) return arr.get(arr.size()-1);


		//Our Search Space will be from index 1 to n-2:
		int low = 1;
		int high = arr.size()-2;
		int elem = -1;

		while(low <= high) {

			//mid elem:
			int mid = (low + high) / 2;

			if(arr.get(mid) != arr.get(mid-1) && arr.get(mid) != arr.get(mid+1)) {
				elem = mid;
				return elem;
			}

			//If We are on the left half then unique elem on right:
			if((mid % 2 == 1 && arr.get(mid) == arr.get(mid-1)) || (mid % 2 == 0 && arr.get(mid) == arr.get(mid+1))) {
				
				//elem left portion:
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		return elem;
	}
}








