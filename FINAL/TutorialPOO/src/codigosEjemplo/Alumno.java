package codigosEjemplo;

public class Alumno extends Persona {
    String numCuenta;
    
    public Alumno(String nombre, int edad,String numCuenta) {
        super(nombre, edad);
        this.numCuenta=numCuenta;
    }
    
    public String getNumCuenta() {
		return numCuenta;
	}
    
    public void setNumcuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
    
}
