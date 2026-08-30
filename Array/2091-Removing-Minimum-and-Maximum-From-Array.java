// 2091. Removing Minimum and Maximum From Array (Medium)
// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/

class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex) + 1;
        int right = n - Math.max(minIndex, maxIndex);

        int bothFront = Math.max(minIndex, maxIndex) + 1;
        int bothBack = n - Math.min(minIndex, maxIndex);

        return Math.min(
            Math.min(bothFront, bothBack),
            left + right
        );
    }
}