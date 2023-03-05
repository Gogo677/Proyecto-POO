package competencia;
import javax.swing.JOptionPane;

public class PruebaCompetidor {
  public static void main(String args[])
  {
	String nom="";
	nom+=JOptionPane.showInputDialog("Nombre Competidor");
    Competidor phelps = new Competidor(nom);
    phelps.imprimir();
  }
}