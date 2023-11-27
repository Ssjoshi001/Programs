package Functions;
import java.util.*;
public class dec2bin 
{
    public static void convert(int n)
    {
        int copy=n;
        int rem;
        int power=0;
        int binary=0;
        while(n>0)
        {
            rem=n%2;
            binary+=(rem*(int)Math.pow(10,power));
            //type caste because pow() return value in double
            power++;
            n=n/2;
        }
        System.out.println("Binary of "+copy+" = "+binary);
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        convert(n);
    }
}
