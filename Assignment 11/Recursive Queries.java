import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        while (Q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int k=sc.nextInt();
           int[] dp=new int[r+1];
            int count=0;
            for (int i=l;i<=r;i++){
                if(helper(i,k,dp)==k){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static int helper(int n,int k,int[] dp){
        if(dp[n] !=0){
            return dp[n]; 
        }
        int t=n;
        while(n>=10){ 
            int product=1;
            int temp=n;
            while(temp>0){
                int digit=temp%10;
                if(digit!=0){
                    product*=digit;
                }
                temp/=10;
            }
            n=product; 
        }
        dp[t]=n;
        return n;
    }
}
