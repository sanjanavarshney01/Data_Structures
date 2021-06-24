package couple;

import java.util.Scanner;

public class QueueByArray {
    int[] arr;
    int front;
    int rear;

    public QueueByArray(int size) {
        this.arr = new int[size];  //creation of array
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == arr.length;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("overflow");
        } else if (isEmpty()) {
            front = 0;
            arr[front] = value;
            rear = 0;
            rear++;
        } else {
            arr[rear] = value;
            rear++;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            arr[front] = 0;
            front++;
        }
        if (front > arr.length - 1) {
            front = rear - 1;
        }
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else
            for (int n : arr) {
                System.out.println(n);
            }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("queue is deleted");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println(arr[front]);
        }
    }

    public void showMenu() {
        boolean temp = true;
        while (temp) {
            System.out.println("press 1 for enQueue values");
            System.out.println("press 2 for deQueue values");
            System.out.println("press 3 for peek");
            System.out.println("press 4 to exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("enter values");
                    int value = scanner.nextInt();
                    enQueue(value);
                    break;
                case 2:
                    deQueue();
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