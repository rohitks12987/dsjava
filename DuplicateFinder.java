import java.util.HashSet;
import java.util.Scanner;

public class DuplicateFinder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];

        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        findDuplicates(numbers);

        scanner.close();
    }

    private static void findDuplicates(int[] numbers)
    {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers)
        {
            if (!seen.add(number)) {   // if already exists
                duplicates.add(number);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate numbers found.");
        } else {
            System.out.println("Duplicate numbers are: " + duplicates);
        }
    }
}