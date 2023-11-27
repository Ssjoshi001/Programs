import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt(), sum=0,i=1;
        //sum= (n*(n+1))/2;
        for(;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of first "+n+" natural numbers is:"+sum);
    }
}
