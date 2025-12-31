
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

    public static void Display() {
        if (!isEmpty()) {
            System.err.println("Elements of Queue:");
            for (int i = F; i <= R; i++) {
                System.out.println(queue[i]);
            }
        } else {
            System.err.println("No items in Queue");
        }

    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        Display();
    }
}
