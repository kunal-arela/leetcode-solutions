// 3664. Two-Letter Card Game (Medium)
// https://leetcode.com/problems/two-letter-card-game/

class Solution {
    public int score(String[] cards, char x) {
        int[] ox = new int[10]; // Counts for cards starting with x (xc)
        int[] xo = new int[10]; // Counts for cards ending with x (cx)
        int oo = 0;             // Count for cards with xx
        int lr = 0;             // Total count of one-sided cards

        for (String c : cards) {
            char first = c.charAt(0);
            char second = c.charAt(1);
            if (first == x && second == x) {
                oo++;
            } else if (first == x) {
                ox[second - 'a']++;
                lr++;
            } else if (second == x) {
                xo[first - 'a']++;
                lr++;
            }
        }

        // If we have enough 'xx' cards to pair with all one-sided cards
        if (oo >= lr) {
            return lr;
        }

        // Helper function to find maximum pairs from a one-sided frequency array
        // Max pairs you can form without matching identical characters together is min(sum / 2, sum - maxFreq)
        java.util.function.Function<int[], Integer> helper = cnt -> {
            int sum = 0, ma = 0;
            for (int val : cnt) {
                sum += val;
                ma = Math.max(ma, val);
            }
            if (sum < 2) return 0;
            return Math.min(sum / 2, sum - ma);
        };

        int cnt = lr - oo;
        int internal = helper.apply(ox) + helper.apply(xo);
        
        return Math.min(internal, cnt / 2) + oo;
    }
}