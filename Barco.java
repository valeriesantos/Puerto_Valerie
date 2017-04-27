import java.lang.*;
/**
 * Write a description of class Barco here.
 * 
 * @author Valerie Santos
 * @version 2.0
 */
public  abstract class Barco
{
    private String matricula;
    private double eslora;
    private int annioFabricacion;
    private Persona dueno;
    /**
     * Constructor for objects of class Barco
     * @param matricula una matricula de un barco
     * @param eslora eslora de un barco
     * @param annioFabricacion el año en que fue fabricado un barco
     * @param dueno llamamos al dueño de la clase Persona
     * 
     */
    public Barco(String matricula, double eslora, int annioFabricacion, Persona dueno)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annioFabricacion = annioFabricacion;
        this.dueno = dueno;
    }

    /**
     * Metodo abstracto que vamos a sobreescribir en las clases hijas.
     */
    public abstract  int getCoeficienteBernue();

    /**
     * Metodo que devuelve la eslora de un barco.
     * @return  eslora de un barco
     */
    public double getEslora(){
        return eslora;
    }

    /**
     * Metodo que va a mostrar por pantalla todos los parametros de 
     * la clase Barco.    
     * @return una cadena de Strings con los datos asociados a la clase Barco     
     */
    public String toString(){
        String cadenaADevolver = "";

        cadenaADevolver += "-Matricula: " + matricula + "\n";
        cadenaADevolver += "-Eslora: " + eslora + "\n";
        cadenaADevolver += "-Año de fabricación: " + annioFabricacion + "\n";
        cadenaADevolver += "-Dueño:" + dueno.toString() + "\n";

        return cadenaADevolver; 
    }  
}
