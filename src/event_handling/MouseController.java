package event_handling;

import java.awt.event.*;

public class MouseController extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {

        super.mouseClicked(e);
        
        System.exit(0);
    }
}
