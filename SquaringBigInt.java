import java.math.*;

public class SquaringBigInt {

    public static void main(String[] args) {

	BigInteger zahl = new BigInteger("16");
	System.out.println("Zahl vor der Quadrierung: " + zahl.toString());

	for (int i = 1; i <= 5; i++) {

	    zahl = zahl.multiply(zahl);
	    System.out.println("Zahl nach " + i + ". Quadrierung: " + zahl);
	}
    }
}
