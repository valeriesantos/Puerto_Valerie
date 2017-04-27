import java.lang.*;
/**
 * Write a description of class Barco here.
 * 
 * @Valerie  
 * @version (a version number or a date)
 */
public  abstract class Barco
{
    private String matricula;
    private double eslora;
    private int annioFabricacion;
    private Persona dueno;
    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, double eslora, int annioFabricacion, Persona dueno)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annioFabricacion = annioFabricacion;
        this.dueno = dueno;
    }

    
    public abstract  int getCoeficienteBernue();
    
    
    public double getEslora(){
        return eslora;    

    }
    
    public String toString(){
        String cadenaADevolver = "";
        
        cadenaADevolver += "Matricula: " + matricula + "\n";
        cadenaADevolver += "Eslora: " + eslora + "\n";
        cadenaADevolver += "Año de fabricación: " + annioFabricacion + "\n";
        cadenaADevolver += "Dueño:" + dueno.toString() + "\n";
        
        
        
        
        return cadenaADevolver;
        
        
    }
  
}
