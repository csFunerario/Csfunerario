/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sena.edu.Csfunerario.Entity.Ciudad;
import sena.edu.Csfunerario.Facade.CiudadFacade;

/**
 *
 * @author Janel Gongora
 */
@Named(value = "ciudadController")
@SessionScoped

public class CiudadController implements Serializable {

    /**
     * Creates a new instance of CiudadController
     */
    public CiudadController() {
    }
    @EJB
    CiudadFacade ciudadFacade;
    
    public List<Ciudad>listarCiudad(){
        return ciudadFacade.findAll();
    }
}
