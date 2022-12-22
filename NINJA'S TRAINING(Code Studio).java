import java.util.*;
public class Solution {
    //Memoization
//     static int f(int day,int last, int points[][],int dp[][]){
//         if(dp[day][last]!=-1) return dp[day][last];
        
//         if(day==0){
//             int maxp=0;
//             for(int task=0;task<=2;i++){
//                 if(task!=last){
//                     maxp=Math.max(maxp,points[0][task]);
//                 }
//             }
//             return dp[day][last]=maxp;
//         }
        
//         int maxp=0;
//         for(int task=0;task<=2;task++){
//             if(task!=last){
//                 int totalPoints=points[day][task]+f(day-1,task,points,dp);
//                 maxp=Math.max(maxp,totalPoints);
//             }
//         }
//         return dp[day][last]=maxp;
    
//     }
    public static int ninjaTraining(int n, int points[][]) {
        //Memoization
//             int dp[][]=new int[n][4];
//             for(int[]arr:dp){
//                 Arrays.fill(arr,-1);
//             }
//             return f(n-1,3,points,dp);
        
        //Tabulation
//             int dp[][]=new int[n][4];
            
//         dp[0][0]=Math.max(points[0][1],points[0][2]);
//         dp[0][1]=Math.max(points[0][0],points[0][2]);
//         dp[0][2]=Math.max(points[0][0],points[0][1]);
//         dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
        
//         for(int day=1;day<n;day++){
//             for(int last=0;last<4;last++){
//                 dp[day][last]=0;
//                 for(int task=0;task<3;task++){
//                     if(task!=last){
//                         int point=points[day][task]+dp[day-1][task];
//                         dp[day][last]=Math.max(dp[day][last],point);
//                     }
//                 }
//             }
//         }
//         return dp[n-1][3];
        
        //Space optimization
        int prev[]=new int [4];
        prev[0]=Math.max(points[0][1],points[0][2]);
        prev[1]=Math.max(points[0][0],points[0][2]);
        prev[2]=Math.max(points[0][0],points[0][1]);
        prev[3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
        
        for(int day=1;day<n;day++){
            int temp[]=new int[4];
            for(int last=0;last<4;last++){
                temp[last]=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point=points[day][task]+prev[task];
                        temp[last]=Math.max(temp[last],point);
                    }
                }
                
            }
            prev=temp;
        }
        return prev[3];

        
    }

}
