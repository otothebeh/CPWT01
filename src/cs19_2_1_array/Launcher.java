package cs19_2_1_array;

public class Launcher {

    public static void main(String[] args) {
	
	String[] a = { "Hallo", "Guten Tag", "Servus", "Moin Moin" };
	
	int r = (int) (Math.random() * a.length);

	System.out.println(r);
	System.out.println(a[r]);
    }
}
