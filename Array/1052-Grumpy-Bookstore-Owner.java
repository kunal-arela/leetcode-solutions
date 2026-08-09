// 1052. Grumpy Bookstore Owner (Medium)
// https://leetcode.com/problems/grumpy-bookstore-owner/

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int satisfied = 0;
        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i];
            }
        }
        int Max = 0;
        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1){
                Max += customers[i];
            }
        }
        int sum = Max;
        for(int i = minutes; i < n; i++){
            if(grumpy[i] == 1){
                Max += customers[i];
            }
            if(grumpy[i - minutes] == 1){
                Max -= customers[i - minutes];
            }

            sum = Math.max(sum, Max);
        }

        return satisfied + sum;
    }
}