class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
     Set <Integer> dupli = new HashSet<>();
     int L=0;

     for(int R=0; R < nums.length; R++){
        if(R-L>k){
            dupli.remove(nums[L]);
            L++;
        }
        if(dupli.contains(nums[R]))
        {
            return true;
        }
        dupli.add(nums[R]);

     }
     return false;      
    }
}