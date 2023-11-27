package Functions;
import java.util.*;
public class bin2dec 
{
    public static void convert(int n)
    {
        int power=0,sum=0;
        int copy=n;
        while(n>0)
        {
            int lastdigit=n%10;
            sum+=(lastdigit*(int)Math.pow(2,power));
            //type caste because pow() return value in double
            power++;
            n/=10;
        }
        System.out.print("Decimal of "+copy+" = "+sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number in binary: ");
        int n=sc.nextInt();
        convert(n);
    }
}
