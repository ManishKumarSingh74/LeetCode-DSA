class Solution {
    public int solve(int amount,int[] coins,int i,int[][] dp){

        if(amount==0){
            return 1;
        }


        if(i==coins.length || amount < 0) return 0;

        if(dp[amount][i]!=-1) return dp[amount][i];

        int skip = solve(amount,coins,i+1,dp);
        int take = 0;
        if(amount>=coins[i]){
            take = solve(amount-coins[i],coins,i,dp);
        }

        return dp[amount][i] = take+skip;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length+1];
        for(int i=0;i<amount+1;i++){
            for(int j=0;j<coins.length+1;j++){
                dp[i][j] = -1;
            }
        }
        return solve(amount,coins,0,dp);
    }
}