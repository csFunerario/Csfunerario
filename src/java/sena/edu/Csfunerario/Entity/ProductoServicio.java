

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
 * Hora:  11:47:12 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "productoservicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoServicio.findAll", query = "SELECT p FROM ProductoServicio p")
    , @NamedQuery(name = "ProductoServicio.findByIdProductoServicio", query = "SELECT p FROM ProductoServicio p WHERE p.idProductoServicio = :idProductoServicio")
    , @NamedQuery(name = "ProductoServicio.findByNombre", query = "SELECT p FROM ProductoServicio p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "ProductoServicio.findByPrecio", query = "SELECT p FROM ProductoServicio p WHERE p.precio = :precio")
    , @NamedQuery(name = "ProductoServicio.findByCaracteristicas", query = "SELECT p FROM ProductoServicio p WHERE p.caracteristicas = :caracteristicas")
    , @NamedQuery(name = "ProductoServicio.findByDescripcion", query = "SELECT p FROM ProductoServicio p WHERE p.descripcion = :descripcion")})
public class ProductoServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoServicio")
    private Integer idProductoServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private Integer precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 900)
    @Column(name = "caracteristicas")
    private String caracteristicas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductoServicio", fetch = FetchType.EAGER)
    private List<PlanProductoServicio> planProductoServicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductoServicio", fetch = FetchType.EAGER)
    private List<ProductoServicioFactura> productoServicioFacturaList;
    @JoinColumn(name = "idTipoServicio", referencedColumnName = "idTipoServicio")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoServicio idTipoServicio;

    public ProductoServicio() {
    }

    public ProductoServicio(Integer idProductoServicio) {
        this.idProductoServicio = idProductoServicio;
    }

    public ProductoServicio(Integer idProductoServicio, String nombre, Integer precio, String caracteristicas, String descripcion) {
        this.idProductoServicio = idProductoServicio;
        this.nombre = nombre;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
        this.descripcion = descripcion;
    }

    public Integer getIdProductoServicio() {
        return idProductoServicio;
    }

    public void setIdProductoServicio(Integer idProductoServicio) {
        this.idProductoServicio = idProductoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<PlanProductoServicio> getPlanProductoServicioList() {
        return planProductoServicioList;
    }

    public void setPlanProductoServicioList(List<PlanProductoServicio> planProductoServicioList) {
        this.planProductoServicioList = planProductoServicioList;
    }

    @XmlTransient
    public List<ProductoServicioFactura> getProductoServicioFacturaList() {
        return productoServicioFacturaList;
    }

    public void setProductoServicioFacturaList(List<ProductoServicioFactura> productoServicioFacturaList) {
        this.productoServicioFacturaList = productoServicioFacturaList;
    }

    public TipoServicio getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(TipoServicio idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoServicio != null ? idProductoServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoServicio)) {
            return false;
        }
        ProductoServicio other = (ProductoServicio) object;
        if ((this.idProductoServicio == null && other.idProductoServicio != null) || (this.idProductoServicio != null && !this.idProductoServicio.equals(other.idProductoServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.ProductoServicio[ idProductoServicio=" + idProductoServicio + " ]";
    }

}
