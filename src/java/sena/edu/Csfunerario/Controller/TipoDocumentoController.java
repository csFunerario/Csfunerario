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
import sena.edu.Csfunerario.Entity.TipoDocumento;
import sena.edu.Csfunerario.Facade.TipoDocumentoFacade;

/**
 *
 * @author Janel Gongora
 */
@Named(value = "tipoDocumentoController")
@SessionScoped
public class TipoDocumentoController implements Serializable {

    /**
     * Creates a new instance of TipoDocumentoController
     */
    public TipoDocumentoController() {
    }
    @EJB
    TipoDocumentoFacade tipoDocumentoFacade;
    
    public List<TipoDocumento> listarTipoDocumento(){
        return tipoDocumentoFacade.findAll();
    }
}
