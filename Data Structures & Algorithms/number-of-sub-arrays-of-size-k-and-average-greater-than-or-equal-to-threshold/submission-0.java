class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum= 0;
        int res =0;

        for(int i =0; i<k; i++){
            sum = sum + arr[i];
        }

        if(sum >= k* threshold){
            res++;
        }

        for(int i = k; i< arr.length; i++){
            sum = sum + arr[i];
            sum = sum - arr[i-k];
        
        if(sum >= k* threshold){
            res++;
        }
        }
        return res;
    }
    
}