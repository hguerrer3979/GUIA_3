
package ejercicio.pkg0.pendulo;

/**
 * * @author HARBEY
 */
public class Ejercicio0Pendulo {

//Variables a definir
    
    private double Longitud;
    private double Aceleracion_g;
      
    public double getLongitud(){
        return Longitud;
    }
    public double getAceleracion_g(){
        return Aceleracion_g;
    }
    //Ecuacion para hallar el  Periodo
    public final double Periodo(double longitud , double aceleracion_g){
        double periodo;
        periodo = 2*Math.PI * Math.sqrt(aceleracion_g/longitud);
        return periodo;
    }
    //Ecuacion para hallar la Frecuencia
    public final double Frecuencia(double periodo){
        double frecuencia;
        frecuencia = (1/periodo);
        return frecuencia;
    }
}
