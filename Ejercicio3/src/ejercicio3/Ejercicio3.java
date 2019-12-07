/***************************************************************************************************
    Joaquin Montero. 2DAM.   Procesos --> Ejercicio 3 Procesos Java
    Crea un programa que visualice 5 veces la cadena que se le envía como argumento a main().
    Si no se le envía argumentos, deberá mostrar un mensaje indicándolo, y el programa
    finalizará enviando el código de terminación -1. Llamar este programa desde otro que acepte
    la cadena y se la pase al primero como subproceso.
 ****************************************************************************************************/

package ejercicio3;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author joaquin
 */
public class Ejercicio3 
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
	Process p = null;
                
         
	File diretorio = new File("C:\\Users\\joaquin\\Desktop\\Joaquin\\DESARROLLADOR MULTIPLATAFORMA\\SEGUNDO\\PROGRAMACION SERVICIOS Y PROCESOS\\TEMA 2\\ProcesosJava\\ImprimirArgumentos\\src\\imprimirargumentos");
        ProcessBuilder pb;
        
        System.out.println("Introduce una cadena: ");
        
        
	try 
	{
            pb = new ProcessBuilder("java","ImprimirArgumentos", entrada.nextLine());
            pb.directory(diretorio);
            p = pb.start();
            InputStream is = p.getInputStream();
            int car;
            while((car = is.read())!=-1)
            System.out.print((char) car);
            is.close();
            System.out.println("Salida: "+p.waitFor());
	}
	catch(Exception ex) {
            ex.printStackTrace();
        }
        
    } // Fin de metodo main
    
} // Fin de clase
