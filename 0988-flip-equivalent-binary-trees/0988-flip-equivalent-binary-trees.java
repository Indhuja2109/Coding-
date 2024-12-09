class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // \U0001f60e Base case: both nodes are null, trees are flip equivalent at this point.
        if (root1 == null && root2 == null) return true;
        
        // ❌ If one node is null and the other isn't, they're not flip equivalent.
        if (root1 == null || root2 == null) return false;
        
        // ❌ If node values don't match, they can't be flip equivalent.
        if (root1.val != root2.val) return false;
        
        // \U0001f31f Check two possibilities:
        // 1️⃣ No flip needed: left with left and right with right.
        // 2️⃣ Flip needed: left with right and right with left.
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) || 
               (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}