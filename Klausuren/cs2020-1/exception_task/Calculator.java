package exception_task;

public class Calculator {

    public int calculate(String o, int a, int b) {

        int r = 0;

        switch (o) {
        
            case "+":
                r = a + b;
                break;
            case "-":
                r = a - b;
                break;
            case "*":
                r = a * b;
                break;
            case "/":
                r = a / b;
                break;
            default:
                System.err.println("Unbekannter Operator");
        }

        return r;
    }
}
