// 3718. Smallest Missing Multiple of K (Easy)
// https://leetcode.com/problems/smallest-missing-multiple-of-k/

class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
     HashSet<Integer> set = new HashSet<>();
     for(int num : nums){
        set.add(num);
     }
     int multi = k;
     while(set.contains(multi)){
       multi += k;
     }

return multi;
    }
}