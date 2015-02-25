/**

 * Programa de prueba de la agenda telefónica

 */

public class PruebaAgenda

{

    public static void main (String[] args) {

        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.añadirTelefono("a","1");
        agenda.añadirTelefono("b","2");
        agenda.añadirTelefono("c","3");
        agenda.añadirTelefono("d","4");
        agenda.añadirTelefono("e","5");
        agenda.añadirTelefono("f","6");
        agenda.añadirTelefono("g","7");
        agenda.añadirTelefono("d","4");
        
        // cambiamos un numero
        
 
        System.out.println("Consulta a: "+agenda.consulta("a"));
        System.out.println("Consulta d: "+agenda.consulta("d"));
        System.out.println("Consulta g: "+agenda.consulta("g"));
        System.out.println("Consulta x: "+agenda.consulta("x"));
        System.out.println("Consulta y: "+agenda.consulta("y"));
        System.out.println("Esta a: "+agenda.estaIncluido("a"));
        System.out.println("Esta x: "+agenda.estaIncluido("x"));
        System.out.println("Esta d: "+agenda.estaIncluido("d"));
        
        agenda.printAllNames();

    }

}