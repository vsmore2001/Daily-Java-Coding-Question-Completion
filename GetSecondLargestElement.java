// https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largestElement){
                secondLargestElement = largestElement;
                largestElement = arr[i];
            }else if(arr[i]>secondLargestElement && arr[i]<largestElement){
                secondLargestElement = arr[i];
            }
        }
        return (secondLargestElement == Integer.MIN_VALUE) ? -1:secondLargestElement;
    }
}

