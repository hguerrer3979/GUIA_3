/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.santa.fe;

/**
 *
 * * @author HARBEY
 */
public class Posicion extends Empleado{
    private Double ventas; 

    public Posicion(String n, String cc, String c, double v){  
       super(n,cc,c,"Posicion"); 
        ventas = v; 
    }


    public double salarioDiario( ){  
          return (26042 + 0.15 * ventas); 
    } 
} 