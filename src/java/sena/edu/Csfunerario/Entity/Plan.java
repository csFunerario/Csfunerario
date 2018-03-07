

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
@Table(name = "planes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plan.findAll", query = "SELECT p FROM Plan p")
    , @NamedQuery(name = "Plan.findByIdPlan", query = "SELECT p FROM Plan p WHERE p.idPlan = :idPlan")
    , @NamedQuery(name = "Plan.findByNombre", query = "SELECT p FROM Plan p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Plan.findByDescripcion", query = "SELECT p FROM Plan p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Plan.findByBeneficio", query = "SELECT p FROM Plan p WHERE p.beneficio = :beneficio")
    , @NamedQuery(name = "Plan.findByDestinoFinal", query = "SELECT p FROM Plan p WHERE p.destinoFinal = :destinoFinal")})
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlan")
    private Integer idPlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 1300)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2000)
    @Column(name = "beneficio")
    private String beneficio;
    @Size(max = 2000)
    @Column(name = "destinoFinal")
    private String destinoFinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan", fetch = FetchType.EAGER)
    private List<UsuarioPlan> usuarioPlanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan", fetch = FetchType.EAGER)
    private List<PlanSede> planSedeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan", fetch = FetchType.EAGER)
    private List<BeneficioAdicionalPlan> beneficioAdicionalPlanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan", fetch = FetchType.EAGER)
    private List<PlanProductoServicio> planProductoServicioList;
    @JoinColumn(name = "idTipoPlan", referencedColumnName = "idTipoPlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoPlan idTipoPlan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan", fetch = FetchType.EAGER)
    private List<PlanClasePlan> planClasePlanList;

    public Plan() {
    }

    public Plan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public Plan(Integer idPlan, String nombre) {
        this.idPlan = idPlan;
        this.nombre = nombre;
    }

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    @XmlTransient
    public List<UsuarioPlan> getUsuarioPlanList() {
        return usuarioPlanList;
    }

    public void setUsuarioPlanList(List<UsuarioPlan> usuarioPlanList) {
        this.usuarioPlanList = usuarioPlanList;
    }

    @XmlTransient
    public List<PlanSede> getPlanSedeList() {
        return planSedeList;
    }

    public void setPlanSedeList(List<PlanSede> planSedeList) {
        this.planSedeList = planSedeList;
    }

    @XmlTransient
    public List<BeneficioAdicionalPlan> getBeneficioAdicionalPlanList() {
        return beneficioAdicionalPlanList;
    }

    public void setBeneficioAdicionalPlanList(List<BeneficioAdicionalPlan> beneficioAdicionalPlanList) {
        this.beneficioAdicionalPlanList = beneficioAdicionalPlanList;
    }

    @XmlTransient
    public List<PlanProductoServicio> getPlanProductoServicioList() {
        return planProductoServicioList;
    }

    public void setPlanProductoServicioList(List<PlanProductoServicio> planProductoServicioList) {
        this.planProductoServicioList = planProductoServicioList;
    }

    public TipoPlan getIdTipoPlan() {
        return idTipoPlan;
    }

    public void setIdTipoPlan(TipoPlan idTipoPlan) {
        this.idTipoPlan = idTipoPlan;
    }

    @XmlTransient
    public List<PlanClasePlan> getPlanClasePlanList() {
        return planClasePlanList;
    }

    public void setPlanClasePlanList(List<PlanClasePlan> planClasePlanList) {
        this.planClasePlanList = planClasePlanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Plan[ idPlan=" + idPlan + " ]";
    }

}
