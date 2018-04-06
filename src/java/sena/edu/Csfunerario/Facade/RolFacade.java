

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Rol;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:19 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class RolFacade extends AbstractFacade<Rol> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolFacade() {
        super(Rol.class);
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

}
