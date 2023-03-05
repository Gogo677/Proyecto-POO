package codigosEjemplo;

public class ConstructorEstrella {
    
    private int picos;
    private String color;
    
    public ConstructorEstrella(){
        //contructor por defecto
    }
    
    public ConstructorEstrella(int picos,String color){
        //constructor modificado
        this.color=color;
        this.picos=picos;        
    }
    
    public void imprimeCaracteristicas(){
        System.out.println("La estrella tiene " + picos + " picos.");
        System.out.println("Y es de color:" +color);
    }
    
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
