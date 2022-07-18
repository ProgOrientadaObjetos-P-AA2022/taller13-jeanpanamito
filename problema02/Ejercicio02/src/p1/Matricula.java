/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public abstract class Matricula {
    protected double tarifa;
    
    public abstract void establecerTarifa();
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
