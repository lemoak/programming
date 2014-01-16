import javax.swing.JFrame;

public class EmptyFrameViewer 
{

	public static void main(String[] args) 
	{
		// create the frame to display
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// call the RectangleComponent to draw rectangles
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		
		// display the frame!
		frame.setVisible(true);
		
	}

}
