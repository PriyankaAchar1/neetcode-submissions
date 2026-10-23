class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0; int res =0;
        HashMap <Character,Integer> mp = new HashMap<>();

        for(int right =0; right< s.length(); right++){
            if(mp.containsKey(s.charAt(right))){
                left= Math.max(left, (mp.get(s.charAt(right))+1));
            }

            mp.put(s.charAt(right),right);
            res= Math.max(res,right-left+1);

        }
        return res;
    }
}
