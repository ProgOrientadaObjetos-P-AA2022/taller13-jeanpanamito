/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.*;

import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();

        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();

        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();

        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();

        TipoMatricula tipoMatricula = new TipoMatricula();
        ArrayList<Matricula> matriculas = new ArrayList<>();

        matriculas.add(mescuela);
        matriculas.add(mcamp);
        matriculas.add(mcolegio);
        matriculas.add(mescuela);
        matriculas.add(mjardin);
        matriculas.add(mmaternal);
        matriculas.add(mmaternal2);

        tipoMatricula.establecerMatriculas(matriculas);
        tipoMatricula.establecerPromedioMatriculas();

        System.out.printf("%s\n", tipoMatricula);
    }
}
