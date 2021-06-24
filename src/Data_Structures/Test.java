package couple;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean temp = true;
        while (temp) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("press 1 to execute anagram");
            System.out.println("press 2 to execute array");
            System.out.println("press 3 to execute FIZZBUZZ");
            ;System.out.println("press 4 to execute StackByArray");
            System.out.println("press 5 to execute QueueByArray");
            switch (scanner.nextInt()) {
                case 1:
                    Anagram ana = new Anagram();
                    System.out.println("enter two words to check if they are anagram or not");
                    if (ana.anagram(scanner.next(), scanner.next())) {
                        System.out.println("words are anagram");
                    }
                    System.out.println("words are not Anagram");
                    continue;
                case 2:
                    Array array = new Array();
                    array.showMenu();
                    continue;
                case 3:
                    FizzBuzz fizzBuzz = new FizzBuzz();
                    fizzBuzz.fizzBuzz();
                    continue;
                case 4:
                    System.out.println("enter size");
                    int size= scanner.nextInt();
                    StackByArray obj=new StackByArray(size);
                    obj.showMenu();
                case 5:
                    System.out.println("enter size");
                    int size1= scanner.nextInt();
                    QueueByArray obj1=new QueueByArray(size1);
                    obj1.showMenu();
                case 6:
                    temp = false;
            }
        }
    }
}
