package in.ineuron.BS;



public class CountAllOccurences {
	
	private static int helper(int[] arr, int n, int low, int high, int target) {
		
		//Base Case:
		if(low > high) return 0;
		
		int mid = (low + high) / 2;
		
		if(arr[mid] == target) {
			
			int left = helper(arr, n, low, mid-1, target);
			int right = helper(arr, n, mid+1, high, target);
			
			return 1 + left + right;
		}
		else if(arr[mid] < target) {
			return helper(arr, n, mid+1, high, target);
		}
		
		return helper(arr, n, low, mid-1, target);
	}
	
	
	
	public static int count(int arr[], int n, int x) {
		
		return helper(arr, n, 0, n-1, x);
		
    }
}	
