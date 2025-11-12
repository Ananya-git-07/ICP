import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int minTotal=n*(a-b);
            int maxTotal=n*(a+b);
            if(minTotal<=c+d && maxTotal>=c-d)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}