public class SquaringLong {

    public static void main(String[] args) {

	long zahl = 16;
	System.out.println("Zahl vor der Quadrierung: " + String.valueOf(zahl));

	for (int i = 1; i <= 5; i++) {

	    zahl = zahl * zahl;
	    System.out.println("Zahl nach " + i + ". Quadrierung: " + zahl);
	}
    }
}
