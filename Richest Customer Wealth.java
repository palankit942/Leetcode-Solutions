class Solution {
    public int maximumWealth(int[][] accounts) {
        int cus, maxw = 0;
        for(int[] account:accounts) {
            cus=0;
            for(int item:account) {
                cus+=item;
            }
            if(maxw<cus) {
                maxw=cus;
            }
        }
        return maxw;
    }
} 
