package Arraych5;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student's mark(out of 100);");
        int mark = scanner.nextInt();
        switch (mark) {
            case 80 :
                System.out.println("You have entered A+");
                break;
            case 70:
                System.out.println("You have entered A");
                break;
            case 60:
                System.out.println("You have entered A-");
                break;
            case 50:
                System.out.println("You have entered B");
                break;
            case 40:
                System.out.println("You have entered C");
                break;
                default :System.out.println("You have entered Faild");
                    break;
        }
    }
}
