// 443. String Compression (Medium)
// https://leetcode.com/problems/string-compression/

class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            chars[write] = ch;
            write++;
            if (count > 1) {
                String s = String.valueOf(count);
                for (char c : s.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }
}