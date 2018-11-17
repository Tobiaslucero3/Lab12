import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
	Rectangle r1 = new Rectangle(new Point(100,100), 50 , 20 , Color.CYAN, true);
	Rectangle r2 = new Rectangle(new Point(100,100), 30 , 40 , Color.RED, false);

	Square s1 = new Square(new Point(100,100), 50 , Color.CYAN, true);
	Square s2 = new Square(new Point(100,100), 30 , Color.RED, false);
	
	@Test
	public void rectangleConstructor()
	{
		Assert.assertEquals("Quantity of points defining the rectangle is not 4", 4, r1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the rectangle is not 4", 4, r2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the square is not 4", 4, s1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the square is not 4", 4, s2.getLocation().length);
        
        //Verify the points
        Assert.assertEquals(new Point(150,100), r1.getLocation()[1]);
	}
}
