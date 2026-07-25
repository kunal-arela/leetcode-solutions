// 3536. Maximum Product of Two Digits (Easy)
// https://leetcode.com/problems/maximum-product-of-two-digits/

class Solution {
    public int maxProduct(int n) {
        int [] arr = new int[10];
        int i = 0;
        while(n != 0){
            int digit = n % 10;
           arr[i] = digit;
           n = n/10;
           i++;
        }
        Arrays.sort(arr);
        int a = arr[arr.length - 1];
        int b = arr[arr.length - 2];

      return a * b;
        
    }
}