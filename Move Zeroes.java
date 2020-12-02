class Solution {
    public void moveZeroes(int[] nums) {
        int zero=0;
        int i=0;
        while(i<nums.length)
        {
            if (nums[i]==0)
                zero++;
        
        else{
            nums[i- zero]=nums[i];
        }
        i++;
        }
         for(int j = 0; j < zero; j++) {
            nums[nums.length - 1 - j] = 0;
        }
    }
}
