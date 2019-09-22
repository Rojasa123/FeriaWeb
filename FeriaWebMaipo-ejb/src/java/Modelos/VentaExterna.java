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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "VENTA_EXTERNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaExterna.findAll", query = "SELECT v FROM VentaExterna v")
    , @NamedQuery(name = "VentaExterna.findByIdVentaExterna", query = "SELECT v FROM VentaExterna v WHERE v.idVentaExterna = :idVentaExterna")
    , @NamedQuery(name = "VentaExterna.findByIdPostulacionVenta", query = "SELECT v FROM VentaExterna v WHERE v.idPostulacionVenta = :idPostulacionVenta")
    , @NamedQuery(name = "VentaExterna.findByIdPostulacionTransporte", query = "SELECT v FROM VentaExterna v WHERE v.idPostulacionTransporte = :idPostulacionTransporte")})
public class VentaExterna implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_VENTA_EXTERNA")
    private BigDecimal idVentaExterna;
    @Column(name = "ID_POSTULACION_VENTA")
    private BigInteger idPostulacionVenta;
    @Column(name = "ID_POSTULACION_TRANSPORTE")
    private BigInteger idPostulacionTransporte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventaExternaFk")
    private List<PostulacionesVentaExterna> postulacionesVentaExternaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventaExternaFk")
    private List<SubastaTransporte> subastaTransporteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventaExternaFk")
    private List<ControlCalidad> controlCalidadList;
    @JoinColumn(name = "COMISION_FK", referencedColumnName = "ID_COMISION")
    @ManyToOne(optional = false)
    private Comision comisionFk;
    @JoinColumn(name = "COMISION_ADUANA_FK", referencedColumnName = "ID_COMISION_ADUANA")
    @ManyToOne(optional = false)
    private ComisionAduana comisionAduanaFk;
    @JoinColumn(name = "ESTADO_VENTA_EXTERNA_FK", referencedColumnName = "ID_ESTADO_VENTA_EXTERNA")
    @ManyToOne(optional = false)
    private EstadoVentaExterna estadoVentaExternaFk;
    @JoinColumn(name = "SOLICITUD_VENTA_EXTERNA_FK", referencedColumnName = "ID_SOLICITUD_VENTA_EXTERNA")
    @ManyToOne(optional = false)
    private SolicitudVentaExterna solicitudVentaExternaFk;

    public VentaExterna() {
    }

    public VentaExterna(BigDecimal idVentaExterna) {
        this.idVentaExterna = idVentaExterna;
    }

    public BigDecimal getIdVentaExterna() {
        return idVentaExterna;
    }

    public void setIdVentaExterna(BigDecimal idVentaExterna) {
        this.idVentaExterna = idVentaExterna;
    }

    public BigInteger getIdPostulacionVenta() {
        return idPostulacionVenta;
    }

    public void setIdPostulacionVenta(BigInteger idPostulacionVenta) {
        this.idPostulacionVenta = idPostulacionVenta;
    }

    public BigInteger getIdPostulacionTransporte() {
        return idPostulacionTransporte;
    }

    public void setIdPostulacionTransporte(BigInteger idPostulacionTransporte) {
        this.idPostulacionTransporte = idPostulacionTransporte;
    }

    @XmlTransient
    public List<PostulacionesVentaExterna> getPostulacionesVentaExternaList() {
        return postulacionesVentaExternaList;
    }

    public void setPostulacionesVentaExternaList(List<PostulacionesVentaExterna> postulacionesVentaExternaList) {
        this.postulacionesVentaExternaList = postulacionesVentaExternaList;
    }

    @XmlTransient
    public List<SubastaTransporte> getSubastaTransporteList() {
        return subastaTransporteList;
    }

    public void setSubastaTransporteList(List<SubastaTransporte> subastaTransporteList) {
        this.subastaTransporteList = subastaTransporteList;
    }

    @XmlTransient
    public List<ControlCalidad> getControlCalidadList() {
        return controlCalidadList;
    }

    public void setControlCalidadList(List<ControlCalidad> controlCalidadList) {
        this.controlCalidadList = controlCalidadList;
    }

    public Comision getComisionFk() {
        return comisionFk;
    }

    public void setComisionFk(Comision comisionFk) {
        this.comisionFk = comisionFk;
    }

    public ComisionAduana getComisionAduanaFk() {
        return comisionAduanaFk;
    }

    public void setComisionAduanaFk(ComisionAduana comisionAduanaFk) {
        this.comisionAduanaFk = comisionAduanaFk;
    }

    public EstadoVentaExterna getEstadoVentaExternaFk() {
        return estadoVentaExternaFk;
    }

    public void setEstadoVentaExternaFk(EstadoVentaExterna estadoVentaExternaFk) {
        this.estadoVentaExternaFk = estadoVentaExternaFk;
    }

    public SolicitudVentaExterna getSolicitudVentaExternaFk() {
        return solicitudVentaExternaFk;
    }

    public void setSolicitudVentaExternaFk(SolicitudVentaExterna solicitudVentaExternaFk) {
        this.solicitudVentaExternaFk = solicitudVentaExternaFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentaExterna != null ? idVentaExterna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaExterna)) {
            return false;
        }
        VentaExterna other = (VentaExterna) object;
        if ((this.idVentaExterna == null && other.idVentaExterna != null) || (this.idVentaExterna != null && !this.idVentaExterna.equals(other.idVentaExterna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.VentaExterna[ idVentaExterna=" + idVentaExterna + " ]";
    }
    
}
