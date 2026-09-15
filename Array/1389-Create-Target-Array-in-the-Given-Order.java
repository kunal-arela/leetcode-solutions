// 1389. Create Target Array in the Given Order (Easy)
// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}