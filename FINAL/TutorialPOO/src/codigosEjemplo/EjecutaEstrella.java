package codigosEjemplo;


public class EjecutaEstrella {
    
    public static void main(String args[]){
        //se dice que el objeto se crea o se instancia al usarlo en una clase
        //este es un ejemplo de la clase estrella que creamos en el tema pasado
        Estrella uno = new Estrella(); 
        uno.picos=5;
        uno.color="amarillo";
        
        Estrella dos = new Estrella();
        dos.picos=6;
        dos.color="verde";
        
        uno.imprimeCaracteristicas();
        dos.imprimeCaracteristicas();
        
    }
}
