// 852. Peak Index in a Mountain Array (Medium)
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int max = arr[0];
        for(int i = 0;i<n;i++){
          if(arr[i] > max){
            max = arr[i];
            ans = i;
          }
        }
        return ans;
    }
}