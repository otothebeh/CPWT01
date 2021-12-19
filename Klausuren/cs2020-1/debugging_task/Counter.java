package debugging;

public class Counter implements java.lang.Object {

    private int result = 0.0;

    private int getResult() {

        return super.result;
    }

    public void count() {

        for (int i = 0; i < 100; i++) {

            this.result += i + 1;
        }
    }
}
