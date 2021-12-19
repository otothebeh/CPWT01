package cs20_2_2_grundrechenarten;

import java.util.*;

/**
 * Dies ist die Startklasse.
 */
public class Launcher {

    /**
     * Dies ist die Einstiegsmethode.
     * 
     * @param args das Kommandozeilenfeld
     */
    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	int a = 0;
	int b = 0;
	int r = 0;
	String quit = "n";

	while (quit.equals("n")) {

	    System.out.println("Operand a: ");
	    a = s.nextInt();
	    System.out.println("Operand b: ");
	    b = s.nextInt();
	    System.out.println("Operator: ");
	    String o = s.next();

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
		;
	    }

	    System.out.println("Ergebnis: " + r);
	    
	    System.out.println("Programm beenden? (j/n)");
	    quit = s.next();
	}
	
	s.close();
    }
}
