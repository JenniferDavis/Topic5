import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;


public class Rectangle extends JApplet
{
	public void paint (Graphics canvas)
	{
		//projects
		canvas.setColor(Color.RED);
		canvas.drawString("Projects: 20%", 10, 250);
		canvas.fillRect(10, 300, 100, 200);

		//quizzes
		canvas.setColor(Color.BLUE);
		canvas.drawString("Quizzes: 10%", 120, 350);
		canvas.fillRect(120, 400, 100, 100);

		//midterms
		canvas.setColor(Color.GREEN);
		canvas.drawString("Midterms: 30%", 230, 150);
		canvas.fillRect(230, 200, 100, 300);

		//finals
		canvas.setColor(Color.ORANGE);
		canvas.drawString("Final Exam: 40%", 340, 50);
		canvas.fillRect(340, 100, 100, 400);

	}

}