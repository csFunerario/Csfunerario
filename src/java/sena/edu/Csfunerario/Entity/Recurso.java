

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
import javax.persistence.Lob;
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
 * Hora:  11:47:12 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "recursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recurso.findAll", query = "SELECT r FROM Recurso r")
    , @NamedQuery(name = "Recurso.findByIdRecurso", query = "SELECT r FROM Recurso r WHERE r.idRecurso = :idRecurso")
    , @NamedQuery(name = "Recurso.findByNombre", query = "SELECT r FROM Recurso r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Recurso.findByDireccion", query = "SELECT r FROM Recurso r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Recurso.findByCiudad", query = "SELECT r FROM Recurso r WHERE r.ciudad = :ciudad")
    , @NamedQuery(name = "Recurso.findByCorreo", query = "SELECT r FROM Recurso r WHERE r.correo = :correo")
    , @NamedQuery(name = "Recurso.findByDisponiblidad", query = "SELECT r FROM Recurso r WHERE r.disponiblidad = :disponiblidad")
    , @NamedQuery(name = "Recurso.findByTiempo", query = "SELECT r FROM Recurso r WHERE r.tiempo = :tiempo")
    , @NamedQuery(name = "Recurso.findByCapacidad", query = "SELECT r FROM Recurso r WHERE r.capacidad = :capacidad")
    , @NamedQuery(name = "Recurso.findByDescripcion", query = "SELECT r FROM Recurso r WHERE r.descripcion = :descripcion")})
public class Recurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRecurso")
    private Integer idRecurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 200)
    @Column(name = "correo")
    private String correo;
    @Size(max = 45)
    @Column(name = "disponiblidad")
    private String disponiblidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tiempo")
    private String tiempo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "capacidad")
    private String capacidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecurso", fetch = FetchType.EAGER)
    private List<RecursoSede> recursoSedeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecurso", fetch = FetchType.EAGER)
    private List<RecursoReservaServicio> recursoReservaServicioList;
    @JoinColumn(name = "idTipoRecurso", referencedColumnName = "idTipoRecurso")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoRecurso idTipoRecurso;

    public Recurso() {
    }

    public Recurso(Integer idRecurso) {
        this.idRecurso = idRecurso;
    }

    public Recurso(Integer idRecurso, String nombre, String direccion, String ciudad, String telefono, String tiempo, String capacidad, String descripcion) {
        this.idRecurso = idRecurso;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.tiempo = tiempo;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
    }

    public Integer getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Integer idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDisponiblidad() {
        return disponiblidad;
    }

    public void setDisponiblidad(String disponiblidad) {
        this.disponiblidad = disponiblidad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<RecursoSede> getRecursoSedeList() {
        return recursoSedeList;
    }

    public void setRecursoSedeList(List<RecursoSede> recursoSedeList) {
        this.recursoSedeList = recursoSedeList;
    }

    @XmlTransient
    public List<RecursoReservaServicio> getRecursoReservaServicioList() {
        return recursoReservaServicioList;
    }

    public void setRecursoReservaServicioList(List<RecursoReservaServicio> recursoReservaServicioList) {
        this.recursoReservaServicioList = recursoReservaServicioList;
    }

    public TipoRecurso getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(TipoRecurso idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecurso != null ? idRecurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recurso)) {
            return false;
        }
        Recurso other = (Recurso) object;
        if ((this.idRecurso == null && other.idRecurso != null) || (this.idRecurso != null && !this.idRecurso.equals(other.idRecurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Recurso[ idRecurso=" + idRecurso + " ]";
    }

}
