import java.util.*;
public class linearsearch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean flag=false;
        int i;
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you are searching for: ");
        int key=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
            System.out.println("Element found at index "+i);
            flag=true;
            break;
            }
        }
        if(!flag)
        System.out.println("Element not found");
    }
}
