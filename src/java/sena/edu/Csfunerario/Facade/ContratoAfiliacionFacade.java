

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.ContratoAfiliacion;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:11 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class ContratoAfiliacionFacade extends AbstractFacade<ContratoAfiliacion> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContratoAfiliacionFacade() {
        super(ContratoAfiliacion.class);
    }

}
