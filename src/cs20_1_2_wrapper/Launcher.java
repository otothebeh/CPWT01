package cs20_1_2_wrapper;

public class Launcher {

    public static void main(String[] args) {
	
	//
	// Double
	//

	Double arg = new Double(0.0);
	
	if (args.length == 1) {
	    
	    arg = Double.valueOf(args[0]);
	}

	// Unboxing
	// double d1 = arg;
	double d1 = arg.doubleValue();
	double d2 = 0.5;
	double sum = d1 + d2;
	// Boxing
	// Double d = sum;
	Double d = new Double(sum);
	
	System.out.println(d.toString());
	
	//
	// Integer
	//
	
	int i = 106;
	
	// Bin‰r-, Oktal- und Hexadezimalzahl
	String b = Integer.toBinaryString(i);
	String o = Integer.toOctalString(i);
	String h = Integer.toHexString(i);
	String u = h.toUpperCase();
	
	System.out.println("Dezimalzahl: " + i);
	System.out.println("Dualzahl: " + b);
	System.out.println("Oktalzahl: " + o);
	System.out.println("Hexadezimalzahl: " + h);
	System.out.println("Hexadezimalzahl groﬂ: " + u);
    }
}
