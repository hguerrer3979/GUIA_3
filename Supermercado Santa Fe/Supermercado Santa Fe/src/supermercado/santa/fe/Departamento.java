/*Trabajo en Grupo Guia 3
//Proyecto desarrollado con lenguaje de programación Java "Supermercado SataFE" 
//*Autores
//HARBEY JAIR GUERRERO BULLA
//CAMILO ANDRES SERRANO QUINTERO 
//YEISSON ROMERO MANCIPE 
//Universidad EAN
//Construccion de Software
*/
package supermercado.santa.fe;

/**
 *
 * * @author HARBEY
 */
public class Departamento extends Empleado{ 
   
    protected int  horasTrabajadas;
   
    public Departamento(String n, String cc, String c, int hT){  
            super(n,cc,c,"Departamento"); 
             horasTrabajadas = hT; 
    }


   public double salarioDiario( ){  
            return (3256.18 * horasTrabajadas); 
    } 
}

