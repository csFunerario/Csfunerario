

package sena.edu.Csfunerario.Facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sena.edu.Csfunerario.Entity.Usuario;
import sena.edu.Csfunerario.Entity.UsuarioRol;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:25 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class UsuarioRolFacade extends AbstractFacade<UsuarioRol> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioRolFacade() {
        super(UsuarioRol.class);
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public List<UsuarioRol> mostrarRol(Usuario objRol){
        
        Query consult= em.createNativeQuery("SELECT  roles.idRol, roles.nombre from roles  inner join usuarios_roles on roles.idRol=usuarios_roles.idRol inner join Usuarios on usuarios_roles.idUsuario=:idusu group by roles.nombre");
        consult.setParameter("idusu", objRol.getIdUsuario());
        List<UsuarioRol> listaRol= consult.getResultList();
        return listaRol;
    }
}
