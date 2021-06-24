package couple;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    ArrayList<Integer> arr = new ArrayList<>();

    public void insert() {
        System.out.println("add some values to array");
        Scanner scanner = new Scanner(System.in);
        arr.add(scanner.nextInt());
    }

    public void transverse() {
        for (int array : arr) {
            System.out.println(array);
        }
    }

    public void update(int index, int value) {
        arr.set(index, value);
    }

    public void search(int index) {
        System.out.println(arr.get(index));
    }

    public void delete() {
        arr = null;
    }

    public void showMenu() {
        boolean temp = true;
        while (temp) {
            System.out.println("press 1 for inserting values");
            System.out.println("press 2 for transversing values");
            System.out.println("press 3 for updating values");
            System.out.println("press 4 for searching values");
            System.out.println("press 5 for deleting values");
            System.out.println("press 6 to exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    insert();
                    break;
                case 2:
                    transverse();
                    break;
                case 3:
                    System.out.println("enter index and value");
                    update(scanner.nextInt(), scanner.nextInt());
                    break;
                case 4:
                    System.out.println("enter index");
                    search(scanner.nextInt());
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    temp = false;
            }
        }
    }
}