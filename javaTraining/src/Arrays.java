import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        int maximum=marks[0];
        int minimum=marks[0];
        for(int i=0;i<size;i++){
            if(maximum<marks[i])
                maximum=marks[i];
            if(minimum>marks[i])
                minimum=marks[i];
        }
        System.out.println("maximum = "+maximum);
        System.out.println("minimum = "+minimum);

    }
}

