import java.util.*;
public class StringOperations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println("String Length: "+input.length());
        StringBuilder input1=new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println("Reversed String: "+input1);
        String newInput= sc.next();
        String concate=input.concat(newInput);
        System.out.println("concatenate :"+concate);
        System.out.println("Equals: " +newInput.equals(input));
        String string1=concate.substring(0,input.length());
        String string2=concate.substring(input.length(),concate.length());
        System.out.println("First: "+string1+" "+"second: "+string2);

    }
}
