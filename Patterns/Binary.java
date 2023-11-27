package Patterns;

/**
 * 1_0
 */
public class Binary{

    public static void main(String[] args) {
        int i,j,sum=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                sum=i+j;
                if(sum%2==0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
        System.out.println();
        }
    }
}