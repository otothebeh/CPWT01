package event_handling;

import java.awt.event.*;

public class KeyController extends KeyAdapter {

    public void keyPressed(KeyEvent e) {

        super.keyPressed(e);
        View v = (View) e.getSource();
        
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {

            v.setVisible(false);
            v.dispose();
            // System.exit(0);
        }
    }
}
