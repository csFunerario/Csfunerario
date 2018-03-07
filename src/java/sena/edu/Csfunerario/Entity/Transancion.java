

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "transanciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transancion.findAll", query = "SELECT t FROM Transancion t")
    , @NamedQuery(name = "Transancion.findByIdTransancion", query = "SELECT t FROM Transancion t WHERE t.idTransancion = :idTransancion")
    , @NamedQuery(name = "Transancion.findByTipoTransaccion", query = "SELECT t FROM Transancion t WHERE t.tipoTransaccion = :tipoTransaccion")
    , @NamedQuery(name = "Transancion.findByEstado", query = "SELECT t FROM Transancion t WHERE t.estado = :estado")
    , @NamedQuery(name = "Transancion.findByTramitador", query = "SELECT t FROM Transancion t WHERE t.tramitador = :tramitador")})
public class Transancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTransancion")
    private Integer idTransancion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "tipoTransaccion")
    private String tipoTransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tramitador")
    private String tramitador;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTransancion", fetch = FetchType.EAGER)
    private List<Documento> documentoList;

    public Transancion() {
    }

    public Transancion(Integer idTransancion) {
        this.idTransancion = idTransancion;
    }

    public Transancion(Integer idTransancion, String tipoTransaccion, boolean estado, String tramitador) {
        this.idTransancion = idTransancion;
        this.tipoTransaccion = tipoTransaccion;
        this.estado = estado;
        this.tramitador = tramitador;
    }

    public Integer getIdTransancion() {
        return idTransancion;
    }

    public void setIdTransancion(Integer idTransancion) {
        this.idTransancion = idTransancion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTramitador() {
        return tramitador;
    }

    public void setTramitador(String tramitador) {
        this.tramitador = tramitador;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<Documento> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<Documento> documentoList) {
        this.documentoList = documentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransancion != null ? idTransancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transancion)) {
            return false;
        }
        Transancion other = (Transancion) object;
        if ((this.idTransancion == null && other.idTransancion != null) || (this.idTransancion != null && !this.idTransancion.equals(other.idTransancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Transancion[ idTransancion=" + idTransancion + " ]";
    }

}
