

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.ClasePlan;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:11 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class ClasePlanFacade extends AbstractFacade<ClasePlan> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClasePlanFacade() {
        super(ClasePlan.class);
    }

}
