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

import sena.edu.Csfunerario.Entity.TipoServicio;
import sena.edu.Csfunerario.Facade.TipoServicioFacade;

/**
 *
 * @author Janel Gongora
 */
@Named(value = "tipoServicioController")
@SessionScoped
public class tipoServicioController implements Serializable {

    /**
     * Creates a new instance of tipoServicioController
     */
    public tipoServicioController() {
        tipoServicio = new TipoServicio();
    }
    
    @EJB
    TipoServicioFacade tipoServicioFacade;
    private  TipoServicio tipoServicio;

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    public void crearTipoServicio(){        
        tipoServicioFacade.create(tipoServicio);
    }
    
    
    
}
