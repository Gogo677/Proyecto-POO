package competencia;
import javax.swing.JOptionPane;

public class Competidor extends Triatlon{
    
    private String nombreCompetidor;
     
    public Competidor(String nombreCompetidor)
    {
        this.nombreCompetidor=nombreCompetidor;
    }
    
    public String imprimir()
    {
    	String cad="\t\tDatos Competidor\n Competidor: " + nombreCompetidor.toUpperCase();
    	cad+=super.imprimir();
    	JOptionPane.showMessageDialog(null, " " + cad);
    	return cad;
    }
}
