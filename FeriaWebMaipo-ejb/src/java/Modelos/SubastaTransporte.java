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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "SUBASTA_TRANSPORTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubastaTransporte.findAll", query = "SELECT s FROM SubastaTransporte s")
    , @NamedQuery(name = "SubastaTransporte.findByIdSubastaTransporte", query = "SELECT s FROM SubastaTransporte s WHERE s.idSubastaTransporte = :idSubastaTransporte")
    , @NamedQuery(name = "SubastaTransporte.findByDirecci\u00f3nEntrega", query = "SELECT s FROM SubastaTransporte s WHERE s.direcci\u00f3nEntrega = :direcci\u00f3nEntrega")
    , @NamedQuery(name = "SubastaTransporte.findByFechaEntrega", query = "SELECT s FROM SubastaTransporte s WHERE s.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "SubastaTransporte.findByDistancia", query = "SELECT s FROM SubastaTransporte s WHERE s.distancia = :distancia")})
public class SubastaTransporte implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SUBASTA_TRANSPORTE")
    private BigDecimal idSubastaTransporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DIRECCI\u00d3N_ENTREGA")
    private String direcciónEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DISTANCIA")
    private BigInteger distancia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subastaTransporteFk")
    private List<PostulacionesTransporte> postulacionesTransporteList;
    @JoinColumn(name = "VENTA_EXTERNA_FK", referencedColumnName = "ID_VENTA_EXTERNA")
    @ManyToOne(optional = false)
    private VentaExterna ventaExternaFk;

    public SubastaTransporte() {
    }

    public SubastaTransporte(BigDecimal idSubastaTransporte) {
        this.idSubastaTransporte = idSubastaTransporte;
    }

    public SubastaTransporte(BigDecimal idSubastaTransporte, String direcciónEntrega, Date fechaEntrega, BigInteger distancia) {
        this.idSubastaTransporte = idSubastaTransporte;
        this.direcciónEntrega = direcciónEntrega;
        this.fechaEntrega = fechaEntrega;
        this.distancia = distancia;
    }

    public BigDecimal getIdSubastaTransporte() {
        return idSubastaTransporte;
    }

    public void setIdSubastaTransporte(BigDecimal idSubastaTransporte) {
        this.idSubastaTransporte = idSubastaTransporte;
    }

    public String getDirecciónEntrega() {
        return direcciónEntrega;
    }

    public void setDirecciónEntrega(String direcciónEntrega) {
        this.direcciónEntrega = direcciónEntrega;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public BigInteger getDistancia() {
        return distancia;
    }

    public void setDistancia(BigInteger distancia) {
        this.distancia = distancia;
    }

    @XmlTransient
    public List<PostulacionesTransporte> getPostulacionesTransporteList() {
        return postulacionesTransporteList;
    }

    public void setPostulacionesTransporteList(List<PostulacionesTransporte> postulacionesTransporteList) {
        this.postulacionesTransporteList = postulacionesTransporteList;
    }

    public VentaExterna getVentaExternaFk() {
        return ventaExternaFk;
    }

    public void setVentaExternaFk(VentaExterna ventaExternaFk) {
        this.ventaExternaFk = ventaExternaFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubastaTransporte != null ? idSubastaTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubastaTransporte)) {
            return false;
        }
        SubastaTransporte other = (SubastaTransporte) object;
        if ((this.idSubastaTransporte == null && other.idSubastaTransporte != null) || (this.idSubastaTransporte != null && !this.idSubastaTransporte.equals(other.idSubastaTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.SubastaTransporte[ idSubastaTransporte=" + idSubastaTransporte + " ]";
    }
    
}
