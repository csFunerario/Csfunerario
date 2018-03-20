/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sena.edu.Csfunerario.Entity.Rol;
import sena.edu.Csfunerario.Entity.Usuario;
import sena.edu.Csfunerario.Entity.UsuarioRol;
import sena.edu.Csfunerario.Facade.RolFacade;
import sena.edu.Csfunerario.Facade.UsuarioFacade;
import sena.edu.Csfunerario.Facade.UsuarioRolFacade;

/**
 *
 * @author user
 */
@Named(value = "usuarioRolController")
@SessionScoped
public class UsuarioRolController implements Serializable {

    /**
     * Creates a new instance of UsuarioRolController
     */
    public UsuarioRolController() {
    }
     @EJB
    RolFacade rolFacade;
    
    @EJB
    UsuarioRolFacade usuarioRolFacade;
    
    @EJB
    UsuarioFacade usuarioFacade;

    private Rol rol;
    private UsuarioRol usuarioRol;
    private Usuario usuario; 

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public UsuarioRol getUsuarioRol() {
        return usuarioRol;
    }

    public void setUsuarioRol(UsuarioRol usuarioRol) {
        this.usuarioRol = usuarioRol;
    }
    
    public List<Rol>listRol(){
        return rolFacade.findAll();
    }
    public String crerRol(){
        usuarioRol.setIdUsuario(usuario);
        usuarioRol.setIdRol(rol);
        usuarioRolFacade.create(usuarioRol);
        return "adminProducts?faces-redirect=true";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<UsuarioRol> listUsuRol(){
        return usuarioRolFacade.findAll();
    }
}
