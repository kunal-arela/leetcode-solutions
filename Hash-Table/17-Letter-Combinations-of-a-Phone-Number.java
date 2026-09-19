// 17. Letter Combinations of a Phone Number (Medium)
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", ans, map);

        return ans;
    }

    public void backtrack(String digits, int index, String current,
                           List<String> ans, String[] map) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            backtrack(
                digits,
                index + 1,
                current + letters.charAt(i),
                ans,
                map
            );
        }
    }
}