// 904. Fruit Into Baskets (Medium)
// https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int left = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {

            // Add fruit to window
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 types → shrink
            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Current window is valid
            int len = right - left + 1;
            max = Math.max(max, len);
        }

        return max;
    }
}