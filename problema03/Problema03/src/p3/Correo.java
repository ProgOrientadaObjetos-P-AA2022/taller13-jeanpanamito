/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class Correo {
    private DominioGmail dominioGmail;
    private String correo;
    private String username;
    
    public void establecerDominio(DominioGmail g){
        dominioGmail = g;
    }
    
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerCorreo(){
        correo = String.format("%s@%s", obtenerUserName(), 
                obtenerDominio().obtenerDominio());
    }
    
    public DominioGmail obtenerDominio(){
        return dominioGmail;
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
}
