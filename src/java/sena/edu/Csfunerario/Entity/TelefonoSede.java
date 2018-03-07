

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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:10 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "telefonossedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoSede.findAll", query = "SELECT t FROM TelefonoSede t")
    , @NamedQuery(name = "TelefonoSede.findByIdtelefonoSede", query = "SELECT t FROM TelefonoSede t WHERE t.idtelefonoSede = :idtelefonoSede")
    , @NamedQuery(name = "TelefonoSede.findByTipoTelefono", query = "SELECT t FROM TelefonoSede t WHERE t.tipoTelefono = :tipoTelefono")
    , @NamedQuery(name = "TelefonoSede.findByExtension", query = "SELECT t FROM TelefonoSede t WHERE t.extension = :extension")})
public class TelefonoSede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefonoSede")
    private Integer idtelefonoSede;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipoTelefono")
    private String tipoTelefono;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 50)
    @Column(name = "extension")
    private String extension;
    @JoinColumn(name = "idSede", referencedColumnName = "idSede")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Sede idSede;

    public TelefonoSede() {
    }

    public TelefonoSede(Integer idtelefonoSede) {
        this.idtelefonoSede = idtelefonoSede;
    }

    public TelefonoSede(Integer idtelefonoSede, String tipoTelefono, String telefono) {
        this.idtelefonoSede = idtelefonoSede;
        this.tipoTelefono = tipoTelefono;
        this.telefono = telefono;
    }

    public Integer getIdtelefonoSede() {
        return idtelefonoSede;
    }

    public void setIdtelefonoSede(Integer idtelefonoSede) {
        this.idtelefonoSede = idtelefonoSede;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Sede getIdSede() {
        return idSede;
    }

    public void setIdSede(Sede idSede) {
        this.idSede = idSede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefonoSede != null ? idtelefonoSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoSede)) {
            return false;
        }
        TelefonoSede other = (TelefonoSede) object;
        if ((this.idtelefonoSede == null && other.idtelefonoSede != null) || (this.idtelefonoSede != null && !this.idtelefonoSede.equals(other.idtelefonoSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.TelefonoSede[ idtelefonoSede=" + idtelefonoSede + " ]";
    }

}
