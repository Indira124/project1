import java.util.*;
public class MyDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        int x=a-n;//5
        int y=b-n;//15
        int z=c-n;//-5
        int posiMin=x;
        if(posiMin>y && y > 0)
            System.out.println("L2");
        else if(posiMin>z && z > 0)
            System.out.println("L3");
        else
            System.out.println("L1");
    }
}