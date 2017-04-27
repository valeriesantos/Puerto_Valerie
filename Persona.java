
/**
 * Write a description of class Cliente here.
 * 
 * @Valerie (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
    public String toString(){
                String cadenaADevolver = " ";
                
                
                cadenaADevolver += nombre + "\n";
                cadenaADevolver += "DNI: " + dni;
                
                return cadenaADevolver;
        
    }
}

