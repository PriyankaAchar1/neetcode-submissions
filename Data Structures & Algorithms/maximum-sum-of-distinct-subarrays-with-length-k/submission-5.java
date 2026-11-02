class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long maxsum = 0;
        long currentSum =0;
        int left =0;
        Set<Integer> set = new HashSet<>();

        for(int right=0;right<nums.length;right++){

           while(set.contains(nums[right])){
            set.remove(nums[left]);
            currentSum-= nums[left];
            left++;
           }
           set.add(nums[right]);
           currentSum += nums[right];

           if(right-left+1 > k){
            set.remove(nums[left]);
            currentSum-= nums[left];
            left++;
           }

           if(right-left+1 == k){
            maxsum = Math.max(maxsum,currentSum);
           }

        }

        return maxsum;

    }
}
