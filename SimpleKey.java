import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class SimpleKey extends Applet implements KeyListener
{
	String msg = "";
	int X = 100, Y = 100; 
		public void init()
		{
			addKeyListener(this);
		}
		public void keyPressed(KeyEvent ke)
		{
			showStatus("Key Down");
		}
		public void keyReleased(KeyEvent ke)
		{
			showStatus("Key Up");
		}
		public void keyTyped(KeyEvent ke)
		{
			msg += ke.getKeyChar();
			repaint();
		}
	public void paint(Graphics g)
	{
		g.drawString(msg, X, Y);
	}

}