package cs20_1_4_oop_mitarbeiter;

public class Gehaltsabrechnung {

    private static final int MITARBEITER_ANZAHL = 4;
    private static Mitarbeiter[] mitarbeiter;
    private static double bruttosumme;

    public static void main(String[] args) {

	Gehaltsabrechnung.mitarbeiter = new Mitarbeiter
		[Gehaltsabrechnung.MITARBEITER_ANZAHL];
	
	Gehaltsabrechnung.mitarbeiter[0] = new Arbeiter();
	Gehaltsabrechnung.mitarbeiter[1] = new Arbeiter();
	Gehaltsabrechnung.mitarbeiter[2] = new Angestellter();
	Gehaltsabrechnung.mitarbeiter[3] = new Manager();
	
	Gehaltsabrechnung.mitarbeiter[0].name = "Otto";
	Gehaltsabrechnung.mitarbeiter[1].name = "Friedrich";
	Gehaltsabrechnung.mitarbeiter[2].name = "Theodor";
	Gehaltsabrechnung.mitarbeiter[3].name = "Wilhelm";

	((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).stundenlohn = 20;
	((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).stundenanzahl = 200;
	((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).schichtzulage = 300;
	
	for (int i = 0; i < Gehaltsabrechnung.mitarbeiter.length; i++) {

	    Gehaltsabrechnung.bruttosumme
	    	+= Gehaltsabrechnung.mitarbeiter[i]
	    		.berechneMonatsBrutto();
	}
	
	System.out.println("Bruttosumme: "
		+ Gehaltsabrechnung.bruttosumme);
    }
}

abstract class Mitarbeiter {

    int personalnummer;
    String name;
    
    Mitarbeiter() {
    }
    
    abstract double berechneMonatsBrutto();
}

class Arbeiter extends Mitarbeiter {

    double stundenlohn;
    double stundenanzahl;
    double schichtzulage;

    double berechneMonatsBrutto() {

	return this.stundenlohn * this.stundenanzahl + this.schichtzulage;
    }
}

class Angestellter extends Mitarbeiter {

    double grundgehalt;
    double ortszuschlag;
    double zulage;

    double berechneMonatsBrutto() {
	
	return this.grundgehalt + this.ortszuschlag + this.zulage;
    }
}

class Manager extends Mitarbeiter {

    double fixgehalt;
    double provision;
    double umsatz;

    double berechneMonatsBrutto() {
	
	return this.fixgehalt + this.umsatz * this.provision / 100;
    }
}
