class Solution {
    
      int dp[]=new int[46];

    int f(int n,int dp[]){
        if(n==1) return 1;
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];
        int left=f(n-1,dp);
        int right=f(n-2,dp);

        return dp[n]=left+right;
    }

    public int climbStairs(int n) {
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);

        

        // if(n<=3){
        //     return n;
        // }
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=2;
        // dp[3]=3;
        
        // for(int i=4;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
    }
}
