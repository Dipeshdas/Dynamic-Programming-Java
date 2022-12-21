class Solution {

    // int f(int n,int dp[]){
    //     if(n<=1) return n;
    //     if(n==2) return 1;
    //     if(dp[n]!=-1) return dp[n];

    //     return dp[n]=f(n-1,dp)+f(n-2,dp)+f(n-3,dp);
    // }


    //Tabulation
    int dp[]=new int[38];

    public int tribonacci(int n) {
        
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // return f(n,dp);

        //Tabulation
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
        
    }
}
