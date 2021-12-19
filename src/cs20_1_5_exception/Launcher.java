package cs20_1_5_exception;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
        String o = "";
        int a = 0;
        int b = 0;
        int r = 0;
	String quit = "j";
        Calculator c = new Calculator();

        while (quit.equals("j")) {

            System.out.println("\nGeben Sie Ihre Daten ein!");
            System.out.print("Operand a: ");
            a = s.nextInt();
            System.out.print("Operand b: ");
            b = s.nextInt();
            System.out.print("Operation: ");
            o = s.next();
            // Reset result.
            r = 0;

            try {
        	
		r = c.calculate(o, a, b);
	    
            } catch (UnknownOperatorException e) {

        	System.err.println("Fehler: " + e.getMessage());
	    }

            System.out.println("Ergebnis: " + r);
            System.out.print("Neue Berechnung? (j/n) ");
            quit = s.next();
        }

        s.close();
    }
}
