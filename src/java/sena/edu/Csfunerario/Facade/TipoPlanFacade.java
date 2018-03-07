

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.TipoPlan;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:22 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class TipoPlanFacade extends AbstractFacade<TipoPlan> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPlanFacade() {
        super(TipoPlan.class);
    }

}
