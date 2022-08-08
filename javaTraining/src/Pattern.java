import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String m=sc.next();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
            }
            for(int k=size-i-1;k>0;k--){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
