// 3940. Limit Occurrences in Sorted Array (Easy)
// https://leetcode.com/problems/limit-occurrences-in-sorted-array/

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        
        int[] result = new int[nums.length];
        int writeIndex = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
           
            if (i > 0 && nums[i] != nums[i - 1]) {
                count = 0;
            }
        
            if (count < k) {
                result[writeIndex] = nums[i];
                writeIndex++;
                count++;
            }
        }
        
        int[] finalResult = new int[writeIndex];
        System.arraycopy(result, 0, finalResult, 0, writeIndex);
        return finalResult;
    }
}