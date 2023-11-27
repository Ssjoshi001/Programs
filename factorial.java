import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int fact=1,i=n;
        for(;i>0;i--)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is= "+fact);
    }
}
