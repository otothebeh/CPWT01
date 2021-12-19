package cs20_1_5_exception;

public class Calculator {

    public int calculate(String o, int a, int b) throws UnknownOperatorException {

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
        	throw new UnknownOperatorException("Unbekannter Operator");
        }

        return r;
    }
}
