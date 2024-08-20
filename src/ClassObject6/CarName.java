package ClassObject6;

class CarName { // user define

    // Propertes or Member variable or instance variable or Global variable
    //
    String color;
    String name;
    int maxspeed;

    static int number = 10;

    public static void main(String args[]) {

        CarName c1 = new CarName(); // copy , reference , set properties or method
        CarName c2 = new CarName();

        AccessingMember c3 = new AccessingMember();
        c3.name = "Computer";
        c3.age = 20;
        c3.roll = 2999;
        c3.department = "Computer";

        c1.color = "red";
        c1.name = "airA=180";
        System.out.println(c1.color);
        System.out.println(c1.name);
        System.out.println(c1.maxspeed);
        System.out.println("Static variable " + CarName.number);
        c2.color = "blue sdsd ";
        c2.name = "Card";

        ;
    }

    // Member function or Method
    void start1() {
    }

    public void start() {
        System.out.println("The car has started");
    }

    public void stop() {
        String test;
        System.out.println("the car has stopped");
    }
}
