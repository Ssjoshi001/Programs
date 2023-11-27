package Functions;
import java.util.*;
public class product {
    
    public static void mul(int a, int b)
    {
        int product=a*b;
        System.out.println("Product = "+product);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        mul(a,b);
    }
}
