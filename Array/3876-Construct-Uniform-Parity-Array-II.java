// 3876. Construct Uniform Parity Array II (Medium)
// https://leetcode.com/problems/construct-uniform-parity-array-ii/

class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            }
        }

        // No odd number -> all are even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        for (int x : nums1) {
            if (x % 2 == 0 && x < minOdd) {
                return false;
            }
        }

        return true;
    }
}