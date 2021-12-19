package bicycle;

public class Launcher {

    public static void main(String[] args) {
	
	System.out.println("Startup");
	
	Bicycle b = new MountainBike();
	b.changeCadence(3);
	b.changeGear(4);
	b.speedUp(5);
	b.applyBrakes(4);

	System.out.println(b.toString());
    }
}
