class Solution {
    public static void solve(int[] nums,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ans,int i){

        if(i==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        solve(nums,res,ans,i+1);
        ans.remove(ans.size()-1);
        solve(nums,res,ans,i+1);



    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        solve(nums,res,ans,0);
        return (List)res;
    }
}