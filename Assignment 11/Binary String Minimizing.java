import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            String str=sc.next();
            StringBuilder sb=new StringBuilder(str);
            long count=0;
            for(int i=0;i<n;i++){
                if(sb.charAt(i)=='1'){
                    count++;
                }
                else{
                    long x=Math.min(k,count);
                    if(x>0){
                        swap(sb,i,(int)(i-x));
                    }
                    k=k-x;
                }
            }
          System.out.println(sb.toString());
        }
    }
    public static void swap(StringBuilder sb, int i,int  j){
        char temp=sb.charAt(i); 
        sb.setCharAt(i,sb.charAt(j)); 
        sb.setCharAt(j,temp);
    }
}