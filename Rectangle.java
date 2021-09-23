import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Canvas {

    public Rectangle() {
        //cosntrutor to assign the initial values of the rectangle class
        setBackground(Color.gray);
        setSize(300, 300);
    }

    //method to construct the rectangle shape
    @Override
    public void paint(Graphics circleGraphics) {
        circleGraphics.setColor(Color.red);
        circleGraphics.fillRect(75, 75, 100, 50);
    }
}
