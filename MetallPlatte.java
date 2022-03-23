public class MetallPlatte {

    public double laenge;
    public double breite;

    public MetallPlatte(double laenge, double breite) {

	this.laenge = laenge;
	this.breite = breite;
    }

    public double berechneFlaeche() {

	return this.laenge * this.breite;
    }

    public String vergleicheMit(MetallPlatte p) {

	return (this.berechneFlaeche() > p.berechneFlaeche() ? "größer als" : "kleiner als oder gleich zu");
    }
}
