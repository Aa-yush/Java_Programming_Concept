
/* Program to understand "Adding Two Numbers Using Applet with GUI"  
*
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

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="SkeletonApplet" width="500" height="350"> </applet> */
public class SkeletonApplet extends Applet{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	
	public void init(){
		l1=new Label("Enter First Number");
		l2=new Label("Enter Second Number");
		l3=new Label();
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Add");	
	
	setLayout(null);
	
	l1.setBounds(50,50,120,50);
	l2.setBounds(50,120,130,50);
	l3.setBounds(70,250,80,80);
	t1.setBounds(200,50,250,30);
	t2.setBounds(200,120,250,30);
	b1.setBounds(180,190,70,30);
	
	add(l1);
	add(l2);
	add(l3);
	add(t1);
	add(t2);
	add(b1);
	
	b1.addActionListener(new MyHandler());
	}
	
	
	
	public class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int a,b,sum;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sum=a+b;
			l3.setText("Sum is = "+sum);
		}
	}
}