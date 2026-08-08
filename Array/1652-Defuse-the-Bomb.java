// 1652. Defuse the Bomb (Easy)
// https://leetcode.com/problems/defuse-the-bomb/

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        if (k == 0) {
            return arr;
        }
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
                arr[i] = sum;
            }
        }
        else { 
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}