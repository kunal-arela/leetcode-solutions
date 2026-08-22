// 3622. Check Divisibility by Digit Sum and Product (Easy)
// https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

class Solution {
    public boolean checkDivisibility(int n) {
        int orig = n;
        int sum = 0;
        int pro = 1;
        while(n >0){
            int digit = n % 10;
            sum += digit;
            pro *= digit;
            n = n/10;
        }int Sum1 = sum + pro;
        if(orig %  Sum1  == 0 ){
            return true;
        }
        return false;

    }
}