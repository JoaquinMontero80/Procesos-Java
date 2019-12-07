/***************************************************************************************************
    Joaquin Montero. 2DAM.  PSP --> T2 Procesos Java. 
    Clase Main principal. ( Ejecuta los 3 procesos de los 3 ejercicios ) 
    Crea un programa llamado LeerNombre que reciba desde main() un parámetro
    correspondiente a un nombre propio y lo muestre en pantalla. Usar System.exit(1) para
    indicar la finalización correcta, y System.exit(-1) para el caso de finalización de manera
    anormal. Escribir otro programa para ejecutar como proceso al realizado anteriormente
    LeerNombre, utilizando el método waitFor() para comprobar el valor de salida del proceso
    que ejecuta.
 ***************************************************************************************************/

package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author joaquin
 */
public class Ejercicio1 
{
    public static void main(String[] args) throws IOException 
    {
	Scanner entrada = new Scanner(System.in);
	Process p = null;
		
	File diretorio = new File("C:\\Users\\joaquin\\Desktop\\Joaquin\\DESARROLLADOR MULTIPLATAFORMA\\SEGUNDO\\PROGRAMACION SERVICIOS Y PROCESOS\\TEMA 2\\ProcesosJava\\LeerNombre\\src");
	ProcessBuilder pb;
        
	try 
	{
            pb = new ProcessBuilder("java","LeerNombre");
            pb.directory(diretorio);
            p = pb.start();
            InputStream is = p.getInputStream();
            int car;
            while((car = is.read())!=-1)
		System.out.print((char) car);
		is.close();
	}
	catch(Exception ex) {
            ex.printStackTrace();
	}
		
	
        try 
	{
            int salida = p.waitFor();
            System.out.println("Salida: "+salida);
	} 
	catch (Exception e) {
            e.printStackTrace();
	}
        
    } // Fin de metodo main
    
} // Fin de clase