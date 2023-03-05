package competencia;
import javax.swing.JOptionPane;

public class Triatlon implements Natacion,Atletismo,Ciclismo
{
	public String getEstilo(){
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nEstilo Nataci�n: ");
        return cad;
    }
  
    public String getCategoriaNado() {
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nCategor�a Nataci�n: ");
        return cad;
    }
    
    public String getDistanciaNado() {
        String cad="";
        cad+=JOptionPane.showInputDialog("\nDistancia Nado: ");
        return cad;
    }
    public String pruebaNado() {
    	String cad="";
        cad+= "\nEstilo Nataci�n: " + getEstilo() + 
        		"\nCategoria Nataci�n: " + getCategoriaNado() 
        		+ "\nDistancia Nadada"+ getDistanciaNado();
        return cad;    
    }  
   
    public String getEstiloAtletismo() {
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nEstilo Atletismo: ");
        return cad;
    }
    
    public String getCategoriaAtletismo() {
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nCategor�a Atletismo: ");
        return cad;
    }
    
    public String getDistanciaAtletismo() {
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nDistancia Atletismo: ");
        return cad;
    }
    
    public String pruebaAtletismo() {
    	String cad="";
        cad+= "\nEstilo Atletismo: " + getEstiloAtletismo() 
        		+ "\nCategor�a Atletismo: "+ getCategoriaAtletismo() 
        		+ "\nDistancia recorrida a Pie: "+ getDistanciaAtletismo();
        return cad;
	}
  
    public String getRuta() {
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nRuta Ciclismo: ");
        return cad;
    }
    
    public String getDistanciaCiclismo(){
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nDistancia Ciclismo: ");
        return cad;
    }
  
    public String pruebaCiclismo() {
        String cad="";  
        cad+= "\nRuta escogida: " + getRuta() 
        	  + "\nDistancia recorrida en bici: " + getDistanciaCiclismo();
        return cad;
    }
      
    public String pruebaTriatlon()
    {
    	String cad="";
    	cad+= pruebaNado() + pruebaAtletismo() + pruebaCiclismo() 
    			+ "\n\nFelicidades por completar el Triatl�n";
        return cad;  
    }
  
    
    public String imprimir()
    {
    //Imprime todos los datos obtenidos 	
     String cad="";
     cad+=pruebaTriatlon();
     return cad; 
    }
    
}