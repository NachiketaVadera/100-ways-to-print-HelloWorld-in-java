package MyPack;

import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorld_Applets extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello World!", 50, 150);
    }
}