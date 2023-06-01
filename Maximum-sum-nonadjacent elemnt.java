import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
    
//     static int f(int k,ArrayList<Integer> nums,int dp[]){
//         if(k<0) return 0;
//         if(k==0) return nums.get(0);
	
//         if(dp[k]!=-1) return dp[k];  
	
//         int incl=f(k-2,nums,dp)+nums.get(k);
//         int excl=f(k-1,nums,dp)+0;
        
//         return dp[k]=Math.max(incl,excl);
        
//     } 
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
// 		int n=nums.size();
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         return f(n-1,nums,dp);
        
        //Tabulation
//         int n=nums.size();
//         int dp[]=new int[n];
//         Arrays.fill(dp,0);
//         dp[0]=nums.get(0);
        
//         for(int i=1;i<n;i++){
//             int incl=nums.get(i);
//             if(i>1) incl+=dp[i-2];
//             int excl=dp[i-1]+0;
            
//             dp[i]=Math.max(incl,excl);
//         }
//         return dp[n-1];
        
        //Space Optimization
        int n=nums.size();
        int prev2=0;
        int prev=nums.get(0);
        
        for(int i=1;i<n;i++){
            int incl=prev2+nums.get(i);
            int excl=prev+0;
            int ans=Math.max(incl,excl);
            prev2=prev;
            prev=ans;
        }
        return prev; 
	}
}
