package cs16_2_4_oop;

public class Article {

    private int id;
    private double price;
    
    public Article(int id, double p) {
	
	this.id = id;
	this.price = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
