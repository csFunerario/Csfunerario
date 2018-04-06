/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import sena.edu.Csfunerario.Entity.Transancion;
import sena.edu.Csfunerario.Facade.TransancionFacade;
import sena.edu.Csfunerario.Facade.UsuarioFacade;
import sena.edu.Csfunerario.Controller.UsuarioController;
import sena.edu.Csfunerario.Entity.Usuario;

/**
 *
 * @author user
 */
@Named(value = "transaccionesController")
@SessionScoped
public class TransaccionesController implements Serializable {

    /**
     * Creates a new instance of TransaccionesController
     */
    public TransaccionesController() {
    }
    @EJB
    TransancionFacade transancionFacade;
    @EJB
    UsuarioFacade usuarioFacade;
    
    private Transancion transancion;
    private UsuarioController usuarioController;
    

    
    public void crearTrans(String tipoTrans, Usuario idusu, String tramitador){
        transancion.setIdUsuario(idusu);
        transancion.setTipoTransaccion(tipoTrans);
        transancion.setTramitador(tramitador);
        transancion.setEstado(true);
        transancionFacade.create(transancion);
    }
    public void actTrans(String tipoTrans, Usuario idusu){
        transancion.setEstado(true);
        transancion.setTipoTransaccion(tipoTrans);
        transancion.setTramitador(idusu.getNombre()+" "+idusu.getApellido());
        transancionFacade.edit(this.transancion);
    }
    

    public Transancion getTransancion() {
        return transancion;
    }

    public void setTransancion(Transancion transancion) {
        this.transancion = transancion;
    }

    public UsuarioController getUsuarioController() {
        return usuarioController;
    }

    public void setUsuarioController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }
}
