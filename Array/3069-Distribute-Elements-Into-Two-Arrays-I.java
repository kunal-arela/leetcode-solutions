// 3069. Distribute Elements Into Two Arrays I (Easy)
// https://leetcode.com/problems/distribute-elements-into-two-arrays-i/

class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            if (arr1[a - 1] > arr2[b - 1]) {
                arr1[a] = nums[i];
                a++;
            } else {
                arr2[b] = nums[i];
                b++;
            }
        }
        for (int i = 0; i < a; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            result[a + i] = arr2[i];
        }

        return result;
    }
}