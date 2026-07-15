// 3658. GCD of Odd and Even Sums (Easy)
// https://leetcode.com/problems/gcd-of-odd-and-even-sums/

class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n == 1){
            return n;
        }
        int sumodd = 0;
       int evensum = 0;
       int count = 0;
       int i = 0; 
       int a = 0;
      while(count < n*2){
       if(i % 2 != 0){
        sumodd += i;
         count++;
       }else if(i % 2 == 0){
        evensum += i;
        count++;
       }
        i++;
      }
      int m = Math.min(sumodd , evensum);
      int p = Math.max(sumodd , evensum);
      for(int j= m;j>0;j--){
        if(m % j == 0 && p % j == 0){
           a = j;
           break;
        }
      }
      return a;
     
    }
}