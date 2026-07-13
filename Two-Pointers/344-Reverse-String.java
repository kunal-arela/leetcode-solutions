// 344. Reverse String (Easy)
// https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        while(low < high){
            char Temp = s[low];
            s[high] = s[low];
             Temp = s[low];
            low++;
            high--;
        }
    }
}