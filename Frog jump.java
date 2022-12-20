//CODE STUDIO

import java.util.* ;
import java.io.*; 
public class Solution {
    
    static int f(int k,int heights[],int dp[]){
        if(k==0) return 0;
        if(dp[k]!=-1) return dp[k];
        int l=f(k-1,heights,dp)+Math.abs(heights[k]-heights[k-1]);
        int r=Integer.MAX_VALUE;
        if(k>1)
             r=f(k-2,heights,dp)+Math.abs(heights[k]-heights[k-2]);
        return dp[k]=Math.min(l,r);
    }
    
    public static int frogJump(int n, int heights[]) {
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        return f(n-1,heights,dp);
        
    }

}
