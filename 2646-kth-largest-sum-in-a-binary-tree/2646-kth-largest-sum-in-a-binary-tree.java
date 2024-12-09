class Solution {
    private long[] sums = new long[100000];
    private int maxLevel = 0;

    private void solve(TreeNode root, int lvl) {
        if (root == null) return;

        // Add the node's value to its level sum
        sums[lvl] += root.val;

        // Update the maximum level
        maxLevel = Math.max(maxLevel, lvl);

        solve(root.left, lvl + 1);
        solve(root.right, lvl + 1);
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        solve(root, 0);

        // Sort only the part of sums that has non-zero values, i.e., up to maxLevel + 1
        Long[] validSums = new Long[maxLevel + 1];
        for (int i = 0; i <= maxLevel; i++) {
            validSums[i] = sums[i];
        }
        Arrays.sort(validSums, Collections.reverseOrder());

        // Check if the k-th largest level exists
        return (k > maxLevel + 1) ? -1 : validSums[k - 1];
    }
}