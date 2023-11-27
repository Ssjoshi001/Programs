
//Optimised code for prime number without using corner cases

import java.util.*;
class P{
    public static void main(String[] args) {
        int n,i=2;boolean div=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();

        /*we used root of n because after one point factors start repeating 
        and the max value a factor can reach is sqrt(n)*/

        for(;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
            div=false;
            break;
            }
        }
        if(div==true)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
    }
}