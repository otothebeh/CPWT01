package cs19_1_1_structure;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Eingabe Seite A:");
	double a = s.nextDouble();
	System.out.println("Eingabe Seite B:");
	double b = s.nextDouble();
	System.out.println("Menüauswahl:\n1 - Fläche\n2 - Umfang");
	int i = s.nextInt();
	double r = 0.0;
	s.close();

	switch (i) {
	
	case 1:
	    r = a * b;
	    System.out.println("Fläche: " + r);
	    break;
	    
	case 2:
	    r = 2 * (a + b); // 2 * a + 2 * b
	    System.out.println("Umfang: " + r);
	    break;
	    
	default:
	    System.err.println("Fehler: Falsche Eingabe!");
	}
    }
}
