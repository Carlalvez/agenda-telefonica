import java.util.HashMap;

/**
 * Almacenamiento y muestra de una Agenda telefónica
 *
 * @author (Carlos Alvarez)
 * @version (18/03/2018)
 */
public class AgendaTelefonica
{
    HashMap<String, String> agendaTelefono;

    /**
     * Constructor de AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agendaTelefono = new HashMap<>();
    }

    /**
     * @Introducir el numero de un contacto
     */
    public void introducirNumero(String nombre,String numero)
    {
        agendaTelefono.put(nombre,numero);
    }
    
    /**
     * @Devolver el numero de un contacto.
     */
    public void verNumero(String nombre){
        System.out.println(agendaTelefono.get(nombre));
    }
}