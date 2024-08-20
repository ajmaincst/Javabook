package ClassObject6;

class StaticVariable {
    int num;
    static int count;  //propertes
    StaticVariable(int n) {
        num = n;
        count++;
    }
    public void show(){    //method
        System.out.println("The number is "+ num);
    }

     public static void main(String[] args) {
         StaticVariable test = new StaticVariable( 76);
                 test.show();
         StaticVariable test2 = new StaticVariable( 87);
         test2.show();
         System.out.println();

     }
}
