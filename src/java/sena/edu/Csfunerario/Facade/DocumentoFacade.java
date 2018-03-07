

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Documento;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:12 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class DocumentoFacade extends AbstractFacade<Documento> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocumentoFacade() {
        super(Documento.class);
    }

}
