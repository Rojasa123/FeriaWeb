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
@Table(name = "COMISION_ADUANA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComisionAduana.findAll", query = "SELECT c FROM ComisionAduana c")
    , @NamedQuery(name = "ComisionAduana.findByIdComisionAduana", query = "SELECT c FROM ComisionAduana c WHERE c.idComisionAduana = :idComisionAduana")
    , @NamedQuery(name = "ComisionAduana.findByNombreComision", query = "SELECT c FROM ComisionAduana c WHERE c.nombreComision = :nombreComision")
    , @NamedQuery(name = "ComisionAduana.findByPorcentajeComisionAduana", query = "SELECT c FROM ComisionAduana c WHERE c.porcentajeComisionAduana = :porcentajeComisionAduana")
    , @NamedQuery(name = "ComisionAduana.findByDescripcionComisionAduana", query = "SELECT c FROM ComisionAduana c WHERE c.descripcionComisionAduana = :descripcionComisionAduana")})
public class ComisionAduana implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COMISION_ADUANA")
    private BigDecimal idComisionAduana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_COMISION")
    private String nombreComision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORCENTAJE_COMISION_ADUANA")
    private BigInteger porcentajeComisionAduana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DESCRIPCION_COMISION_ADUANA")
    private String descripcionComisionAduana;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comisionAduanaFk")
    private List<VentaExterna> ventaExternaList;

    public ComisionAduana() {
    }

    public ComisionAduana(BigDecimal idComisionAduana) {
        this.idComisionAduana = idComisionAduana;
    }

    public ComisionAduana(BigDecimal idComisionAduana, String nombreComision, BigInteger porcentajeComisionAduana, String descripcionComisionAduana) {
        this.idComisionAduana = idComisionAduana;
        this.nombreComision = nombreComision;
        this.porcentajeComisionAduana = porcentajeComisionAduana;
        this.descripcionComisionAduana = descripcionComisionAduana;
    }

    public BigDecimal getIdComisionAduana() {
        return idComisionAduana;
    }

    public void setIdComisionAduana(BigDecimal idComisionAduana) {
        this.idComisionAduana = idComisionAduana;
    }

    public String getNombreComision() {
        return nombreComision;
    }

    public void setNombreComision(String nombreComision) {
        this.nombreComision = nombreComision;
    }

    public BigInteger getPorcentajeComisionAduana() {
        return porcentajeComisionAduana;
    }

    public void setPorcentajeComisionAduana(BigInteger porcentajeComisionAduana) {
        this.porcentajeComisionAduana = porcentajeComisionAduana;
    }

    public String getDescripcionComisionAduana() {
        return descripcionComisionAduana;
    }

    public void setDescripcionComisionAduana(String descripcionComisionAduana) {
        this.descripcionComisionAduana = descripcionComisionAduana;
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
        hash += (idComisionAduana != null ? idComisionAduana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComisionAduana)) {
            return false;
        }
        ComisionAduana other = (ComisionAduana) object;
        if ((this.idComisionAduana == null && other.idComisionAduana != null) || (this.idComisionAduana != null && !this.idComisionAduana.equals(other.idComisionAduana))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ComisionAduana[ idComisionAduana=" + idComisionAduana + " ]";
    }
    
}
