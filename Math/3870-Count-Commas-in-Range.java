// 3870. Count Commas in Range (Easy)
// https://leetcode.com/problems/count-commas-in-range/

class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n < 1000){
            return 0;
        }else{
           count = n - 999;
        }
        return count;
     
    }
}