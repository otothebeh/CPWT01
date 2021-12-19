package cs18_2_3_structure;

public class Launcher {

    public static void main(String[] x) {
	
	int p = 216;
	int q = 378;
	int h = 0;
	int r = 0;

	if (x.length == 2) {
	    
	    p = Integer.valueOf(x[0]);
	    q = Integer.valueOf(x[1]);
	}

	// Macht p zur größeren Zahl.
	if (p < q) {

	    h = p;
	    p = q;
	    q = h;
	}

	while (q != 0) {

	    r = p % q;
	    p = q;
	    q = r;
	}

	System.out.println(p);
    }
}
