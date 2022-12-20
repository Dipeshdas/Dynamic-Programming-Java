class Solution {
    
      int dp[]=new int[46];

    public int climbStairs(int n) {

        // if(n==1) return 1;
        // if(n==0) return 1;

        // int left=climbStairs(n-1);
        // int right=climbStairs(n-2);

        // return left+right;

        if(n<=3){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
