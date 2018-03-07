

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.UsuarioPlan;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:25 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class UsuarioPlanFacade extends AbstractFacade<UsuarioPlan> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioPlanFacade() {
        super(UsuarioPlan.class);
    }

}
