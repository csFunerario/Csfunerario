

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.BeneficioAdicional;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:09 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class BeneficioAdicionalFacade extends AbstractFacade<BeneficioAdicional> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BeneficioAdicionalFacade() {
        super(BeneficioAdicional.class);
    }

}
