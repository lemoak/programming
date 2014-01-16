import java.lang.Object;
import java.awt.geom.Point2D;
import java.awt.Point;
public class PointTester {

	public static void main(String[] args) {
		Point p1 = new Point(3,4);
		Point p2 = new Point(-3,-4);
		double Distance = p1.distance(p1.getX(),p1.getY(),p2.getX(),p2.getY());
		System.out.println(Distance);

	}

}
