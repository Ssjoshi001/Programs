import java.util.*;

public class Incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        int inc= sc.nextInt();
        double tax=0;
        if(inc>+0 && inc<500000)
        {
        tax=0;
        System.out.println("Your tax on income amount "+inc+" is: "+(int)tax);
        }
        else if(inc>=500000 && inc<=1000000)
        {tax= inc*(0.2);
        System.out.println("Your tax on income amount "+inc+" is: "+(int)tax);}
        else if(inc>1000000)
        {tax=inc*(0.3);
        System.out.println("Your tax on income amount "+inc+" is: "+(int)tax);}
        else
        {System.out.println("Enter valid amount");}

    }
}
