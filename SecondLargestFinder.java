import java.util.Scanner;

public class SecondLargestFinder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = findSecondLargest(numbers);

        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be equal).");
        } else {
            System.out.println("The second largest number is: " + result);
        }

        scanner.close();
    }

    private static int findSecondLargest(int[] numbers)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers)
        {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}