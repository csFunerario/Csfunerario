

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.BeneficioAdicionalPlan;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:10 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class BeneficioAdicionalPlanFacade extends AbstractFacade<BeneficioAdicionalPlan> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BeneficioAdicionalPlanFacade() {
        super(BeneficioAdicionalPlan.class);
    }

}
