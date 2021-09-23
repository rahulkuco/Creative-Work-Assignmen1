import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Canvas {

    public Oval() {
        //cosntrutor to assign the initial values of the oval class
        setBackground(Color.gray);
        setSize(300, 300);
    }

    //method to construct the oval shape
    @Override
    public void paint(Graphics circleGraphics) {
        circleGraphics.setColor(Color.red);
        circleGraphics.fillOval(75, 75, 130, 50);
    }
}
