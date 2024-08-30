// This is Janee Yeak's work
// 10 October 2020
// This program draws an inscribed/circumscribed triangle, a pacmen flower, and a sphere inside a cube.


import java.awt.*;
import java.applet.*;


public class Lab04bstv110 extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
      g.setColor(Color.black);
      g.drawLine(100,100,300,100); 
      g.drawLine(100,100,100,300); 
      g.drawLine(100,300,300,300); 
      g.drawLine(300,300,300,100);
      
      g.drawLine(100,100,150,150);
      g.drawLine(300,100,350,150);
      g.drawLine(100,300,150,350);
      g.drawLine(300,300,350,350);
      
      g.drawLine(150,150,350,150);
      g.drawLine(150,150,150,350);
      g.drawLine(150,350,350,350);
      g.drawLine(350,350,350,150);

		// DRAW SPHERE
      g.drawOval(125,125,200,200); 
      g.drawOval(125,200,200,50);
      g.drawOval(125,175,200,100);
      g.drawOval(125,150,200,150);
      
      g.drawOval(200,125,50,200);
      g.drawOval(175,125,100,200);
      g.drawOval(150,125,150,200);
      
           
		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
      g.drawOval(600,400,200,200);
      g.drawLine(603,480,770,430);
      g.drawLine(603,480,700,600);
      g.drawLine(700,600,770,430);
      g.drawOval(638,456,98,98);

      
		// DRAW PACMEN FLOWER
      g.drawArc(770,200,100,100,45,270);
      g.fillArc(770,200,100,100,45,270);
      g.drawArc(700,130,100,100,45,-270);
      g.fillArc(700,130,100,100,45,-270); 
      g.drawArc(630,200,100,100,135,-270); 
      g.fillArc(630,200,100,100,135,-270); 
      g.drawArc(700,270,100,100,-45,270); 
      g.fillArc(700,270,100,100,-45,270); 


	}

}


