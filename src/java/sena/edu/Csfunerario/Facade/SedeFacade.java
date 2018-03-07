

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Sede;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:21 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class SedeFacade extends AbstractFacade<Sede> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SedeFacade() {
        super(Sede.class);
    }

}
