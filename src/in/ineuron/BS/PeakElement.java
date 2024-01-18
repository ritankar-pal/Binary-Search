package in.ineuron.BS;

import java.util.ArrayList;

public class PeakElement {
	
	public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
		
		//For single element:
		if(arr.size() == 1) return arr.get(0);
		
		//Checking if the peak is 0th:
		if(arr.get(0) > arr.get(1)) return arr.get(0);
		
		//Checking if the peak is the last element:
		if(arr.get(arr.size()-1) > arr.get(arr.size()-2)) return arr.get(arr.size()-1);
		
		//Search space reduced to 1 and (n-2):
		int low = 0;
		int high = arr.size()-2;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(arr.get(mid) > arr.get(mid-1) && arr.get(mid) > arr.get(mid+1)) return mid;
			
			//if mid is on the increasing slope then peak on right hence eliminate left portion:
			if(arr.get(mid) > arr.get(mid-1) && arr.get(mid) < arr.get(mid+1)) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
		}
		
		//dummy return:
		return 0;
    }
}
