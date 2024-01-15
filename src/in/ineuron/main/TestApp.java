package in.ineuron.main;


import in.ineuron.BS.CountAllOccurences;


public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1, 1, 1, 2, 2, 3, 3, 3, 3, 4};
		
		int count = CountAllOccurences.count(arr, arr.length, 4);
		System.out.println(count);
	
	}

}
