

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Permiso;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:13 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class PermisoFacade extends AbstractFacade<Permiso> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PermisoFacade() {
        super(Permiso.class);
    }

}
