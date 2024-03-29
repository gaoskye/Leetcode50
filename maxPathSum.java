class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        dfs(root);
        return ans;     
    }  
    
    private int dfs(TreeNode root) {
        if(root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int temp = Math.max(left,right);
        if(temp > 0)
            temp += root.val;
        else
            temp = root.val;
        
        int val = root.val;
        if(left >= 0)
            val += left;
        if(right >= 0)
            val += right;
        
        ans = Math.max(ans,val);
        return temp;
    }
}
