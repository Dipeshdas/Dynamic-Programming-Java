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
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int prev2=cost[0];
        int prev1=cost[1];

        for(int i=2;i<n;i++){
            int cur=cost[i]+Math.min(prev2,prev1);
            prev2=prev1;
            prev1=cur;
        }
        return Math.min(prev1,prev2);

    }
}
