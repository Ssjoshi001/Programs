package Functions;
import java.util.*;
public class pallindrome 
{
    public static void ispallin(int n)
    {
        int sum=0;
        int rem;
        int copy=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+(rem);
            n/=10;
        }
        if(sum==copy)
        System.out.println("Pallindrome");
        else
        System.out.println("Not a Pallindrome");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        ispallin(n);
    }
}
