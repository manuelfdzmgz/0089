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
    public String consulta(String nombre)
    {
        String tel = agenda.get(nombre);     
        return tel;

    }

    /**

     * Añadir un nombre con su teléfono

     */

    public void añadirTelefono(String nombre, String telefono)
    {
        agenda.put(nombre,telefono);
    }

    public boolean estaIncluido(String nombre) 
    {
        return agenda.containsKey(nombre);
    }

    /**
     * Imprime todas las llaves
     */
    public void printAllNames()
    {
        Set keyset = agenda.keySet ();
        System.out.println("Key set values are: " + keyset);
    }

}
