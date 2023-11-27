import java.util.*;
/**
 Skip multiples of 10
 */
public class mul10_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter numbers: ");
            int n=sc.nextInt();
            if(n%10==0)
            {
                System.out.println("Skipped because number is a multiple of 10");
                continue;
            }
            System.out.println(n);
        }
    }
}
