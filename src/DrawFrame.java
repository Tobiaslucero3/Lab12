
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 700, Color.BLACK, false);
        Square otherBase = new Square(new Point(400,300),500, Color.BLUE,false);
        
        Circle head = new Circle( new Point(400,300),450, Color.DARK_GRAY, true);
        
        RightTriangle rightEar = new RightTriangle(new Point(225,175),50,-150, Color.DARK_GRAY, true);
        RightTriangle leftEar = new RightTriangle(new Point(575,175),-50,-150, Color.DARK_GRAY, true);
        RightTriangle innerRightEar = new RightTriangle(new Point(230,175),30,-125, Color.PINK, true);
        RightTriangle innerLeftEar = new RightTriangle(new Point(570,175),-30,-125, Color.PINK, true);
        
        Oval leftEyeBase = new Oval(new Point(300,225),60,95,Color.white,true);
        Oval rightEyeBase = new Oval(new Point(500,225),60,95,Color.white,true);
        Oval leftPupil = new Oval(new Point(300,225),45,70,Color.BLACK,true);
        Oval rightPupil = new Oval(new Point(500,225),45,70,Color.BLACK,true);
        
        Circle nose = new Circle(new Point(400,300),50,Color.black,true);
        
        PolyLine leftMouth = new PolyLine(new Point(275,400), new Point(400,450), 67, Color.black, true);
        PolyLine rightMouth = new PolyLine(new Point(525,400), new Point(400,450), 67, Color.black, true);
        
        Oval tongue = new Oval(new Point(445,450),60,90,Color.RED,true);
        
        Oval collar = new Oval(new Point(400,525),400,50,Color.BLUE,true);
        
        Circle buttonBase = new Circle(new Point(400,525),75,Color.red,true);
        Circle buttonOutline = new Circle(new Point(400,525),52,Color.green,false);
        // Ears:
        
        
        // Eyes:
        
        // Nose and Whiskers:
        
        // Collar:
        
        // Square around the dog:

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(otherBase);
        drawPanel.addShape(base);
        drawPanel.addShape(head);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(innerRightEar);
        drawPanel.addShape(innerLeftEar);
        drawPanel.addShape(leftEyeBase);
        drawPanel.addShape(rightEyeBase);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightPupil);
        drawPanel.addShape(nose);
        drawPanel.addShape(leftMouth);
        drawPanel.addShape(rightMouth);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collar);
        drawPanel.addShape(buttonBase);
        drawPanel.addShape(buttonOutline);
        
        
        // set background color
        drawPanel.setBackground(Color.cyan);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
