package cs18_2_2_array;

public class Startklasse {

    public static void main(String[] args) {
	
	int[] a = new int[10];
	
	for (int i = 0; i < a.length; i++) {
	    
	    // Variante 1:
	    // a[i] = i * 100;
	    a[i] = i * 100 + 100;
	}

	for (int e : a) {

	    System.out.print(e + " ");
	}
	
	// System.out.print("\n");
	System.out.println();
	
	String[] s = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
	int i = 0;
	
	while (true) {

	    // besser auf größergleich prüfen
	    if (i == 7) {

		break;
	    }

	    System.out.println(s[i]);

	    i++;
	}
    }
}
