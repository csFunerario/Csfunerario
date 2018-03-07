package sena.edu.Csfunerario.Facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sena.edu.Csfunerario.Entity.Usuario;
import static sena.edu.Csfunerario.Entity.Usuario_.numeroIdentificacion;

/**
 * Fecha: 20/02/2018 Hora: 11:48:24 AM Autor: Janel Gongora
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public Usuario iniciarSesion(Usuario objUsuario) {
        Usuario usuario = null;
        Query consulta = em.createQuery("SELECT u FROM Usuario u WHERE   u.numeroIdentificacion=:numeroIdentificacion and u.clave=:clave");
        consulta.setParameter("numeroIdentificacion", objUsuario.getNumeroIdentificacion());       
        consulta.setParameter("clave", objUsuario.getClave());
        List<Usuario> listaUsuario = consulta.getResultList();
        if (!listaUsuario.isEmpty()) {
            usuario = listaUsuario.get(0);
        }
        return usuario;
    }

    public EntityManager getEm() {
        return em;
    }

}
