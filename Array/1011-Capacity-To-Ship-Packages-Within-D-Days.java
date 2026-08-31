// 1011. Capacity To Ship Packages Within D Days (Medium)
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int current = 0;
            int countDays = 1;
            for (int w : weights) {
                if (current + w > mid) {
                    countDays++;
                    current = 0;
                }
                current += w;
            }
            if (countDays <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}