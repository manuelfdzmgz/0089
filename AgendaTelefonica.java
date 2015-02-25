import java.util.*;
public class AgendaTelefonica
{
    /**
     * Constructor que deja la agenda vacía
     */
    private Map<String, String> agenda;

    public AgendaTelefonica()
    {
        agenda = new HashMap<String, String>();
    }

    /**
     * Añadir un nombre con su teléfono
     */
    public void enterNumber(String nombre, String telefono)
    {
        agenda.put(nombre, telefono);
    }

    /**
     * Consulta de un nombre y retorna el numero de telefono 
     */
    public String lookupNumber(String nombre)
    {
        String tel = agenda.get(nombre);     
        return tel;

    }
}
