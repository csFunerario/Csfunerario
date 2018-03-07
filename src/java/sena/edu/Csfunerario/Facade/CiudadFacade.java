

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Ciudad;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:10 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class CiudadFacade extends AbstractFacade<Ciudad> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadFacade() {
        super(Ciudad.class);
    }

    public EntityManager getEm() {
        return em;
    }

    
    
}
