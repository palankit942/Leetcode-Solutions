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
// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

// Find all the elements of [1, n] inclusive that do not appear in this array.

// Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
