// 367. Valid Perfect Square (Easy)
// https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i = 0;i<=num;i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
}