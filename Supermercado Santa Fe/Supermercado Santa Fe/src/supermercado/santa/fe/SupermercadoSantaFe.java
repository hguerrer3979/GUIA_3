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

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author HARBEY
 */
public class SupermercadoSantaFe {
    
    public static void main(String[] args) {
        
        //Definimos variables locales para uso en la clase principal
         double salario=0, ventas=0;
         int p, horas=0;
         String otra="", nombre, apellido, cedula,ciudad, puesto = null;
         boolean control= false;
         
         DecimalFormat df = new DecimalFormat("0.00"); 
 
         
         do{
                //Pedimos los datos al usuario
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado.");
                apellido = JOptionPane.showInputDialog("Ingrese la apellido del empleado.");
                cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado.");
                ciudad = JOptionPane.showInputDialog("Ingrese la ciudad del empleado.");
                p = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el puesto del empleado:"
                        + "\n 1.Departemento"
                        + "\n 2.Servicio"
                        + "\n 3.Posicion"));

                //Evaluamos el tipo de puesto del empleado
                switch (p){
                    case 1:  // Se seleccionó Departamento
//                        puesto = "Departemento";
                        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado."));
                        Departamento objDepartamento = new Departamento(nombre, cedula,ciudad, horas);
                        ciudad = objDepartamento.ciudad();
                        puesto = objDepartamento.puesto();
                        salario = objDepartamento.salarioDiario();
                        control = true;
                        
                        break;
                                                
                    case 2:  // Se seleccionó Posicion
//                        puesto = "Limpieza";
                        Servicio objServicio = new Servicio(nombre, cedula,ciudad);
                        ciudad = objServicio.ciudad();
                        puesto = objServicio.puesto();
                        salario = objServicio.salarioDiario();
                        control = true;
                        break;
                        
                    case 3:  // Se seleccionó mostrador
//                        puesto = "Mostrador";
                        ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas diarias del empleado."));
                        Posicion objPosicion = new Posicion (nombre, cedula,ciudad, ventas);
                        ciudad = objPosicion.ciudad();
                        puesto = objPosicion.puesto();
                        salario = objPosicion.salarioDiario();
                        control = true;
                        break;
                    
                    
                    
                    default:
                           JOptionPane.showMessageDialog(null, "Ha seleccionado un cargo incorrecta");
                        control = false;

                }
                
                if (control){
                    JOptionPane.showMessageDialog(null, "Los datos del empleado son:"
                            + "\n NOMBRE: " + nombre
                            + "\n APELLIDO: " + apellido
                            + "\n CÉDULA: "  + cedula
                            + "\n Fontibon: " + ciudad
                            + "\n PUESTO: " + puesto
                            + "\n SALARIO DIARIO: " + salario
                            + "\n SALARIO MES: "+ salario*30
                            + "\n SALUD Y PENSION: "+ (salario*30)*0.08
                            + "\n TOTAL A PAGAR: "+ (salario*30 - ((salario*30)*0.08)));
                }

                //Le pregunto al usuario si desea ingresar otro empleado
                otra =JOptionPane.showInputDialog("¿Desea ingresar otro empleado (S/N)?");
                
         }while (otra.equalsIgnoreCase("s"));
         
         
         
    }  
        
    }
