import java.lang.*;

/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @Valerie (your name) 
 * @version (a version number or a date)
 */
public  class EmbarcacionAMotor extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor (String matricula, double eslora,int annioFabricacion, Persona dueno, int potencia)
    {

        super(matricula,eslora,annioFabricacion,dueno);

        this.potencia = potencia;
    }

    /**
     * Metodo para obtener el coeficiente de Bernue de esta embarcacion
     */
    @Override
    public int getCoeficienteBernue(){

        return potencia;
    }

    @Override
    /**
     * Metodo que devuelve una cadena de string
     */

    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "Potencia: " + potencia + " CV " +  "\n" ;
       
        
        
        
        return cadenaADevolver;
    }

}
