// 1456. Maximum Number of Vowels in a Substring of Given Length (Medium)
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

class Solution {
    public int maxVowels(String s, int k) {
        char [] ch = s.toCharArray();
        int count = 0;
        for(int i = 0;i<k;i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' ||ch[i] == 'u' ){
                count++;
            }
        }
        int Max  = count;
         for(int i = 0;i<s.length();i++){
           

           Max = Math.max(max , count);
         }
         return Max;
        }
}