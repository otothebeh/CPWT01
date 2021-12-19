package event_handling;

import java.awt.event.*;

public class Controller extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
	
	System.exit(0);
    }
}
