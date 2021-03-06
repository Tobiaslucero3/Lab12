import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        super(color,filled);
        
        super.location= new Point[4];
        
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point d = new Point();
        
        a.setLocation( center.getX()-width/2, center.getY()-height/2);
        b.setLocation( center.getX()+width/2, center.getY()-height/2);
        c.setLocation( center.getX()-width/2, center.getY()+height/2);
        d.setLocation( center.getX()+width/2, center.getY()+height/2);
        
        super.location[0] = a;
        super.location[1] = b;
        super.location[2] = d;
        super.location[3] = c;
        
        	
    }
}