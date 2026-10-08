class Solution {
    public int minimumRecolors(String blocks, int k) {

        int count_W=0;

        for (int i=0; i<k; i++){
            if(blocks.charAt(i)=='W'){
                count_W++;
            }
        }
        int res = count_W;

        for (int i=k;i<blocks.length(); i++){
            if(blocks.charAt(i-k)=='W'){
                count_W--;
            }
            if (blocks.charAt(i) =='W'){
                count_W++;
            }
            res = Math.min(res,count_W);

        }
        return res;
    }
}