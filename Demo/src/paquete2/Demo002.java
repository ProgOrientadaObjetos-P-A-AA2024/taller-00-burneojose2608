/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        lo que estamos haciendo es importar lel paquete 1 mensaje y el pquete 3 
        informacion y de ahi usamos le printf y de ahi ponemos el porcentaje s 
        con el porcentaje d y de ahi le damos un salto de linea y ponemos toda 
        la direccion de los paquetes que importamos 
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero para imprimir");
        int num = entrada.nextInt();
        if( num >= 1 && num <= 5 ){
            System.out.printf("%s con %d\n",Mensaje.obtenerMensaje(),
                Informacion.obtenerHabitantes()); 
        }else{
              System.out.printf("%s con %d\n", Mensaje.obtenerMensaje().toUpperCase(),
                Informacion.obtenerHabitantes() ); 
              
           
        }
        
        
       
       
        // usar printf;
    }
    
}
