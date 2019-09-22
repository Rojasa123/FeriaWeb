/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "INFORME_ESTADISTICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformeEstadistico.findAll", query = "SELECT i FROM InformeEstadistico i")
    , @NamedQuery(name = "InformeEstadistico.findByIdInformeEstadistico", query = "SELECT i FROM InformeEstadistico i WHERE i.idInformeEstadistico = :idInformeEstadistico")
    , @NamedQuery(name = "InformeEstadistico.findByCantidadTotalVentas", query = "SELECT i FROM InformeEstadistico i WHERE i.cantidadTotalVentas = :cantidadTotalVentas")
    , @NamedQuery(name = "InformeEstadistico.findByCantidadTotalVentaExterna", query = "SELECT i FROM InformeEstadistico i WHERE i.cantidadTotalVentaExterna = :cantidadTotalVentaExterna")
    , @NamedQuery(name = "InformeEstadistico.findByTotalSumaComision", query = "SELECT i FROM InformeEstadistico i WHERE i.totalSumaComision = :totalSumaComision")
    , @NamedQuery(name = "InformeEstadistico.findByCantidadVentasMensual", query = "SELECT i FROM InformeEstadistico i WHERE i.cantidadVentasMensual = :cantidadVentasMensual")
    , @NamedQuery(name = "InformeEstadistico.findByComisionMensual", query = "SELECT i FROM InformeEstadistico i WHERE i.comisionMensual = :comisionMensual")
    , @NamedQuery(name = "InformeEstadistico.findByCantidadVentaExternaMensual", query = "SELECT i FROM InformeEstadistico i WHERE i.cantidadVentaExternaMensual = :cantidadVentaExternaMensual")
    , @NamedQuery(name = "InformeEstadistico.findByComisionVentaExternaMensual", query = "SELECT i FROM InformeEstadistico i WHERE i.comisionVentaExternaMensual = :comisionVentaExternaMensual")
    , @NamedQuery(name = "InformeEstadistico.findByCantidadVentaLocalMensual", query = "SELECT i FROM InformeEstadistico i WHERE i.cantidadVentaLocalMensual = :cantidadVentaLocalMensual")
    , @NamedQuery(name = "InformeEstadistico.findByComisionVentaLocalMensual", query = "SELECT i FROM InformeEstadistico i WHERE i.comisionVentaLocalMensual = :comisionVentaLocalMensual")
    , @NamedQuery(name = "InformeEstadistico.findByFecha", query = "SELECT i FROM InformeEstadistico i WHERE i.fecha = :fecha")})
