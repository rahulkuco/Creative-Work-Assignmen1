import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Canvas {

    public Square() {
        //cosntrutor to assign the initial values of the square class
        setBackground(Color.gray);
        setSize(300, 300);
    }

    //method to construct the square shape
    @Override
    public void paint(Graphics circleGraphics) {
        circleGraphics.setColor(Color.red);
        circleGraphics.fillRect(75, 75, 50, 50);
    }
}
