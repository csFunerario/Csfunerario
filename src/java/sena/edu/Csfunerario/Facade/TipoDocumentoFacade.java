

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.TipoDocumento;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:22 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class TipoDocumentoFacade extends AbstractFacade<TipoDocumento> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoDocumentoFacade() {
        super(TipoDocumento.class);
    }

    public EntityManager getEm() {
        return em;
    }

}
