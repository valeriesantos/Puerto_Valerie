import java.lang.*;

/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author Valerie Santos
 * @version 2.0
 */
public  class EmbarcacionAMotor extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     * @param matricula parametro matricula que hereda de la clase Barco
     * @param eslora parametro eslora que hereda de la clase padre
     * @param annioFabricacion parametro del año de fabricacion que hereda de la clase padre
     * @param dueno parametro dueno heredado de la clase padre
     * @param potencia parametro que indica la potencia del barco
     */
    public EmbarcacionAMotor (String matricula, double eslora,int annioFabricacion, Persona dueno, int potencia)
    {
        super(matricula,eslora,annioFabricacion,dueno);
        this.potencia = potencia;
    }

    /**
     * Metodo para obtener el coeficiente de Bernue de esta embarcacion
     * @return coeficiente de Bernue de esta embarcacion que es igual a la potencia
     */
    @Override
    public int getCoeficienteBernue(){
        return potencia; // en este barco el C.deBernue es su potencia.
    }

    @Override
    /**
     * Metodo que devuelve una cadena de string 
     * @return cadena de String con los datos  heredados
     * y los de EmbarcacionAMotor
     */

    public String toString(){
        // sobreescribimos el toString() de la clase padre con super.toString()
        String cadenaADevolver = super.toString(); 
        cadenaADevolver += "-Potencia: " + potencia + " CV " +  "\n" ;
        
        return cadenaADevolver;
    }

}
