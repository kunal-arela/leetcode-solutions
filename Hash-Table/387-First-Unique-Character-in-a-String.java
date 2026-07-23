// 387. First Unique Character in a String (Easy)
// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int [] arr = new int[26];
        char [] ch = s.toCharArray();
        for(int i = 0;i<ch.length;i++){
            arr[ch[i] - 'a']++;    
        }
         for(int i = 0;i<ch.length;i++){
             if(arr[ch[i] - 'a'] == 1){
                return i;
               
            }
           
        }
        return -1;
    }
}