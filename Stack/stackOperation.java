// package Stack;

import java.util.Scanner;

public class stackOperation {

    static final int MAX = 100;//Maximum size of stack
    static int top = -1;//Initial index of stack
    static int[] stack = new int[MAX]; // Array Initilization

    static boolean isEmpty() {
        return top < 0;
    }

    static boolean isFull() {
        return top >= MAX - 1;
    }

    //Check the size of stack size
    static int stackSize() {
        return top + 1;//++ doesnot work
    }

    static int peek() {
        if (isEmpty()) {
            System.out.println("..........Is Empty......");
            return -1;
        }
        int element = stack[top];
        System.out.println("The Peek element is: " + element);
        return element;
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("..........Is Empty......");

        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    static int pop() {
        if (isEmpty()) {
            System.out.println("..........Is Empty......");
            return -1;
        }

        int element = stack[top--];
        System.out.println("The pop element is : " + element);
        return element;
    }

    // Push Operation
    static void push(int element) {
        if (isFull()) {
            System.out.println("Stack is overFlow");
            return;
        }
        stack[++top] = element;
        System.out.println("The pushed element is : " + element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================Stack Menu=================");
            System.out.println("1. Is stack is Empty?");
            System.out.println("2. Is stack is Full?");
            System.out.println("3. Stack Size");
            System.out.println("4. Push Operation");
            System.out.println("5. Pop Operation");
            System.out.println("6. Peek Operation");
            System.out.println("7. Display");
            System.out.println("8. --------Exit----------");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {

                    System.out.println("Stack Empty: " + isEmpty());
                    break;
                }
                case 2 -> {

                    System.out.println("Stack Full: " + isFull());
                    break;
                }
                case 3 -> {

                    System.out.println("Stack Size: " + stackSize());
                    break;
                }
                case 4 -> {

                    System.out.println("Enter a number: ");
                    int element = sc.nextInt();
                    push(element);
                    break;
                }
                case 5 -> {
                    System.out.println("Pop Operation Executed : " + pop());
                    break;
                }
                case 6 -> {
                    System.out.println("Peek Operation Executed : " + peek());
                    break;

                }
                case 7 -> {
                    System.out.println("Display");
                    display();
                    break;

                }
                case 8 -> {
                    System.out.println("Thank you, Exiting......");
                    System.exit(0);
                    break;
                }
                default -> {

                    System.out.println(".................Invalid Choice!..........");
                    break;
                }
            }
        }

    }
}
