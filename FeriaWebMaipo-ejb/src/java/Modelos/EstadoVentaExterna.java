/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 *
 * @author eroja
 */
@Entity
@Table(name = "ESTADO_VENTA_EXTERNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoVentaExterna.findAll", query = "SELECT e FROM EstadoVentaExterna e")
    , @NamedQuery(name = "EstadoVentaExterna.findByIdEstadoVentaExterna", query = "SELECT e FROM EstadoVentaExterna e WHERE e.idEstadoVentaExterna = :idEstadoVentaExterna")
    , @NamedQuery(name = "EstadoVentaExterna.findByNombreEstado", query = "SELECT e FROM EstadoVentaExterna e WHERE e.nombreEstado = :nombreEstado")
    , @NamedQuery(name = "EstadoVentaExterna.findByDescripcionEstado", query = "SELECT e FROM EstadoVentaExterna e WHERE e.descripcionEstado = :descripcionEstado")})
public class EstadoVentaExterna implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ESTADO_VENTA_EXTERNA")
    private BigDecimal idEstadoVentaExterna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DESCRIPCION_ESTADO")
    private String descripcionEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoVentaExternaFk")
    private List<VentaExterna> ventaExternaList;

    public EstadoVentaExterna() {
    }

    public EstadoVentaExterna(BigDecimal idEstadoVentaExterna) {
        this.idEstadoVentaExterna = idEstadoVentaExterna;
    }

    public EstadoVentaExterna(BigDecimal idEstadoVentaExterna, String nombreEstado, String descripcionEstado) {
        this.idEstadoVentaExterna = idEstadoVentaExterna;
        this.nombreEstado = nombreEstado;
        this.descripcionEstado = descripcionEstado;
    }

    public BigDecimal getIdEstadoVentaExterna() {
        return idEstadoVentaExterna;
    }

    public void setIdEstadoVentaExterna(BigDecimal idEstadoVentaExterna) {
        this.idEstadoVentaExterna = idEstadoVentaExterna;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    @XmlTransient
    public List<VentaExterna> getVentaExternaList() {
        return ventaExternaList;
    }

    public void setVentaExternaList(List<VentaExterna> ventaExternaList) {
        this.ventaExternaList = ventaExternaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoVentaExterna != null ? idEstadoVentaExterna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoVentaExterna)) {
            return false;
        }
        EstadoVentaExterna other = (EstadoVentaExterna) object;
        if ((this.idEstadoVentaExterna == null && other.idEstadoVentaExterna != null) || (this.idEstadoVentaExterna != null && !this.idEstadoVentaExterna.equals(other.idEstadoVentaExterna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.EstadoVentaExterna[ idEstadoVentaExterna=" + idEstadoVentaExterna + " ]";
    }
    
}
