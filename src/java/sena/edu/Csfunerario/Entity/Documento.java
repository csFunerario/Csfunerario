

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:11 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "documentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d")
    , @NamedQuery(name = "Documento.findByIdDocumento", query = "SELECT d FROM Documento d WHERE d.idDocumento = :idDocumento")
    , @NamedQuery(name = "Documento.findByTipoDocumento", query = "SELECT d FROM Documento d WHERE d.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Documento.findByUrl", query = "SELECT d FROM Documento d WHERE d.url = :url")})
public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDocumento")
    private Integer idDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "url")
    private String url;
    @JoinColumn(name = "idTransancion", referencedColumnName = "idTransancion")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Transancion idTransancion;

    public Documento() {
    }

    public Documento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Documento(Integer idDocumento, String tipoDocumento, String url) {
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
        this.url = url;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Transancion getIdTransancion() {
        return idTransancion;
    }

    public void setIdTransancion(Transancion idTransancion) {
        this.idTransancion = idTransancion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumento != null ? idDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Documento[ idDocumento=" + idDocumento + " ]";
    }

}
