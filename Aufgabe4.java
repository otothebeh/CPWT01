public class Aufgabe4 {

    public static void main(String[] args) {

	MetallPlatte p1 = new MetallPlatte(200, 100);
	MetallPlatte p2 = new MetallPlatte(200, 100);
	MetallPlatte p3 = new MetallPlatte(200, 50);

	String s1 = p1.vergleicheMit(p2);
	String s2 = p1.vergleicheMit(p3);

	System.out.println("Platte p1 ist " + s1 + " p2.");
	System.out.println("Platte p1 ist " + s2 + " p3.");
    }
}
