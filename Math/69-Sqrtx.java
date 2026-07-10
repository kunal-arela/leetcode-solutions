// 69. Sqrt(x) (Easy)
// https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        int ans = 0;

        for (int i = 0; (long)i * i <= x; i++) {
            ans = i;
        }

        return ans;
    }
}