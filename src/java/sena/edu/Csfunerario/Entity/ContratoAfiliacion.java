

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:11 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "contratoafiliaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContratoAfiliacion.findAll", query = "SELECT c FROM ContratoAfiliacion c")
    , @NamedQuery(name = "ContratoAfiliacion.findByIdContratoAfiliacion", query = "SELECT c FROM ContratoAfiliacion c WHERE c.idContratoAfiliacion = :idContratoAfiliacion")
    , @NamedQuery(name = "ContratoAfiliacion.findByTipoAfiliacion", query = "SELECT c FROM ContratoAfiliacion c WHERE c.tipoAfiliacion = :tipoAfiliacion")
    , @NamedQuery(name = "ContratoAfiliacion.findByNit", query = "SELECT c FROM ContratoAfiliacion c WHERE c.nit = :nit")
    , @NamedQuery(name = "ContratoAfiliacion.findByFechaInicio", query = "SELECT c FROM ContratoAfiliacion c WHERE c.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "ContratoAfiliacion.findByFechaFinalizacion", query = "SELECT c FROM ContratoAfiliacion c WHERE c.fechaFinalizacion = :fechaFinalizacion")
    , @NamedQuery(name = "ContratoAfiliacion.findByNumeroRadicado", query = "SELECT c FROM ContratoAfiliacion c WHERE c.numeroRadicado = :numeroRadicado")})
public class ContratoAfiliacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContratoAfiliacion")
    private Integer idContratoAfiliacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipoAfiliacion")
    private String tipoAfiliacion;
    @Size(max = 200)
    @Column(name = "nit")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFinalizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "numeroRadicado")
    private String numeroRadicado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idContratoAfiliacion", fetch = FetchType.EAGER)
    private List<ContratoAfiliacionUsuario> contratoAfiliacionUsuarioList;

    public ContratoAfiliacion() {
    }

    public ContratoAfiliacion(Integer idContratoAfiliacion) {
        this.idContratoAfiliacion = idContratoAfiliacion;
    }

    public ContratoAfiliacion(Integer idContratoAfiliacion, String tipoAfiliacion, Date fechaInicio, String numeroRadicado) {
        this.idContratoAfiliacion = idContratoAfiliacion;
        this.tipoAfiliacion = tipoAfiliacion;
        this.fechaInicio = fechaInicio;
        this.numeroRadicado = numeroRadicado;
    }

    public Integer getIdContratoAfiliacion() {
        return idContratoAfiliacion;
    }

    public void setIdContratoAfiliacion(Integer idContratoAfiliacion) {
        this.idContratoAfiliacion = idContratoAfiliacion;
    }

    public String getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    @XmlTransient
    public List<ContratoAfiliacionUsuario> getContratoAfiliacionUsuarioList() {
        return contratoAfiliacionUsuarioList;
    }

    public void setContratoAfiliacionUsuarioList(List<ContratoAfiliacionUsuario> contratoAfiliacionUsuarioList) {
        this.contratoAfiliacionUsuarioList = contratoAfiliacionUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContratoAfiliacion != null ? idContratoAfiliacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContratoAfiliacion)) {
            return false;
        }
        ContratoAfiliacion other = (ContratoAfiliacion) object;
        if ((this.idContratoAfiliacion == null && other.idContratoAfiliacion != null) || (this.idContratoAfiliacion != null && !this.idContratoAfiliacion.equals(other.idContratoAfiliacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.ContratoAfiliacion[ idContratoAfiliacion=" + idContratoAfiliacion + " ]";
    }

}
