package cs19_2_4_oop;

public class Launcher {

    public static void main(String[] args) {
	
	MetallPlatte mp1 = new MetallPlatte(200, 100);
	MetallPlatte mp2 = new MetallPlatte(200, 100);
	MetallPlatte mp3 = new MetallPlatte(200, 50);
	
	String s1 = mp1.vergleicheMit(mp2);
	String s2 = mp1.vergleicheMit(mp3);

	System.out.println("Platte mp1 ist " + s1 + " mp2.");
	System.out.println("Platte mp1 ist " + s2 + " mp3.");
    }
}
