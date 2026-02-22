import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int n, sum = 0;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter size of the array: ");
        n = scanner.nextInt();
int[] array = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); 
            sum += array[i]; 
        }
        System.out.println("Sum of the array is: " + sum);
        scanner.close();
    }
}
