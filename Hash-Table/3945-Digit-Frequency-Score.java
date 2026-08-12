// 3945. Digit Frequency Score (Easy)
// https://leetcode.com/problems/digit-frequency-score/

class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n/10;

        }
        return sum;
    }
}