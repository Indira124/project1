import java.util.*;
public class CollatzSequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int n;
        while(input>1){
            if(input%2==0){
               n=input/2;
               System.out.print(input+" -> ");
            }
            else {
                n = 3 * input + 1;
                System.out.print(input + " -> ");
            }
            input=n;
        }
        System.out.print(1);
    }
}
