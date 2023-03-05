package codigosEjemplo;


public class PersonaActora extends Persona implements Actor {
    String nombrePapel;
    
    public PersonaActora(String nombre, int edad,String nombrePapel) {
        super(nombre, edad);
        this.nombrePapel=nombrePapel;
    }

    
    public void Actuar() {
      //se eimplementan los metodos
    }
    
    public String getNombrePapel() {
		return nombrePapel;
	}
    
    public void setNombrePapelr(String nombrePapel) {
		this.nombrePapel = nombrePapel;
	}
    
    
}
