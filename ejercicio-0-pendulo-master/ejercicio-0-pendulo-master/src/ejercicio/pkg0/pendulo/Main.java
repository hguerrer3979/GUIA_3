
package ejercicio.pkg0.pendulo;

/**

* @author HARBEY
 */
public class Main {
    //Variables a calculo 
    public static void main (String[] args) {
        double Longitud;
        double Aceleracion_g;
        double Periodo;
        double Frecuencia;
        
        Ejercicio0Pendulo ejercicio0Pendulo =new Ejercicio0Pendulo ();
        //Datos solicitados al usuario 
        System.out.println("Creacion del Pendulo");
        System.out.print("Ingrese la Longitud del Pendulo : ");
        Longitud = consola.nextDouble();
        System.out.print("Ingrese la Aceleracion : ");
        Aceleracion_g = consola.nextDouble();
        Periodo = ejercicio0Pendulo.Periodo(Longitud, Aceleracion_g);
        System.out.println("El Periodo del Pendulo es : "+ Periodo);
        Frecuencia = ejercicio0Pendulo.Frecuencia(Periodo);
        System.out.println("La Frecuencia del Pendulo es : "+Frecuencia);
    }

 
    }
