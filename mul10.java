import java.util.Scanner;

/**
 Tkae input from user unless its not a multiple of 10
 */
public class mul10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter your number:");
            int n=sc.nextInt();
            if(n%10==0)
            {
                if(n==0)
                {
                    System.out.println("Enter non zero number");
                    break;
                }
                else
                {
                    System.out.println("Multiple of 10");
                    break;
                }
            }
             System.out.println(n);
        }
    }
}