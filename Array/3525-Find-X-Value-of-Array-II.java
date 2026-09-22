// 3525. Find X Value of Array II (Hard)
// https://leetcode.com/problems/find-x-value-of-array-ii/

class Solution {
    static class Node {
        int[] remain = new int[5];
        int prod = 1;
    }

    static class SegmentTree {
        private final int n;
        private final int k;
        private final Node[] tree;

        public SegmentTree(int[] nums, int k) {
            this.n = nums.length;
            this.k = k;
            this.tree = new Node[4 * n];
            for (int i = 0; i < 4 * n; i++) {
                tree[i] = new Node();
            }
            build(nums, 0, 0, n - 1);
        }

        private Node merge(Node left, Node right) {
            Node node = new Node();
            node.prod = (left.prod * right.prod) % k;
            for (int i = 0; i < k; ++i) {
                node.remain[i] = left.remain[i];
            }
            for (int i = 0; i < k; ++i) {
                node.remain[(i * left.prod) % k] += right.remain[i];
            }
            return node;
        }

        private void build(int[] nums, int cur, int left, int right) {
            if (left == right) {
                tree[cur].remain[nums[left]] = 1;
                tree[cur].prod = nums[left];
                return;
            }
            int mid = (left + right) / 2;
            build(nums, 2 * cur + 1, left, mid);
            build(nums, 2 * cur + 2, mid + 1, right);
            tree[cur] = merge(tree[2 * cur + 1], tree[2 * cur + 2]);
        }

        public void update(int i, int val) {
            update(0, 0, n - 1, i, val);
        }

        private void update(int treeIndex, int lo, int hi, int i, int val) {
            if (lo == hi) {
                for (int j = 0; j < k; ++j) {
                    tree[treeIndex].remain[j] = 0;
                }
                tree[treeIndex].remain[val] = 1;
                tree[treeIndex].prod = val;
                return;
            }
            int mid = (lo + hi) / 2;
            if (i <= mid) {
                update(2 * treeIndex + 1, lo, mid, i, val);
            } else {
                update(2 * treeIndex + 2, mid + 1, hi, i, val);
            }
            tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2 * treeIndex + 2]);
        }

        public Node query(int i, int j) {
            return query(0, 0, n - 1, i, j);
        }

        private Node query(int treeIndex, int lo, int hi, int i, int j) {
            if (i <= lo && hi <= j) {
                return tree[treeIndex];
            }
            if (j < lo || hi < i) {
                return new Node();
            }
            int mid = (lo + hi) / 2;
            return merge(query(2 * treeIndex + 1, lo, mid, i, j), 
                         query(2 * treeIndex + 2, mid + 1, hi, i, j));
        }
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] %= k;
        }
        for (int[] q : queries) {
            q[1] %= k;
        }

        int n = nums.length;
        SegmentTree tree = new SegmentTree(nums, k);
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            tree.update(index, value);
            ans[i] = tree.query(start, n - 1).remain[x];
        }

        return ans;
    }
}