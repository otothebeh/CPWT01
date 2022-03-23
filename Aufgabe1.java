public class Aufgabe1 {

    //
    // Generiere zufällige Begrüßung
    //
    // Quelle:
    // https://wiki.byte-welt.net/wiki/Einfaches_Quiz_(Java-Beispielcode)
    //

    public static void main(String[] args) {

	String[] a = { "Hallo", "Guten Tag", "Servus", "Moin Moin" };

	int zufallszahl = (int) (Math.random() * a.length);

	System.out.print(a[zufallszahl]);
    }
}
