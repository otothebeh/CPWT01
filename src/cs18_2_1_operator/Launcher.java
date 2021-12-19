package cs18_2_1_operator;

public class Launcher {

    static int berechneQuersumme(int z) {
	
	int summe = 0;
	
	while (z != 0) {
	    
	    summe = summe + (z % 10);
	    
	    z = z / 10;
	}
	
	return summe;
    }
    
    public static void main(String[] args) {
	
	int i = 12345;
	int s = Launcher.berechneQuersumme(i);
	System.out.println(s);
    }
}
