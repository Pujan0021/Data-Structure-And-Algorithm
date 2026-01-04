
import java.util.Scanner;

public class LinearQueue {

    static int N = 10; //Max Size of Queue
    static int[] queue = new int[N];
    static int F = -1;
    static int R = -1;

    // Method to check if the queue is full
    public static boolean isFull() {
        if (R == N - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check if the queue is empty
    public static boolean isEmpty() {
        if (F == -1 || F > R) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Enqueue Operation; --> Logic: if(isFull()) write overflow
     */
    public static void enqueue(int Data) {
        // Check if the queue if Full
        if (isFull()) {
            System.out.println("OverFlow, Stack Is Full");
            return;
        }
        // Check if it is the first element 
        if (F == -1) {
            F = 0;
            R = 0;
        } else {
            R = R + 1;
        }
        queue[R] = Data;
        System.out.println("Data SuccessFully enqueued. The inserted item is: " + Data);
    }

    /**
     * Dequeue Operation; --> Logic: if(isEmpty()) write underflow
     */
    public static void dequeue() {
        int Data;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        } else {
            Data = queue[F];
        }
        if (F == R) {
            F = -1;
            R = -1;
        } else {
            F = F + 1;
        }
        System.out.println("The dequeued data is " + Data);
    }
    // Display the elements of Queue

    // public static void Display() {
    //     if (!isEmpty()) {
    //         System.err.println("Elements of Queue:");
    //         for (int i = F; i <= R; i++) {
    //             System.out.println(queue[i]);
    //         }
    //     } else {
    //         System.err.println("No items in Queue");
    //     }
    // }
    public static void main(String[] args) {
        System.out.println("====================Choice===================");
        System.out.println("1: Is Empty?");
        System.out.println("2: Is Full?");
        System.out.println("3: Enqueue");
        System.out.println("4: Dequeue");
        System.out.println("5: Exit");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        while (true) {
            switch (userInput) {
                case 1:
                    System.out.println(isEmpty());
                    return;
                case 2:
                    System.out.println(isFull());
                    return;

                case 3:
                    int data = 50;
                    enqueue(data);
                    System.out.println("The data inserted is " + data);
                    return;
                case 4:
                    dequeue();
                    return;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a vaalid Input");
            }
            sc.close();
        }

    }
}
