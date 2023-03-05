
package codigosEjemplo;

public class EjecutaEstrellaProtegida {
    
    public static void main(String[] args){
        EstrellaProtegida estrellita = new EstrellaProtegida();
        
        estrellita.setPicos(5);
        estrellita.setColor("amarillo");
        
        System.out.println(" picos:"+estrellita.getPicos()+"\n color: "+estrellita.getColor());
    }
}
