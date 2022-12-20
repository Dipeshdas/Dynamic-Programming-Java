package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class fibonacci_dp {

    //MEMOIZATION T.C=O(N) && S.C=O(N) for(Array) + O(N) for(recursive stack);
    /*
    public static int fibo(int n, int []dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
     */


    public static void main(String[] args) {
        int n=7;
        //Memoization
        /*
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(fibo(n,dp));
         */

        //TABULATION T.C=O(N) && S.C=O(N) for(Array);
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);

        //SPACE OPTIMIZATION T.C=O(N) && S.C=O(1);
//        int prev=1;
//        int prev2=0;
//        for(int i=2;i<=n;i++){
//            int cur_i=prev+prev2;
//            prev2=prev;
//            prev=cur_i;
//        }
//        System.out.println(prev);


    }
}
