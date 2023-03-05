package codigosEjemplo;

public class Polimorfismo {
    
    public static void main(String args[]){
        Persona arreglo[] = null;
        
        arreglo[0]=new Persona("Pablo",22);
        arreglo[1]=new Alumno("Willy",18,"419000452");
        arreglo[2]=new Profesor("Eduardo",33,"1111112");
    }
}
