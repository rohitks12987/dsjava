import java.util.Scanner;

public class RemoveSecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] < largest)
            {
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("Second largest element not found.");
            sc.close();
            return;
        }

        System.out.println("Second Largest Element = " + secondLargest);

        System.out.print("Array after removing 2nd largest: ");
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != secondLargest)
                System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}