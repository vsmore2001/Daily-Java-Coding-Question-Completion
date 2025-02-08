class Main {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,7,8,90};
        // int arr[] = {1,2,3,4,5};
        rotateArray(arr,2);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
    public static void rotateArray(int[] arr,int k){
        int len = arr.length;
        k = k % len; // if k is greater than len
        // reverse entire arr
        reverse(arr,0,len-1);
        // reverse first k elements
        reverse(arr,0,k-1);
        // reverse remaining k elements
        reverse(arr,k,len-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
