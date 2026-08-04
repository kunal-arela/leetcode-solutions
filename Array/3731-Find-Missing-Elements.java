// 3731. Find Missing Elements (Easy)
// https://leetcode.com/problems/find-missing-elements/

import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int[] arr = new int[max - min + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + i;
        }

        List<Integer> ans = new ArrayList<>();

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (j < nums.length && nums[j] == arr[i]) {
                j++;
            } else {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}