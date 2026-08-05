// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold (Medium)
// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for(int i = 0;i<k;i++){
          sum += arr[i];
        }
        if(sum/k >= threshold){
            count++;
        }
         for(int i = k;i<n;i++){
           sum -= arr[i - k];
           sum += arr[i];
           int avg =  sum/k;
           if(avg >= threshold){
            count++;
           }
         }
         return count;
         
    }
}