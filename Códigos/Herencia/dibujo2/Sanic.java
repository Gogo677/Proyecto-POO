package dibujo2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Sanic extends JPanel{
	
   public void paintComponent( Graphics g ){	   
      super.paintComponent( g );    
    
    //Cielo  
    g.setColor(new Color(153,204,255));      
    g.fillRect(0, 0, 500, 180);
    
    //Sol
    g.setColor(Color.orange);
    g.fillOval(443,-20,110,110);
    g.setColor(Color.black);
    g.drawOval(443,-20,110,110);
    
    //Nubes
    int l=0,m=0,n=0,p=0,r=0;
    for(l=40;l<=500;l+=225)
    {
    g.setColor(Color.white);
    g.fillOval(l, 50, 50, 50);
    }
    for(m=53;m<=500;m+=225)
    {
     g.setColor(Color.white);
     g.fillOval(m, 30, 50, 50);	
    }
    for(p=73;p<=500;p+=225)
    {
    	g.setColor(Color.white);
        g.fillOval(p, 35, 50, 50);
    }
    for(n=77;n<=500;n+=225)
    {
    	g.setColor(Color.white);
        g.fillOval(n, 53, 50, 50);	
    }
    for(r=98;r<=500;r+=225)
    {
    g.setColor(Color.white);
    g.fillOval(r, 48, 50, 50);
    }
    
    //Montaña
    int a=0,b=0;
    for(a=0;a<=500;a++)
    {
     g.setColor(new Color(204,102,0));
     int [] vx1 = {a,182,150};
     int [] vy1 = {182,125,125};
     g.fillPolygon(vx1, vy1, 3);
    }
    for(b=80;b<=335;b++)
    {
     g.setColor(Color.white);
     int [] vx2 = {b,151,180};
     int [] vy2 = {151,125,125};
     g.fillPolygon(vx2, vy2, 3);
    }
    //Mar
    g.setColor(new Color(0,76,153));
    g.fillRect(0,180,500,15);
    g.setColor(new Color(0,102,204));
    g.fillRect(0,195,500,35);
    //Hojas de palmeras
    int h1=0,h2=0;
    for(h1=15;h1<=500;h1+=350)
    {
     g.setColor(new Color(0,204,0));
     g.fillOval(h1, 215, 50, 50);
    }
    for(h2=55;h2<=500;h2+=350)
    {
     g.setColor(new Color(0,204,0));
     g.fillOval(h2, 215, 50, 50);
    }
    g.setColor(new Color(0,204,204));
    g.fillRect(0,230,500,100);
    g.setColor(Color.black);
    g.drawRect(0, 180, 500,150);
    
    //Palmeras
    int p1=0,p2=0;
    for(p1=35;p1<=500;p1+=350)
    {
     g.setColor(new Color(255,128,0));
     g.fillOval(p1, 298, 50, 50);
     g.setColor(Color.black);
     g.drawOval(p1, 298, 50, 50);
    }
    for(p2=55;p2<=500;p2+=350)
    {
    	g.setColor(new Color(255,128,0));
    	g.fillRect(p2, 230, 10, 70);
    	g.setColor(Color.black);
    	g.drawRect(p2, 230, 10, 70);
    }
    
    //Pasto
    int i=0,j=0,rp=0;
    for(i=0;i<=500;i+=20)
    {
      g.setColor(Color.green);
      g.fillRect(i,320,20,20);
    }
    for(j=0;j<=500;j+=10)
    {
    g.setColor(Color.BLACK);
    g.drawLine(j, 320, j, 340);
    }
    
    //Tierra
    g.setColor(new Color(102,51,0));
    g.fillRect(0, 340, 500, 10);
    for(rp=350;rp<=500;rp+=40)
    {
     for(i=0;i<=500;i+=40)
     {
      g.setColor(new Color(153,76,0));
      g.fillRect(i,rp,20,20);
     }
    }
    for(rp=370;rp<=500;rp+=40)
    {
     for(i=20;i<=500;i+=40)
     {
      g.setColor(new Color(153,76,0));
      g.fillRect(i,rp,20,20);
     }
    }
    for(rp=350;rp<=500;rp+=40)
    {
     for(j=20;j<=500;j+=40)
     {
      g.setColor(new Color(255,153,51));
      g.fillRect(j,rp,20,20);
     }
    }
    for(rp=370;rp<=500;rp+=40)
    {
     for(j=0;j<=500;j+=40)
     {
      g.setColor(new Color(255,153,51));
      g.fillRect(j,rp,20,20);
     }
    }
    
    //Sonic girando
    int sn=1;
    do
    {
    g.setColor(new Color(0,0,204));
    g.drawOval(175, 240, sn, sn);
    sn++;
    }
    while(sn!=45);
    g.fillOval(177, 240, 45, 45);
    
    //Anillo
    Graphics2D circulo= (Graphics2D) g;
    circulo.setPaint(Color.yellow);  
    circulo.setStroke(new BasicStroke(10.f));
    g.drawOval(255, 272, 30, 30);
    g.drawOval(325, 272, 30, 30);
   } 
} 

