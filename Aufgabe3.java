public class Aufgabe3 {

    static void print(Address[] a) {

	for (Address adr : a) {

	    System.out.println(adr);
	}
    }

    static int search(Address[] a, String s) {

	int i = -1;
	String n = "";

	for (int j = 0; j < a.length; j++) {

	    n = a[j].getName();

	    // The class String inherits
	    // the interface "CharSequence",
	    // which is expected as parameter type here.
	    if (n.contains(s)) {

		i = j;
	    }
	}

	return i;
    }

    public static void main(String[] args) {

	Address[] a = new Address[5];

	a[0] = new Address("Hans Albers", "Große Freiheit 1", "Hamburg");
	a[1] = new Address("Liselotte Pulver", "Bergstraße 2", "Bern");
	a[2] = new Address("Theo Lingen", "Flußgraben 3", "Hannover");
	a[3] = new Address("Hans Moser", "Stephansweg 4", "Wien");
	a[4] = new Address("Heinz Erhardt", "Dünenufer 5", "Riga");

	Aufgabe3.print(a);

	int i = Aufgabe3.search(a, "Theo");
	System.out.println("Adresse gefunden am Index: " + i);
    }
}
