/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "COMISION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comision.findAll", query = "SELECT c FROM Comision c")
    , @NamedQuery(name = "Comision.findByIdComision", query = "SELECT c FROM Comision c WHERE c.idComision = :idComision")
    , @NamedQuery(name = "Comision.findByNombreComision", query = "SELECT c FROM Comision c WHERE c.nombreComision = :nombreComision")
    , @NamedQuery(name = "Comision.findByPorcentajeComision", query = "SELECT c FROM Comision c WHERE c.porcentajeComision = :porcentajeComision")
    , @NamedQuery(name = "Comision.findByDescripcionComision", query = "SELECT c FROM Comision c WHERE c.descripcionComision = :descripcionComision")})
public class Comision implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COMISION")
    private BigDecimal idComision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_COMISION")
    private String nombreComision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORCENTAJE_COMISION")
    private BigInteger porcentajeComision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DESCRIPCION_COMISION")
    private String descripcionComision;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comisionFk")
    private List<PublicacionVentasLocal> publicacionVentasLocalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comisionFk")
    private List<VentaExterna> ventaExternaList;

    public Comision() {
    }

    public Comision(BigDecimal idComision) {
        this.idComision = idComision;
    }

    public Comision(BigDecimal idComision, String nombreComision, BigInteger porcentajeComision, String descripcionComision) {
        this.idComision = idComision;
        this.nombreComision = nombreComision;
        this.porcentajeComision = porcentajeComision;
        this.descripcionComision = descripcionComision;
    }

    public BigDecimal getIdComision() {
        return idComision;
    }

    public void setIdComision(BigDecimal idComision) {
        this.idComision = idComision;
    }

    public String getNombreComision() {
        return nombreComision;
    }

    public void setNombreComision(String nombreComision) {
        this.nombreComision = nombreComision;
    }

    public BigInteger getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(BigInteger porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public String getDescripcionComision() {
        return descripcionComision;
    }

    public void setDescripcionComision(String descripcionComision) {
        this.descripcionComision = descripcionComision;
    }

    @XmlTransient
    public List<PublicacionVentasLocal> getPublicacionVentasLocalList() {
        return publicacionVentasLocalList;
    }

    public void setPublicacionVentasLocalList(List<PublicacionVentasLocal> publicacionVentasLocalList) {
        this.publicacionVentasLocalList = publicacionVentasLocalList;
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
        hash += (idComision != null ? idComision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comision)) {
            return false;
        }
        Comision other = (Comision) object;
        if ((this.idComision == null && other.idComision != null) || (this.idComision != null && !this.idComision.equals(other.idComision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Comision[ idComision=" + idComision + " ]";
    }
    
}
