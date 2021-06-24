package couple;

import java.util.Scanner;

public class FizzBuzz {
    public void fizzBuzz() {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert a number");
        num = scanner.nextInt();
        for (int i = 1; i < num + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }

}
