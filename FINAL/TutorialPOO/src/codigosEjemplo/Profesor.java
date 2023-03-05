package codigosEjemplo;

public class Profesor extends Persona{
    String numTrabajador;
    
    public Profesor(String nombre, int edad,String numTrabajador) {
        super(nombre, edad);
        this.numTrabajador=numTrabajador;
    }
    
    public String getNumTrabajador() {
		return numTrabajador;
	}
    
    public void setNumTrabajador(String numTrabajador) {
		this.numTrabajador = numTrabajador;
	}
    
    public void calificar(){};
}
