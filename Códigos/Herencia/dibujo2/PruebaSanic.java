package dibujo2;
import javax.swing.JFrame;

public class PruebaSanic
{
   public static void main( String args[] ) throws InterruptedException
   {
      Sanic panel = new Sanic(); 
      JFrame aplicacion = new JFrame();
      
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      aplicacion.add( panel );
      aplicacion.setTitle("Escenario de Sonic");
      aplicacion.setSize(500, 500);      
      aplicacion.setVisible( true );
   } //fin main
   
} // fin clase