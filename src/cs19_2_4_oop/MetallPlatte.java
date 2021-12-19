package cs19_2_4_oop;

public class MetallPlatte {

    double laenge;
    double breite;
    
    public MetallPlatte(double l, double b) {

	this.laenge = l;
	this.breite = b;
    }
    
    double berechneFlaeche() {

	return this.laenge * this.breite;
    }

    String vergleicheMit(MetallPlatte mp) {

	return (this.berechneFlaeche() > mp.berechneFlaeche())
	    ? "größer als"
	    : "kleiner als oder gleich zu";
    }
}
