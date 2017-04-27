
/**
 * Write a description of class Yate here.
 * 
 * @Valerie (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    private int numeroCamarotes;

    /**
     * Constructor for objects of class Velero
     */
    public Yate(String matricula, double eslora, int annioFabricacion, Persona dueno, int potencia, int numeroCamarotes)
    {
        super(matricula,eslora,annioFabricacion,dueno,potencia);

        this.numeroCamarotes =numeroCamarotes;
    }

    /**
     * Metodo para obtener el coeficiente de Bernue de esta embarcacion
     */
    @Override
    public int getCoeficienteBernue(){
        int coeficienteBernue = numeroCamarotes + super.getCoeficienteBernue();
        return coeficienteBernue;
    }

    @Override
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "Numero de camarotes: " + numeroCamarotes + "\n";

        return cadenaADevolver;
    }
}
