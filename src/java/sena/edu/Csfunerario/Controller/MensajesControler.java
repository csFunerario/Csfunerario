/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author user
 */
@Named(value = "mensajesControler")
@Dependent
public class MensajesControler {

    /**
     * Creates a new instance of MensajesControler
     */
    public MensajesControler() {
    }
    
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;}
    
    public void msjCrear(){
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Realizado",  "El registro a sido Guardado") );
    }
    
    public void msjeliminar(){
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Realizado",  "El registro a sido Eliminado") );
    }
    
    
    
}
