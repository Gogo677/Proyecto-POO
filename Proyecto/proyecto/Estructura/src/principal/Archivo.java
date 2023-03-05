package principal;

import java.io.*;

public class Archivo{
    

    public String leer(String nombre){

    try{
    File f;
    FileReader lectorArchivo;
    f = new File(nombre);
    lectorArchivo = new FileReader(f);

    BufferedReader br = new BufferedReader(lectorArchivo);

    String l="";
    String aux="";

    while(true)
    //este ciclo while se usa para repetir el proceso de lectura, ya que se lee solo 1 linea de texto
    {
    aux=br.readLine();
    //leemos una linea de texto y la guardamos en la variable auxiliar
    if(aux!=null)
        l=l+aux+"\n";
    else
        break;
    }

    br.close();

    lectorArchivo.close();

    return l;

    }catch(IOException e){
    System.out.println("Error:"+e.getMessage());
    }
    return null;
    }
}