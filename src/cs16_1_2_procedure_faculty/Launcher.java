package cs16_1_2_procedure_faculty;

import java.math.BigInteger;

public class Launcher {

    static BigInteger factorial(int n) {
	
	BigInteger r = BigInteger.valueOf(1);
	
	for (int i = 1; i <= n; i++) {

	    r = r.multiply(BigInteger.valueOf(i));
	}

	return r;
    }
    
    public static void main(String[] args) {
	
	int n = Integer.valueOf(args[0]);
	BigInteger f = Launcher.factorial(n);

	System.out.println(n + "! = " + f);
    }
}
