/*
    Joaquin Montero. 2DAM.  PSP --> T2 Procesos Java. 
    Ejercicio 2(pdf procesos Java )

        Realizar un programa que lea argumentos de main(), e informe con System.exit() de las
        siguientes situaciones:
        1. Retornar 1, si número de argumentos es cero.
        2. Retornar 2, si el argumento es una cadena.
        3. Retornar 3, si el argumento es un número entero.
        4. Retornar 0 en cualquier otro caso.
        Escribir un segundo programa que ejecute al anterior, informando sobre el funcionamiento
        del proceso lanzado.
 */
package leerargumentos;

/**
 *
 * @author joaquin
 */
public class LeerArgumentos 
{
    public static void main(String[] args) 
    {
        boolean dec=false;
        
	if(args.length == 0)
		System.exit(1);
	else if(args.length == 1)
	{
            if(args[0].length()==1 && !Character.isDigit(args[0].charAt(0)))
            System.exit(0);
		
            for (int i = 0; i < args[0].length(); i++) 
            {
		if(!Character.isDigit(args[0].charAt(i)) && args[0].charAt(i) != '.')
                    System.exit(2);
                else if(args[0].charAt(i) == '.' && !dec)
                    dec = true;
		else if(args[0].charAt(i) == '.' && dec)
                    System.exit(2);	
            }
			
            if(dec)
                System.exit(0);
            else
                System.exit(3);
            
	}
	else
            System.exit(0);
    
    } // Fin de metodo main
    
} // Fin de clase