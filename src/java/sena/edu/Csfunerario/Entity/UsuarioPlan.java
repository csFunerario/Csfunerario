

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
@Table(name = "usuarios_planes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioPlan.findAll", query = "SELECT u FROM UsuarioPlan u")
    , @NamedQuery(name = "UsuarioPlan.findByIdUsuarioPlan", query = "SELECT u FROM UsuarioPlan u WHERE u.idUsuarioPlan = :idUsuarioPlan")})
public class UsuarioPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario_Plan")
    private Integer idUsuarioPlan;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plan idPlan;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario idUsuario;

    public UsuarioPlan() {
    }

    public UsuarioPlan(Integer idUsuarioPlan) {
        this.idUsuarioPlan = idUsuarioPlan;
    }

    public Integer getIdUsuarioPlan() {
        return idUsuarioPlan;
    }

    public void setIdUsuarioPlan(Integer idUsuarioPlan) {
        this.idUsuarioPlan = idUsuarioPlan;
    }

    public Plan getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Plan idPlan) {
        this.idPlan = idPlan;
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
        hash += (idUsuarioPlan != null ? idUsuarioPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPlan)) {
            return false;
        }
        UsuarioPlan other = (UsuarioPlan) object;
        if ((this.idUsuarioPlan == null && other.idUsuarioPlan != null) || (this.idUsuarioPlan != null && !this.idUsuarioPlan.equals(other.idUsuarioPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.UsuarioPlan[ idUsuarioPlan=" + idUsuarioPlan + " ]";
    }

}
