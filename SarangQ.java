import java.util.*;
public class SarangQ 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elemnts in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i=0;
        boolean flag=false;
        boolean checkprint=false; 
        System.out.println("Enter array elements: ");
        for( ;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if(j!=k && arr[k]==arr[j])
                {
                flag=true;
                if(!checkprint)
                {
                System.out.println(arr[j]+" is a repeated element");
                checkprint=true;
                }
                break;
                }
            }
        }
        if(!flag) // i.e. if false
        System.out.println("No element is repeated");
        // else
        // System.out.println("No element is repeated");
    }
}



// for count

// import java.util.*;

// public class question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of elements in array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int i = 0;
//         boolean flag = false;
//         System.out.println("Enter array elements: ");
//         for (; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int j = 0; j < n; j++) {
//             int count = 0; // Variable to count repetitions for the current element

//             for (int k = 0; k < n; k++) {
//                 if (j != k && arr[k] == arr[j]) {
//                     flag = true;

//                     // Increase the count for each repetition
//                     count++;
//                 }
//             }

//             // Check if the element is repeated and print the count
//             if (count > 0) {
//                 System.out.println("Element " + arr[j] + " is repeated " + count + " times");
//             }
//         }

//         if (!flag)
//             System.out.println("No element is repeated");
//     }
// }
