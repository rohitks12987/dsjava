import java.util.*;

// Node class for Linked List
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DSAPrograms {

    // 1. Linear Search
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // 2. Binary Search
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // 3. Bubble Sort
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 4. Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // 5. Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // 6. Factorial using Recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // 7. Fibonacci using Recursion
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 8. Stack Implementation using Array
    static class Stack {
        int top = -1;
        int size = 5;
        int arr[] = new int[size];

        void push(int x) {
            if (top == size - 1) {
                System.out.println("Stack Overflow");
            } else {
                arr[++top] = x;
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println("Popped: " + arr[top--]);
            }
        }
    }

    // 9. Queue Implementation using Array
    static class Queue {
        int front = 0, rear = -1, size = 5;
        int arr[] = new int[size];

        void enqueue(int x) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
            } else {
                arr[++rear] = x;
            }
        }

        void dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
            } else {
                System.out.println("Dequeued: " + arr[front++]);
            }
        }
    }

    // 10. Linked List Traversal
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main Method
    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 3};

        System.out.println("Linear Search: " + linearSearch(arr, 9));

        Arrays.sort(arr); // for binary search
        System.out.println("Binary Search: " + binarySearch(arr, 3));

        bubbleSort(arr);
        System.out.println("Bubble Sorted: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Selection Sorted: " + Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("Insertion Sorted: " + Arrays.toString(arr));

        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 6: " + fibonacci(6));

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.pop();

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();

        // Linked List
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        display(head);
    }
}