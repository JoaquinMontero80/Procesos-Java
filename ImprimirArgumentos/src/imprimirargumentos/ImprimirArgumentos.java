/*
    Joaquin Montero. 2DAM.  PSP --> T2 Procesos Java. 
    Ejercicio 3(pdf procesos Java )

        Crea un programa que visualice 5 veces la cadena que se le envía como argumento a main().
        Si no se le envía argumentos, deberá mostrar un mensaje indicándolo, y el programa
        finalizará enviando el código de terminación -1. Llamar este programa desde otro que acepte
        la cadena y se la pase al primero como subproceso.
 */
package imprimirargumentos;

/**
 *
 * @author joaquin
 */
public class ImprimirArgumentos 
{
    public static void main(String[] args) 
    {
        if(args.length == 0)
	{
            System.out.println("No hay argumentos");
            System.exit(-1);
	}
	else
	{
            for (int i = 0; i < 5; i++)
            System.out.println(args[0]);
			
            System.exit(1);
	}
        
    } // Fin de mtodo main
    
} // Fin de clase