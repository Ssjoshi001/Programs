package Functions;
import java.util.*;
public class factorial 
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
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(n+"! = "+fact(n)); 
    }
}
