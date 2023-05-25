 import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;
 /*
 <applet code="MyApplet"=width=200 height=60>
 </applet>
 */
 public class MyApplet extends applet implements KeyListener
 {
	 String msg=" ";
int x=10,y=20;
 public void inti();
 { 
 AddkeyListener(this);
 }
 public void KeyPressed(KeyEvent ke)
 {
	 showStatus("Key Down");
 }
 public void KeyReleased(KeyEvent ke)
 {
	 showStatus("Key Up");
	 
 }public void KeyEvent(KeyEvent ke)
 {
	 msg+=ke.getKeyChar();
	 Repaid();
 }
 public void paint(graphics g)
 {
	 g.drawString(msg,x,y);
 }
 }