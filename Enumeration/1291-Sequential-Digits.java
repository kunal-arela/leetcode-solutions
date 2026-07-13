// 1291. Sequential Digits (Medium)
// https://leetcode.com/problems/sequential-digits/


class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
       
        for (int i = 1; i <= 9; i++) {
            int num = i;
          
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                
             
                if (num >= low && num <= high) {
                    result.add(num);
                }
           
                if (num > high) {
                    break;
                }
            }
        }
        
    
        result.sort(Integer::compareTo);
        return result;
    }
}