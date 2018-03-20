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
public abstract class Empleado{ 
    
    protected String nombre,apellido, cc, ciudad, puesto; 
    
    public Empleado(String n, String cedula, String c, String p){ 
                nombre = n; 
                apellido = n;
                cc = cedula; 
                ciudad = c; 
                puesto = p; 
    }

    public String puesto(){ 
      return puesto; 
    }

    public String ciudad(){  
       return ciudad; 
    }

    public abstract double salarioDiario( ); 
 

} 
