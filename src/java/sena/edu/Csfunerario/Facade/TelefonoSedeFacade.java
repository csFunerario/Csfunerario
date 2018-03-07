

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.TelefonoSede;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:21 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class TelefonoSedeFacade extends AbstractFacade<TelefonoSede> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TelefonoSedeFacade() {
        super(TelefonoSede.class);
    }

}
