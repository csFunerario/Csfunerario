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
import javax.faces.context.FacesContext;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;
import sena.edu.Csfunerario.Entity.Beneficiario;
import sena.edu.Csfunerario.Entity.Ciudad;
import sena.edu.Csfunerario.Entity.TipoDocumento;
import sena.edu.Csfunerario.Entity.Usuario;
import sena.edu.Csfunerario.Facade.BeneficiarioFacade;
import sena.edu.Csfunerario.Facade.CiudadFacade;
import sena.edu.Csfunerario.Facade.TipoDocumentoFacade;
import sena.edu.Csfunerario.Facade.UsuarioFacade;

/**
 *
 * @author Janel Gongora
 */
@Named(value = "beneficiarioController")
@SessionScoped
public class BeneficiarioController implements Serializable {

    /**
     * Creates a new instance of BeneficiarioController
     */
    public BeneficiarioController() {
        beneficiario = new Beneficiario();
        usuario = new Usuario();
        ciudad = new Ciudad();
        tipoDocumento = new TipoDocumento();
        usuarioController = new UsuarioController();
        usuSesion = new Usuario();
    }

    @EJB
    BeneficiarioFacade beneficiarioFacade;

    @EJB
    UsuarioFacade usuarioFacade;

    @EJB
    CiudadFacade ciudadFacade;

    @EJB
    TipoDocumentoFacade tipoDocumentoFacade;

    private Usuario usuario;
    private Beneficiario beneficiario;
    private Ciudad ciudad;
    private TipoDocumento tipoDocumento;
    private UsuarioController usuarioController;
    private Usuario usuSesion;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public UsuarioController getUsuarioController() {
        return usuarioController;
    }

    public void setUsuarioController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public List<Beneficiario> listarBeneficiario() {
        usuario = usuarioController.mostrarSesion();
        Query consulta = beneficiarioFacade.getEm().createQuery("SELECT b FROM Beneficiario b WHERE b.idUsuario = :idUsuario");
        consulta.setParameter("idUsuario", usuario);
        List<Beneficiario> listaBeneficiario = consulta.getResultList();
        return listaBeneficiario;
    }

    public String editarPersona(Beneficiario benef) {
        this.beneficiario = benef;
        return "Actualiza_Beneficiario?faces-redirect=true";
    }

    public String editarPersona() {
        usuario = usuarioController.mostrarSesion();
        beneficiario.setIdUsuario(usuario);  
        beneficiario.setTipoDocumento(tipoDocumento.getNombre());
        beneficiario.setCiudad(ciudad.getNombre());
        this.beneficiarioFacade.edit(beneficiario);
        beneficiario = new Beneficiario();
        return "Usu_Beneficiarios?faces-redirect=true";
    }

     public String crearPersona (){
        usuario = usuarioController.mostrarSesion();
        beneficiario.setIdUsuario(usuario);
        beneficiario.setCiudad(ciudad.getNombre());
        beneficiario.setTipoDocumento(tipoDocumento.getNombre());  
        beneficiarioFacade.create(beneficiario);
        beneficiario = new Beneficiario();    
        return "Usu_Beneficiarios?faces-redirect=true";
    }  
    
         
    public String eliminarPersona(Beneficiario benefElim){ 
        beneficiario = benefElim;      
        //persona.setEstado(0);
        beneficiarioFacade.remove(beneficiario);
        beneficiario = new Beneficiario();
      return "Usu_Beneficiarios?faces-redirect=true";
    }
     
}
