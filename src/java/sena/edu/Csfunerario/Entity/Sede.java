

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
 * Hora:  11:47:10 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "sedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s")
    , @NamedQuery(name = "Sede.findByIdSede", query = "SELECT s FROM Sede s WHERE s.idSede = :idSede")
    , @NamedQuery(name = "Sede.findByNombre", query = "SELECT s FROM Sede s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Sede.findByCiudad", query = "SELECT s FROM Sede s WHERE s.ciudad = :ciudad")
    , @NamedQuery(name = "Sede.findByDireccion", query = "SELECT s FROM Sede s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "Sede.findByCorreo", query = "SELECT s FROM Sede s WHERE s.correo = :correo")})
public class Sede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSede")
    private Integer idSede;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "correo")
    private String correo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSede", fetch = FetchType.EAGER)
    private List<TelefonoSede> telefonoSedeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSede", fetch = FetchType.EAGER)
    private List<RecursoSede> recursoSedeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSede", fetch = FetchType.EAGER)
    private List<PlanSede> planSedeList;

    public Sede() {
    }

    public Sede(Integer idSede) {
        this.idSede = idSede;
    }

    public Sede(Integer idSede, String nombre, String ciudad, String direccion, String correo) {
        this.idSede = idSede;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @XmlTransient
    public List<TelefonoSede> getTelefonoSedeList() {
        return telefonoSedeList;
    }

    public void setTelefonoSedeList(List<TelefonoSede> telefonoSedeList) {
        this.telefonoSedeList = telefonoSedeList;
    }

    @XmlTransient
    public List<RecursoSede> getRecursoSedeList() {
        return recursoSedeList;
    }

    public void setRecursoSedeList(List<RecursoSede> recursoSedeList) {
        this.recursoSedeList = recursoSedeList;
    }

    @XmlTransient
    public List<PlanSede> getPlanSedeList() {
        return planSedeList;
    }

    public void setPlanSedeList(List<PlanSede> planSedeList) {
        this.planSedeList = planSedeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSede != null ? idSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.idSede == null && other.idSede != null) || (this.idSede != null && !this.idSede.equals(other.idSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Sede[ idSede=" + idSede + " ]";
    }

}
