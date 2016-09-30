import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;


public class Ch14Ex14 extends JApplet
{
	public void paint (Graphics canvas)
	{
		canvas.setColor(Color.RED);
		
		//face of rectangle
		canvas.drawRect(100, 200, 250, 300);

		//back of rectangle
		canvas.drawRect(200, 100, 250, 300);
		
		//top line left
		canvas.drawLine(100, 200, 200, 100);
		
		//top line right
		canvas.drawLine(350, 200, 450, 100);
		
		//bottom line left
		canvas.drawLine(100, 500, 200, 400);
		
		//bottom line right
		canvas.drawLine(350, 500, 450, 400);
		
		
	}

}