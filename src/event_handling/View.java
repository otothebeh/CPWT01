package event_handling;

import java.awt.*;

public class View extends Frame {

    public View(String t) {

	super(t);
    }
    
    public void paint(Graphics g) {

        super.paint(g);
        
        Font f = new Font("Serif", Font.PLAIN, 32);
        g.setFont(f);
        g.drawString("Beenden mit ESC", 10, 200);
    }
}
