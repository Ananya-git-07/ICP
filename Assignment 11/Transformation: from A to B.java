import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      ArrayList<Integer> list=new ArrayList<>();
      if(helper(list,a,b)){
          System.out.println("YES");
          System.out.println(list.size());
          for(int i=0;i<list.size();i++){
              System.out.print(list.get(i)+" ");
          }
      }
      else{
          System.out.println("NO");
      }
    }
    public static boolean helper(ArrayList<Integer> list,int a,int b){
           if(b==a){
               list.add(0,b);
               return true;
           }
           list.add(0,b);
           if(b<a){
               return false;
           }
           if(b%2==0){
               return helper(list,a,b/2);
           }
           else if(b%10==1){
               return helper(list,a,b/10);
           }
           else{
               return false;
           }
       }
    }