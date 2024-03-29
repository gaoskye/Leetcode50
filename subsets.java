   public class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> temp = new ArrayList<Integer>();
            dfs(res, temp, nums, 0);
            return res;
        }
        private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
            res.add(new ArrayList<Integer>(temp));
            for(int i = j; i < nums.length; i++) {
                temp.add(nums[i]);  //加入 nums[i]
                dfs(res, temp, nums, i + 1);  //递归
                temp.remove(temp.size() - 1);  //移除 nums[i]
            }
        }
    }

