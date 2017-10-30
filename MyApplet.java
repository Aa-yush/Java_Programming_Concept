
/* Program to understand "Concept of Applet"  
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import java.applet.Applet;
import java.awt.*;
/*<applet code="MyApplet" width="300" height="300"></applet>*/
public class MyApplet extends Applet{
	public void paint(Graphics g){
		g.drawString("Ayush Gupta is Best",100,100);//print string width=100 & height=100
	}
	
}