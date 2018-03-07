

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.ContratoAfiliacionUsuario;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:12 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class ContratoAfiliacionUsuarioFacade extends AbstractFacade<ContratoAfiliacionUsuario> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContratoAfiliacionUsuarioFacade() {
        super(ContratoAfiliacionUsuario.class);
    }

}
