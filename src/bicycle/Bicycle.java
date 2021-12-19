package bicycle;

public class Bicycle {

    int cadence;
    int speed;
    int gear;
    
    void changeCadence(int newValue) {
	this.cadence = newValue;
    }
    
    void changeGear(int newValue) {
	this.gear = newValue;
    }
    
    void speedUp(int increment) {
	this.speed = this.speed + increment;
    }
    
    void applyBrakes(int decrement) {
	this.speed = this.speed - decrement;
    }

    public String toString() {

	return "cadence: " + this.cadence
		+ " speed: " + this.speed
		+ " gear: " + this.gear;
    }
}
