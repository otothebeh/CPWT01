package event_handling;

import java.awt.Color;

public class Launcher {

    public static void main(String[] args) {
	
	View v = new View("Event Handling Test");
	Controller c = new Controller();
	KeyController kc = new KeyController();
	MouseController mc = new MouseController();

	v.addMouseListener(mc);
	v.addKeyListener(kc);
	v.addWindowListener(c);
	v.setBackground(Color.LIGHT_GRAY);
	v.setSize(800, 600);
	v.setVisible(true);
    }
}
