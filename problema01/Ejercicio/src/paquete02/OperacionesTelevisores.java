/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author PERSONAL
 */
public class OperacionesTelevisores {

    private ArrayList<Televisor> televisor;
    double precioTotal;
    double televisorMasCaro;
    String marcasVendidas;

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }

    public double obtenerPrecioTotal() {
        return precioTotal;
    }

    public void establecerTelevisor(ArrayList<Televisor> lista) {
        televisor = lista;
    }

    public ArrayList<Televisor> obtenerTelevisor() {
        return televisor;
    }

    public void establecertotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < televisor.size(); i++) {
            s = s + televisor.get(i).obtenerPrecio();

        }
        precioTotal = s;
    }

    public void televisorMasCaro() {
        double mayor = 0;
        for (int i = 0; i < televisor.size(); i++) {
            if (televisor.get(i).obtenerPrecio() > mayor) {
                mayor = televisor.get(i).obtenerPrecio();
            }

        }

        televisorMasCaro = mayor;

    }

    public void listaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < televisor.size(); i++) {
            s = String.format("%s%s\n", s, televisor.get(i).obtenerMarca());
        }
        marcasVendidas = s;
    }

    @Override
    public String toString() {
        String cadena = String.format("Reporte Televisores");
        for (int i = 0; i < televisor.size(); i++) {
            cadena = String.format("%s\n"
                    + "%s - Precio: %.2f ",
                    cadena, obtenerTelevisor().get(i).obtenerMarca(),
                    obtenerTelevisor().get(i).obtenerPrecio());
        }

        cadena = String.format("%s"
                + "\nTotal Precio televiosores: %.2f\n"
                + "Televisor mas caro: %.2f\n", cadena, precioTotal,
                televisorMasCaro);
        return cadena;
    }
}