public class InformeEstadistico implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INFORME_ESTADISTICO")
    private BigDecimal idInformeEstadistico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_TOTAL_VENTAS")
    private BigInteger cantidadTotalVentas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_TOTAL_VENTA_EXTERNA")
    private BigInteger cantidadTotalVentaExterna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_SUMA_COMISION")
    private BigInteger totalSumaComision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_VENTAS_MENSUAL")
    private BigInteger cantidadVentasMensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMISION_MENSUAL")
    private BigInteger comisionMensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_VENTA_EXTERNA_MENSUAL")
    private BigInteger cantidadVentaExternaMensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMISION_VENTA_EXTERNA_MENSUAL")
    private BigInteger comisionVentaExternaMensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_VENTA_LOCAL_MENSUAL")
    private BigInteger cantidadVentaLocalMensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMISION_VENTA_LOCAL_MENSUAL")
    private BigInteger comisionVentaLocalMensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public InformeEstadistico() {
    }

    public InformeEstadistico(BigDecimal idInformeEstadistico) {
        this.idInformeEstadistico = idInformeEstadistico;
    }

    public InformeEstadistico(BigDecimal idInformeEstadistico, BigInteger cantidadTotalVentas, BigInteger cantidadTotalVentaExterna, BigInteger totalSumaComision, BigInteger cantidadVentasMensual, BigInteger comisionMensual, BigInteger cantidadVentaExternaMensual, BigInteger comisionVentaExternaMensual, BigInteger cantidadVentaLocalMensual, BigInteger comisionVentaLocalMensual, Date fecha) {
        this.idInformeEstadistico = idInformeEstadistico;
        this.cantidadTotalVentas = cantidadTotalVentas;
        this.cantidadTotalVentaExterna = cantidadTotalVentaExterna;
        this.totalSumaComision = totalSumaComision;
        this.cantidadVentasMensual = cantidadVentasMensual;
        this.comisionMensual = comisionMensual;
        this.cantidadVentaExternaMensual = cantidadVentaExternaMensual;
        this.comisionVentaExternaMensual = comisionVentaExternaMensual;
        this.cantidadVentaLocalMensual = cantidadVentaLocalMensual;
        this.comisionVentaLocalMensual = comisionVentaLocalMensual;
        this.fecha = fecha;
    }

    public BigDecimal getIdInformeEstadistico() {
        return idInformeEstadistico;
    }

    public void setIdInformeEstadistico(BigDecimal idInformeEstadistico) {
        this.idInformeEstadistico = idInformeEstadistico;
    }

    public BigInteger getCantidadTotalVentas() {
        return cantidadTotalVentas;
    }

    public void setCantidadTotalVentas(BigInteger cantidadTotalVentas) {
        this.cantidadTotalVentas = cantidadTotalVentas;
    }

    public BigInteger getCantidadTotalVentaExterna() {
        return cantidadTotalVentaExterna;
    }

    public void setCantidadTotalVentaExterna(BigInteger cantidadTotalVentaExterna) {
        this.cantidadTotalVentaExterna = cantidadTotalVentaExterna;
    }

    public BigInteger getTotalSumaComision() {
        return totalSumaComision;
    }

    public void setTotalSumaComision(BigInteger totalSumaComision) {
        this.totalSumaComision = totalSumaComision;
    }

    public BigInteger getCantidadVentasMensual() {
        return cantidadVentasMensual;
    }

    public void setCantidadVentasMensual(BigInteger cantidadVentasMensual) {
        this.cantidadVentasMensual = cantidadVentasMensual;
    }

    public BigInteger getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(BigInteger comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public BigInteger getCantidadVentaExternaMensual() {
        return cantidadVentaExternaMensual;
    }

    public void setCantidadVentaExternaMensual(BigInteger cantidadVentaExternaMensual) {
        this.cantidadVentaExternaMensual = cantidadVentaExternaMensual;
    }

    public BigInteger getComisionVentaExternaMensual() {
        return comisionVentaExternaMensual;
    }

    public void setComisionVentaExternaMensual(BigInteger comisionVentaExternaMensual) {
        this.comisionVentaExternaMensual = comisionVentaExternaMensual;
    }

    public BigInteger getCantidadVentaLocalMensual() {
        return cantidadVentaLocalMensual;
    }

    public void setCantidadVentaLocalMensual(BigInteger cantidadVentaLocalMensual) {
        this.cantidadVentaLocalMensual = cantidadVentaLocalMensual;
    }

    public BigInteger getComisionVentaLocalMensual() {
        return comisionVentaLocalMensual;
    }

    public void setComisionVentaLocalMensual(BigInteger comisionVentaLocalMensual) {
        this.comisionVentaLocalMensual = comisionVentaLocalMensual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformeEstadistico != null ? idInformeEstadistico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformeEstadistico)) {
            return false;
        }
        InformeEstadistico other = (InformeEstadistico) object;
        if ((this.idInformeEstadistico == null && other.idInformeEstadistico != null) || (this.idInformeEstadistico != null && !this.idInformeEstadistico.equals(other.idInformeEstadistico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.InformeEstadistico[ idInformeEstadistico=" + idInformeEstadistico + " ]";
    }
    
}
