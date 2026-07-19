// 1081. Smallest Subsequence of Distinct Characters (Medium)
// https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

import java.util.*;

class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (visited[c - 'a']) continue;
            
            while (!stack.isEmpty() && c < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                visited[stack.pop() - 'a'] = false;
            }
            
            stack.push(c);
            visited[c - 'a'] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
