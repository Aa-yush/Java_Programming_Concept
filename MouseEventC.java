import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="MouseEventC" width="500" height="500" >
</applet>*/ 
public class MouseEventC extends Applet{
		Label l1,l2,l3;
		public void init(){
			l1=new Label();
			l2=new Label();
			l3=new Label();
		setLayout(null);
			l1.setBounds(50,50,100,70);
			l2.setBounds(100,50,100,70);
			l3.setBounds(150,50,100,70);
			
			add(l1);
			add(l2);
			add(l3);
		
		addMouseAdapter(new MyFirst());
		} 
			class MyFirst implements MouseAdapter{
				
			public void mouseClicked(MouseEvent me){
				l1.setText("X="+me.getX()+" Y="+me.getY());
			}
				
			}
	}

	