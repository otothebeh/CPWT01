public class Address {

    private String name;
    private String strasze;
    private String ort;

    public Address(String n, String s, String w) {

	this.name = n;
	this.strasze = s;
	this.ort = w;
    }

    public String getName() {

	return this.name;
    }

    public void setName(String name) {

	this.name = name;
    }

    public String getStrasze() {

	return this.strasze;
    }

    public void setStrasze(String strasze) {

	this.strasze = strasze;
    }

    public String getOrt() {

	return this.ort;
    }

    public void setOrt(String ort) {

	this.ort = ort;
    }

    @Override
    public String toString() {

        return "Name: " + this.name
            + ", Straße: " + this.strasze
            + ", Ort: " + this.ort;
    }
}
