package Patterns;

public class Floyds {
    public static void main(String[] args) {
        int i,j,sum=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(sum+" ");
                sum++;
            }
        System.out.println();
        }
    }
}
