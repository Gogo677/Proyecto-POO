package competencia;
import javax.swing.JOptionPane;

public class Triatlon implements Natacion,Atletismo,Ciclismo
{
	public String getEstilo(){
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nEstilo Natación: ");
        return cad;
    }
  
    public String getCategoriaNado() {
    	String cad="";
        cad+=JOptionPane.showInputDialog("\nCategoría Natación: ");
        return cad;
    }
    
    public String getDistanciaNado() {
        String cad="";
        cad+=JOptionPane.showInputDialog("\nDistancia Nado: ");
        return cad;
    }
    public String pruebaNado() {
    	String cad="";
        cad+= "\nEstilo Natación: " + getEstilo() + 
        		"\nCategoria Natación: " + getCategoriaNado() 
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
        cad+=JOptionPane.showInputDialog("\nCategoría Atletismo: ");
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
        		+ "\nCategoría Atletismo: "+ getCategoriaAtletismo() 
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
    			+ "\n\nFelicidades por completar el Triatlón";
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