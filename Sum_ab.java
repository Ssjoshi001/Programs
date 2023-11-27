/**
 * Sum_ab
 */
import java.util.*;
 public class Sum_ab {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int sum=0;
        sum=a+b;
        System.out.println("Sum of "+a+" & "+b+"= "+sum);
    }
}