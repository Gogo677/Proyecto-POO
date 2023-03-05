package codigosEjemplo;

public class EstrellaProtegida {
    //la proteccion en java esta dada por las palabras reservadas public, protected y private.
    //cada proteccion tiene diferentes usos, pero por estandar en las caracteristicas se hacen privadas
    private int picos;
    private String color;
    
    //al hacer privadas las caracteristicas, entonces la comunicación se da por metodos get y set
    public int getPicos(){
        return picos;
    }
    
    public void setPicos(int picos){
        this.picos=picos;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }          
       
}
