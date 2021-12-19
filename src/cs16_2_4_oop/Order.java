package cs16_2_4_oop;

public class Order {

    private int quantity;
    private Article article;

    public Order(int quantity, Article article) {

	this.quantity = quantity;
	this.article = article;
    }

    public double getOrderValue() {

	return this.quantity * this.article.getPrice();
    } 

    public static double getTotal(Order... orders) {

	double t = 0;

	for (Order o : orders) {

	    t += o.getOrderValue();
	}

	return t;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    } 
}
