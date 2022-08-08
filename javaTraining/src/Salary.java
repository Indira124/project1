import java.util.*;
public class Salary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sun=sc.nextInt();
        int mon=sc.nextInt();
        int tue=sc.nextInt();
        int wed=sc.nextInt();
        int thu=sc.nextInt();
        int fri=sc.nextInt();
        int sat=sc.nextInt();
        int total=mon+tue+wed+thu+fri+sat+sun;
        int sal=0;
        if(total>40){
            sal=sal*100+(total-40)*25;
        }
        else {
            sal=sal+(sat*100)+(sat*25/100)+(sun*100)+(sun*50/100);
            if (mon <= 8)
                sal=sal+mon*100;
            else
                sal=sal+mon*100+(mon-8)*15;
            if (tue <= 8)
                sal=sal+tue*100;
            else
                sal=sal+tue*100+(tue-8)*15;
            if (wed <= 8)
                sal=sal+wed*100;
            else
                sal=sal+wed*100+(wed-8)*15;
            if (thu <= 8)
                sal=sal+thu*100;
            else
                sal=sal+thu*100+(thu-8)*15;
            if (fri <= 8)
                sal=sal+fri*100;
            else
                sal=sal+fri*100+(fri-8)*15;

        }
        System.out.println(sal);
    }
}
