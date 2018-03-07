

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:10 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "contratoafiliaciones_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContratoAfiliacionUsuario.findAll", query = "SELECT c FROM ContratoAfiliacionUsuario c")
    , @NamedQuery(name = "ContratoAfiliacionUsuario.findByIdContratoAfiliacionUsuario", query = "SELECT c FROM ContratoAfiliacionUsuario c WHERE c.idContratoAfiliacionUsuario = :idContratoAfiliacionUsuario")})
public class ContratoAfiliacionUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContratoAfiliacion_Usuario")
    private Integer idContratoAfiliacionUsuario;
    @JoinColumn(name = "idContratoAfiliacion", referencedColumnName = "idContratoAfiliacion")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ContratoAfiliacion idContratoAfiliacion;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario idUsuario;

    public ContratoAfiliacionUsuario() {
    }

    public ContratoAfiliacionUsuario(Integer idContratoAfiliacionUsuario) {
        this.idContratoAfiliacionUsuario = idContratoAfiliacionUsuario;
    }

    public Integer getIdContratoAfiliacionUsuario() {
        return idContratoAfiliacionUsuario;
    }

    public void setIdContratoAfiliacionUsuario(Integer idContratoAfiliacionUsuario) {
        this.idContratoAfiliacionUsuario = idContratoAfiliacionUsuario;
    }

    public ContratoAfiliacion getIdContratoAfiliacion() {
        return idContratoAfiliacion;
    }

    public void setIdContratoAfiliacion(ContratoAfiliacion idContratoAfiliacion) {
        this.idContratoAfiliacion = idContratoAfiliacion;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContratoAfiliacionUsuario != null ? idContratoAfiliacionUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContratoAfiliacionUsuario)) {
            return false;
        }
        ContratoAfiliacionUsuario other = (ContratoAfiliacionUsuario) object;
        if ((this.idContratoAfiliacionUsuario == null && other.idContratoAfiliacionUsuario != null) || (this.idContratoAfiliacionUsuario != null && !this.idContratoAfiliacionUsuario.equals(other.idContratoAfiliacionUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.ContratoAfiliacionUsuario[ idContratoAfiliacionUsuario=" + idContratoAfiliacionUsuario + " ]";
    }

}
