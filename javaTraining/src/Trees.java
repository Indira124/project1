import java.util.*;
public class Trees {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rowSize=sc.nextInt();
        int columnSize=sc.nextInt();
        int treeNumber=sc.nextInt();
        if(treeNumber%rowSize==1 || treeNumber%columnSize==0 || treeNumber<rowSize || treeNumber<columnSize){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
