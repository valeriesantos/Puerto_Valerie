
/**
 * Write a description of class Velero here.
 * 
 * @Valerie (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int annioFabricacion, Persona dueno, int numeroMastiles)
    {
        super(matricula,eslora,annioFabricacion,dueno);
      
        this.numeroMastiles = numeroMastiles;
    }

     /**
     * Metodo para obtener el coeficiente de Bernue de esta embarcacion
     */
    @Override
    public int getCoeficienteBernue(){
        

        return numeroMastiles;
    }
    
    
    @Override
    public String toString(){
                String cadenaADevolver = super.toString();
                cadenaADevolver +=  "Numero de mastiles: " + numeroMastiles + "\n";
                
                return cadenaADevolver;
    }
    

}
