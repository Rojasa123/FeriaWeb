/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "POSTULACIONES_TRANSPORTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostulacionesTransporte.findAll", query = "SELECT p FROM PostulacionesTransporte p")
    , @NamedQuery(name = "PostulacionesTransporte.findByIdPostulanteTransporte", query = "SELECT p FROM PostulacionesTransporte p WHERE p.idPostulanteTransporte = :idPostulanteTransporte")
    , @NamedQuery(name = "PostulacionesTransporte.findByValorTransporte", query = "SELECT p FROM PostulacionesTransporte p WHERE p.valorTransporte = :valorTransporte")
    , @NamedQuery(name = "PostulacionesTransporte.findByPatenteCamion", query = "SELECT p FROM PostulacionesTransporte p WHERE p.patenteCamion = :patenteCamion")
    , @NamedQuery(name = "PostulacionesTransporte.findByPatenteAcople", query = "SELECT p FROM PostulacionesTransporte p WHERE p.patenteAcople = :patenteAcople")
    , @NamedQuery(name = "PostulacionesTransporte.findByComentario", query = "SELECT p FROM PostulacionesTransporte p WHERE p.comentario = :comentario")
    , @NamedQuery(name = "PostulacionesTransporte.findByEstado", query = "SELECT p FROM PostulacionesTransporte p WHERE p.estado = :estado")})
public class PostulacionesTransporte implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    //declarar que el id se usa con una secuencia
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_TRANSPORTE")
    //declarar la secuencia
    @SequenceGenerator(name="SQ_TRANSPORTE",sequenceName="SQ_POSTULACIONES_TRANSPORTE", allocationSize=1 )
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_POSTULANTE_TRANSPORTE")
    private BigDecimal idPostulanteTransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_TRANSPORTE")
    private BigInteger valorTransporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "PATENTE_CAMION")
    private String patenteCamion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "PATENTE_ACOPLE")
    private String patenteAcople;
    @Size(max = 250)
    @Column(name = "COMENTARIO")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "SUBASTA_TRANSPORTE_FK", referencedColumnName = "ID_SUBASTA_TRANSPORTE")
    @ManyToOne(optional = false)
    private SubastaTransporte subastaTransporteFk;
    @JoinColumn(name = "USUARIO_FK", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioFk;

    public PostulacionesTransporte() {
    }

    public PostulacionesTransporte(BigDecimal idPostulanteTransporte) {
        this.idPostulanteTransporte = idPostulanteTransporte;
    }

    public PostulacionesTransporte(BigDecimal idPostulanteTransporte, BigInteger valorTransporte, String patenteCamion, String patenteAcople, String estado) {
        this.idPostulanteTransporte = idPostulanteTransporte;
        this.valorTransporte = valorTransporte;
        this.patenteCamion = patenteCamion;
        this.patenteAcople = patenteAcople;
        this.estado = estado;
    }

    public BigDecimal getIdPostulanteTransporte() {
        return idPostulanteTransporte;
    }

    public void setIdPostulanteTransporte(BigDecimal idPostulanteTransporte) {
        this.idPostulanteTransporte = idPostulanteTransporte;
    }

    public BigInteger getValorTransporte() {
        return valorTransporte;
    }

    public void setValorTransporte(BigInteger valorTransporte) {
        this.valorTransporte = valorTransporte;
    }

    public String getPatenteCamion() {
        return patenteCamion;
    }

    public void setPatenteCamion(String patenteCamion) {
        this.patenteCamion = patenteCamion;
    }

    public String getPatenteAcople() {
        return patenteAcople;
    }

    public void setPatenteAcople(String patenteAcople) {
        this.patenteAcople = patenteAcople;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SubastaTransporte getSubastaTransporteFk() {
        return subastaTransporteFk;
    }

    public void setSubastaTransporteFk(SubastaTransporte subastaTransporteFk) {
        this.subastaTransporteFk = subastaTransporteFk;
    }

    public Usuario getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(Usuario usuarioFk) {
        this.usuarioFk = usuarioFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPostulanteTransporte != null ? idPostulanteTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostulacionesTransporte)) {
            return false;
        }
        PostulacionesTransporte other = (PostulacionesTransporte) object;
        if ((this.idPostulanteTransporte == null && other.idPostulanteTransporte != null) || (this.idPostulanteTransporte != null && !this.idPostulanteTransporte.equals(other.idPostulanteTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.PostulacionesTransporte[ idPostulanteTransporte=" + idPostulanteTransporte + " ]";
    }
    
}
