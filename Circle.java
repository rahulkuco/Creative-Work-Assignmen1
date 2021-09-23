import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Canvas {

    public Circle() {
        //cosntrutor to assign the initial values of the circle class
        setBackground(Color.gray);
        setSize(300, 300);
    }

    //method to construct the circle shape
    @Override
    public void paint(Graphics circleGraphics) {
        circleGraphics.setColor(Color.red);
        circleGraphics.fillOval(75, 75, 50, 50);
    }
}
