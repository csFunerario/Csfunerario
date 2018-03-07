

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Plan;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:14 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class PlanFacade extends AbstractFacade<Plan> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanFacade() {
        super(Plan.class);
    }

}
