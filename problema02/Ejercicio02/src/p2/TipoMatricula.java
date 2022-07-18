/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas; // puedo tener muchos tipos de Transporte
    
    
    public void establecerMatriculas(ArrayList<Matricula> m){
        matriculas = m;
    }
    
    public ArrayList<Matricula> obtenerMatriculas(){
        return matriculas;
    };
    
    
    
    public void establecerPromedioMatriculas(){
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();
        
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\tReporte Matriculas");
       
            cadena = String.format("%s\n"
                    + "%s "
                    + "\nPromedio Matriculas: %.2f ",
                    cadena, obtenerMatriculas(),
                    obtenerPromedioMatriculas());
        return cadena;
    }
   
}
