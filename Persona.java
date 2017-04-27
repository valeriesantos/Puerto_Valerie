
/**
 * Write a description of class Cliente here.
 * 
 * @author  Valerie Santos
 * @version 2.0
 */
public class Persona
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     * @param nombre nombre del cliente
     * @param dni dni del cliente
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Metodo que devuelve una cadena de String con los datos que estan
     * asociados a la clase Persona
     * @return cadena de string con los datos de Persona
     */
    public String toString(){
        String cadenaADevolver = " ";

        cadenaADevolver += nombre + "\n";
        cadenaADevolver += "-DNI: " + dni;

        return cadenaADevolver;
    }
}

