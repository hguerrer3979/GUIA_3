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
 * @author HARBEY
 */
public class Servicio extends Empleado{


    public Servicio(String n, String cc, String c){  
        super(n,cc,c,"Servicio"); 
    }


    @Override
    public double salarioDiario( ){  
          return 26041.4; 
    } 
} 