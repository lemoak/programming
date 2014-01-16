
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class RectangleComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		//Recover Graphics 2D
		Graphics2D g2 = (Graphics2D) g;
		
		
		//construct a rectangle and draw it
		Rectangle box1 = new Rectangle(100,100,20,20);
		g2.draw(box1);
		box1 = new Rectangle();
		g2.draw(box1);
		Rectangle box2 = new Rectangle(75,75,30,30);
		g2.draw(box2);
		System.out.println(new Rectangle().getWidth()); 
		
		Rectangle box = new Rectangle(10, 25, 40, 70);
		
		//create an arm
		Line2D.Double arm1 = new Line2D.Double(100,50,80,100);
		g2.draw(arm1);
		Line2D.Double arm2 = new Line2D.Double(50,50,40,100);
		g2.draw(arm2);
		
		Line2D.Double leg1 = new Line2D.Double(75,148,100,198);
		g2.draw(leg1);
		Line2D.Double leg2 = new Line2D.Double(45,148,25,198);
		g2.draw(leg2);
		
		//create a head
		Ellipse2D.Double head = new Ellipse2D.Double(50,45,25,30);
		g2.draw(head);
		
		//create eyes
		Ellipse2D.Double eye1 = new Ellipse2D.Double(56,53,3,3);
		g2.draw(eye1);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(69,53,3,3);
		g2.draw(eye2);
		
		//create mouth
		Line2D.Double mouth = new Line2D.Double(50,60,70,70);
		g2.draw(mouth);
		
		
		//find height, width, area, and perimeter
		double height;
		height = box.getHeight();
		double width;
		width = box.getWidth();
		double area;
		area = height*width;
		System.out.println(area);
		double perimeter;
		perimeter = (height*2)+(width*2);
		System.out.println(perimeter);
		
		// Change the color of the rectangle
		g2.setColor(Color.MAGENTA);
		
		//Move rectangle 15 units to the right and 25 units down
		box.translate(30, 50);
		
		//draw moved rectangle
		g2.draw(box);
		
		
	}
}
