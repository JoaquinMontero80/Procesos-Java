/***************************************************************************************************
    Joaquin Montero. 2DAM.   Procesos --> Ejercicio 2 Procesos Java
    Realizar un programa que lea argumentos de main(), e informe con System.exit() de las
            siguientes situaciones:
        1. Retornar 1, si número de argumentos es cero.
        2. Retornar 2, si el argumento es una cadena.
        3. Retornar 3, si el argumento es un número entero.
        4. Retornar 0 en cualquier otro caso.
        Escribir un segundo programa que ejecute al anterior, informando sobre el funcionamiento
        del proceso lanzado.
 ***************************************************************************************************/

package ejercicio2;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author joaquin
 */
public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
	Process p = null;
		                
        
	File diretorio = new File("C:\\Users\\joaquin\\Desktop\\Joaquin\\DESARROLLADOR MULTIPLATAFORMA\\SEGUNDO\\PROGRAMACION SERVICIOS Y PROCESOS\\TEMA 2\\ProcesosJava\\LeerArgumentos\\src");
	ProcessBuilder pb;
        
        try
	{
            pb = new ProcessBuilder("java", "LeerArgumentos", "antonio");
            pb.directory(diretorio);
            p = pb.start();
            System.out.println("Salida: "+p.waitFor());
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
    } // Fin de metodo main
    
} // Fin de clase Main
