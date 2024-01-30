package in.ineuron.BS;

import java.util.ArrayList;

public class PaintersPartition {
	
	public static int maxElement(ArrayList<Integer> boards){
        int max = boards.get(0);

        for(int i = 1; i < boards.size(); i++){
            if(boards.get(i) > max) max = boards.get(i);
        }
        return max;
    }

    public static int sumOfElements(ArrayList<Integer> boards){
        int sum = 0;
        for(int i = 0; i < boards.size(); i++){
            sum = sum + boards.get(i);
        }
        return sum;
    }


    public static int noOfPainters(ArrayList<Integer> boards, int maxBoardLength){

        int painters = 1; 
        int length = 0; 

        for(int i = 0; i < boards.size(); i++){

            if(length + boards.get(i) > maxBoardLength){
                painters++;
                length = boards.get(i);
            }
            else{
                length = length + boards.get(i);
            }
        }

        return painters;

    }


    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        if(boards.size() < k) return -1;

        int low = maxElement(boards);
        int high = sumOfElements(boards);

        int ans = -1;

        while(low <= high){

            int mid = (low + high) / 2;

            int totalPainters = noOfPainters(boards, mid);

            if(totalPainters > k){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }

        }
        
        return ans;

    }
}
