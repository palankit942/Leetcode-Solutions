class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            a += nums[i];
        }    
        int b = ((nums.length + 1) * nums.length) / 2;
        return b - a
            ;
    }
}
