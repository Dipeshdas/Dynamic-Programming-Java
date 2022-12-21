// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

//Example-1
// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.

class Solution {
    
    //Memoization
    // public int f(int n,int co[],int dp[]){
    //     if(n==0) return co[0];
    //     if(n==1) return co[1];

    //     if(dp[n]!=-1) return dp[n];

    //     return dp[n]=Math.min(f(n-1,co,dp),f(n-2,co,dp))+co[n];

    // }

    public int minCostClimbingStairs(int[] cost) {

        //Memoization
        // int n=cost.length;
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // return Math.min(f(n-1,cost,dp),f(n-2,cost,dp));

        //Tabulation
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);


        //Space optimization
        // int n=cost.length;
        // int prev2=cost[0];
        // int prev1=cost[1];

        // for(int i=2;i<n;i++){
        //     int cur=cost[i]+Math.min(prev2,prev1);
        //     prev2=prev1;
        //     prev1=cur;
        // }
        // return Math.min(prev1,prev2);

    }
}
