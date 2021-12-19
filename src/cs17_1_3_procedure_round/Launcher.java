package cs17_1_3_procedure_round;

public class Launcher {

    static double round(double x, int digits) {

	int p = (int) Math.pow(10, digits);
	double r = ((double) Math.round(x * p)) / p;

	return r;
    }

    static float round(float x, int digits) {

	// Berechnen der Zehnerpotenz
	// Die "pow"-Methode liefert einen "double"-Wert zurück.
	// Die Umwandlung in einen "int"-Wert erspart
	// eine Typumwandlung in "float" bei der
	// Multiplikation weiter unten.
	int p = (int) Math.pow(10, digits);

	// Verschieben Komma nach rechts
	float x1 = x * p;

	// Runden der Zahl mit Ganzzahl als Ergebnis
	int x2 = Math.round(x1);

	// Verschieben Komma nach links
	// Die Typumwandlung in "float" ist wichtig,
	// da die Operanden und NICHT der Divisionsoperator
	// den Datentyp des Ergebnisses bestimmen.
	// Ohne die Typumwandlung würde mit "int"-Werten
	// gerechnet und die Nachkommastellen abgeschnitten.
	float x3 = (float) x2 / p;

	return x3;
    }

    public static void main(String[] args) {

	double d = Launcher.round(1234.56789, 0);
	float f = Launcher.round(123.456789f, 2);

	System.out.println(d);
	System.out.println(f);
    }
}
