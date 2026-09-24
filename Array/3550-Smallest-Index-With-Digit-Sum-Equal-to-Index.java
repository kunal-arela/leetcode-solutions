// 3550. Smallest Index With Digit Sum Equal to Index (Easy)
// https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
      
  for(int i = 0;i<n;i++){
      int sum = 0;
      int num = nums[i];
  if(nums[i] < 10){
    sum = nums[i];
  }else{
    while(num > 0){
    int digit = num % 10;
    sum += digit;
    num = num/10;
    }
  }
   if(sum == i){
    return i;
   }
  
  }
  return -1;
    }
}