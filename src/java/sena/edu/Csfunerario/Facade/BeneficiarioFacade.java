package sena.edu.Csfunerario.Facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sena.edu.Csfunerario.Entity.Beneficiario;
import sena.edu.Csfunerario.Entity.Usuario;

/**
 * Fecha: 20/02/2018 Hora: 11:48:07 AM Autor: Janel Gongora
 */
@Stateless
public class BeneficiarioFacade extends AbstractFacade<Beneficiario> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BeneficiarioFacade() {
        super(Beneficiario.class);
    }



    public EntityManager getEm() {
        return em;
    }

  

}
