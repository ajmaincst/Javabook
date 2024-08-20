package ClassObject6;

import java.util.Scanner;

class InstanceVariable {
    int num;
    InstanceVariable(int n){
        num = n;
    }
    public void show(){
        System.out.println("The number is:" + num);
    }
    public static void main(String agrs[]){
        InstanceVariable test = new InstanceVariable(54);
        test.show();
    }

    static class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        int a = sc.nextInt();
        System.out.println("b=");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is big");
        } else {
            System.out.println("b is big");
        }
      }

    }
}
