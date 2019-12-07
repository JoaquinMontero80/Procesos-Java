/*
    Joaquin Montero. 2DAM.  PSP --> T2 Procesos Java. 
    Clase Main principal. ( Ejecuta los 3 procesos de los 3 ejercicios ) 
    Crea un programa llamado LeerNombre que reciba desde main() un parámetro
    correspondiente a un nombre propio y lo muestre en pantalla. Usar System.exit(1) para
    indicar la finalización correcta, y System.exit(-1) para el caso de finalización de manera
    anormal. Escribir otro programa para ejecutar como proceso al realizado anteriormente
    LeerNombre, utilizando el método waitFor() para comprobar el valor de salida del proceso
    que ejecuta.
 */
package leernombre;

/**
 *
 * @author joaquin
 */
public class LeerNombre 
{
    public static void main(String[] args) 
    {
        if(args.length==1)
		{
        	// Paso argumento cualquier nombre
	        System.out.println("Hola "+args[0]);
	        System.exit(1);
		}		
		else
	    {
	        System.out.println("No hay argumentos");
	        System.exit(-1);
		}
			
	/*Scanner entrada = new Scanner(System.in);
	System.out.println("Saludos: "+entrada.next());*/
        
    } // Fin de metodo main
    
} // Fin de clase