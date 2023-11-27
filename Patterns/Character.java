package Patterns;
// Used ASCII values and type casting
public class Character {
    public static void main(String[] args) {
        int i,j,a=65;
        // char ch='A';
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)a);
                a++;
            }
        System.out.println();
        }
    }
}
