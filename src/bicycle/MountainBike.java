package bicycle;

public class MountainBike extends Bicycle {

    boolean computer;
    
    public String toString() {

	return super.toString()
		+ " computer: " + this.computer;
    }
}
