
/**
 * Write a description of class Velero here.
 * 
 * @author Valerie Santos
 * @version 2.0
 */
public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     * @param matricula parametro matricula que hereda de la clase Barco
     * @param eslora parametro eslora que hereda de la clase padre
     * @param annioFabricacion parametro del año de fabricacion que hereda de la clase padre
     * @param dueno parametro dueno heredado de la clase padre
     * @param numeroMastiles numero de mastiles del barco
     */
    public Velero(String matricula, double eslora, int annioFabricacion, Persona dueno, int numeroMastiles)
    {
        super(matricula,eslora,annioFabricacion,dueno);      
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * Metodo para obtener el coeficiente de Bernue de esta embarcacion
     * que sobreescribimos de la clase Barco.
     * @return numero de los mastiles que tiene el barco
     */
    @Override
    public int getCoeficienteBernue(){ 
        // en este barco el C.deBernue es el numero de mastiles del velero.

        return numeroMastiles;
    }

    
    /**
     * Metodo que devuelve una cadena con los datos asociados a la clase Velero
     * que se sobreescribe de la clase padre.
     * @return cadena de Strings con los datos heredados y los de Velero
     */
    @Override
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "-Numero de mastiles: " + numeroMastiles + "\n";

        return cadenaADevolver;
    }

}
