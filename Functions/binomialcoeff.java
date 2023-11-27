package Functions;
import java.util.*;
public class binomialcoeff
{
    public static int fact(int n)
    {
        int fact=1;
        if(n==0)
        {
            return fact;
        }
        else
        {
            for(int i=n;i>=1;i--)
            {
                fact*=i;
            }
           return fact;
        }
    }
    public static int coeff(int n,int r)
    {
        int coefficient=fact(n)/(fact(r)*fact(n-r));
        return coefficient;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(n+"! = "+fact(n)); 
        System.out.println("Binomial Coefficient= "+coeff(n, r));

    }
}
