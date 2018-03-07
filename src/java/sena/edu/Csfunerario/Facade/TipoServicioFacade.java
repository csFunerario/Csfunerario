

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.TipoServicio;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:23 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class TipoServicioFacade extends AbstractFacade<TipoServicio> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoServicioFacade() {
        super(TipoServicio.class);
    }

}
