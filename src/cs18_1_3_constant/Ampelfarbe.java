package cs18_1_3_constant;

public class Ampelfarbe extends Object {

    static final Ampelfarbe ROT = new Ampelfarbe("Anhalten");  
    static final Ampelfarbe GELB = new Ampelfarbe("Achtung");  
    static final Ampelfarbe GRUEN = new Ampelfarbe("Weiterfahren");  

    String text;
    
    private Ampelfarbe(String text) {

	super();
	this.text = text;
    }

    public String toString() {

        return this.text;
    }
}
