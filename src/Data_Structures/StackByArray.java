package couple;

import java.util.Scanner;

public class StackByArray {
    int top;
    int[] arr;

    public StackByArray(int size) {
        this.top = 0;
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("overflow");
        } else if (isEmpty()) {
            top = 0;
            arr[top] = data;
            top++;
        } else {
            arr[top] = data;
            top++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            arr[top] = 0;
            top--;
        }
    }

    public int peek() {
        int result = 0;
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            result = arr[top];
        }
        return result;
    }

    public void show() {
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public void showMenu() {
        boolean temp = true;
        while (temp) {
            System.out.println("press 1 for push values");
            System.out.println("press 2 for pop values");
            System.out.println("press 3 for peek");
            System.out.println("press 4 to exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("enter values");
                    int value = scanner.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    temp = false;
            }
        }
    }
}
