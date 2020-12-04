class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> list = new ArrayList<>();
        boolean[] input = new boolean[nums.length+1];
        for (int i=0;i<nums.length;i++)
            input[nums[i]] = true;
        for(int i=1;i<input.length;i++) {
            if (!input[i])
                list.add(i);
        }
        return list;
    }
}
