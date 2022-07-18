/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Televisor {

    private String marca;
    private double precio;
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerPrecio(double m){
        precio = m;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public double obtenerPrecio(){
        return precio;
    }
    
   
    
    /*@Override
    public String toString(){
        return String.format("TV:%s\n%s\n",
                obtenerMarca(),
                obtenerPrecio());
    }
    */
    
}
