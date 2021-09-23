import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CreativeDrawing {

    //declare required controls
    JFrame drawingFrame;
    JFrame shapeFrame;

    CreativeDrawing() {
        //initialize the JFrame
        drawingFrame = new JFrame();

        //initialize the required controls
        JLabel titleLabel = new JLabel("Select a shape to draw on canvas");
        JRadioButton circleRadioButton = new JRadioButton("Circle");
        JRadioButton rectangleRadioButton = new JRadioButton("Rectangle");
        JRadioButton squareRadioButton = new JRadioButton("Square");
        JRadioButton ovalRadioButton = new JRadioButton("Oval");
        JButton drawButton = new JButton("Draw");

        //set bounds for the required controls
        titleLabel.setBounds(50, 25, 300, 30);
        circleRadioButton.setBounds(100, 50, 100, 30);
        rectangleRadioButton.setBounds(100, 75, 100, 30);
        squareRadioButton.setBounds(100, 100, 100, 30);
        ovalRadioButton.setBounds(100, 125, 100, 30);
        ButtonGroup shapeButtonGroup = new ButtonGroup();
        drawButton.setBounds(100, 175, 100, 30);

        //draw button action performed
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boolean flag = true;
                shapeFrame = new JFrame();
                if (circleRadioButton.isSelected()) {
                    //call the circle canvas when the circle radio button is selected
                    shapeFrame.add(new Circle());
                    shapeFrame.setTitle("Circle");
                } else if (rectangleRadioButton.isSelected()) {
                    //call the rectangle canvas when the circle radio button is selected
                    shapeFrame.add(new Rectangle());
                    shapeFrame.setTitle("Rectangle");
                } else if (squareRadioButton.isSelected()) {
                    //call the square canvas when the circle radio button is selected
                    shapeFrame.add(new Square());
                    shapeFrame.setTitle("Square");
                } else if (ovalRadioButton.isSelected()) {
                    //call the oval canvas when the circle radio button is selected
                    shapeFrame.add(new Oval());
                    shapeFrame.setTitle("Oval");
                } else {
                    flag = false;
                    //display error message when no shapes selected
                    JOptionPane.showMessageDialog(null, "Select a shape and click draw button", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (flag) {
                    //if any one of the radio button is selected then call the shape frame
                    shapeFrame.setSize(300, 300);
                    shapeFrame.setLayout(null);
                    shapeFrame.setLocationRelativeTo(null);
                    shapeFrame.setVisible(true);
                }
            }
        });

        //add all the radio buttons to the button group
        shapeButtonGroup.add(circleRadioButton);
        shapeButtonGroup.add(rectangleRadioButton);
        shapeButtonGroup.add(squareRadioButton);
        shapeButtonGroup.add(ovalRadioButton);

        //add all the controls to the JFrame
        drawingFrame.add(titleLabel);
        drawingFrame.add(circleRadioButton);
        drawingFrame.add(rectangleRadioButton);
        drawingFrame.add(squareRadioButton);
        drawingFrame.add(ovalRadioButton);
        drawingFrame.add(drawButton);

        //assign the settings to the JFrame
        drawingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawingFrame.setSize(300, 300);
        drawingFrame.setLayout(null);
        drawingFrame.setLocationRelativeTo(null);
        drawingFrame.setTitle("Creative Drawing");
        drawingFrame.setVisible(true);
    }

    //main method to call the JFrame
    public static void main(String[] args) {
        new CreativeDrawing();
    }
}
