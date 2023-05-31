import java.util.* ;
import java.io.*; 
public class Solution {
    
    //Memoization
    
//     static int f(int k,int heights[],int dp[]){
//         if(k==0) return 0;
//         if(dp[k]!=-1) return dp[k];
//         int l=f(k-1,heights,dp)+Math.abs(heights[k]-heights[k-1]);
//         int r=Integer.MAX_VALUE;
//         if(k>1)
//              r=f(k-2,heights,dp)+Math.abs(heights[k]-heights[k-2]);
//         return dp[k]=Math.min(l,r);
//     }
    
    public static int frogJump(int n, int heights[]) {
        //Tabulation
//         int dp[]=new int [n];
//         Arrays.fill(dp,-1);
//         dp[0]=0;
//         for(int i=1;i<n;i++){
//             int l=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
//             int r=Integer.MAX_VALUE;
//             if(i>1)
//                  r=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
//             dp[i]=Math.min(l,r);
//         }
//         return dp[n-1];
        
        //Space Optimization
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){
            int l=prev+Math.abs(heights[i]-heights[i-1]);
            int r=Integer.MAX_VALUE;
            if(i>1)
                 r=prev2+Math.abs(heights[i]-heights[i-2]);
            int cur=Math.min(l,r);
            prev2=prev;
            prev=cur;
        }
        return prev;     
    }

}
