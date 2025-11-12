import java.util.*;
public class Main{
    public static void helper(int n, List<Integer> ans){
        if(n==1){
            ans.add(1);
            return;
        }
        ans.add(n);
        for(int i=1;i<n;i++){
            ans.add(i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        helper(n,ans);
        for(int num : ans){
            System.out.print(num +" ");
        }
    }
}
