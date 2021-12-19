package cs20_1_3_debugging;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("Startup system");

        Counter c = new Counter();

        c.count();

        System.out.println("The count value is: " + c.getResult());

        System.out.println("Shutdown system");
    }
}
