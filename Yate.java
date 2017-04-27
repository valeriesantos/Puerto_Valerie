
/**
 * Write a description of class Yate here.
 * 
 * @author  Valerie Santos
 * @version 2.0
 */
public class Yate extends EmbarcacionAMotor
{
    private int numeroCamarotes;

    /**
     * Constructor for objects of class Velero
     *  @param matricula parametro matricula que hereda de la clase padre
     * @param eslora parametro eslora que hereda de la clase padre
     * @param annioFabricacion parametro del año de fabricacion que hereda de la clase padre
     * @param dueno parametro dueno heredado de la clase padre
     * @param potencia parametro heredado de la clase EmbarcacionAMotor
     * @param numeroCamarotes parametro que nos indica cuantos camarotes tiene el barco
     */
    public Yate(String matricula, double eslora, int annioFabricacion, Persona dueno, int potencia, int numeroCamarotes)
    {
        super(matricula,eslora,annioFabricacion,dueno,potencia);
        this.numeroCamarotes = numeroCamarotes;
    }

    /**
     * Metodo para obtener el coeficiente de Bernue de esta embarcacion
     * @return coeficiente de bernue para Yate que es el numero
     * de camarotes + su coeficiente de bernue.
     * 
     */
    @Override
    public int getCoeficienteBernue(){
        int coeficienteBernue = numeroCamarotes + super.getCoeficienteBernue();
        return coeficienteBernue;
    }
    /**
     * Metodo sobreescrito de la clase padre que nos devuelve
     * una cadena de String con los datos heredados y los de
     * la clase Yate
     * @return cadena de String con los datos
     */
    @Override
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "-Numero de camarotes: " + numeroCamarotes + "\n";

        return cadenaADevolver;
    }
}
