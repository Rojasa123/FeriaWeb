/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "EMAILS_PREDETERMINADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmailsPredeterminados.findAll", query = "SELECT e FROM EmailsPredeterminados e")
    , @NamedQuery(name = "EmailsPredeterminados.findByIdEmail", query = "SELECT e FROM EmailsPredeterminados e WHERE e.idEmail = :idEmail")
    , @NamedQuery(name = "EmailsPredeterminados.findByMensajeEmail", query = "SELECT e FROM EmailsPredeterminados e WHERE e.mensajeEmail = :mensajeEmail")
    , @NamedQuery(name = "EmailsPredeterminados.findByNombreEmail", query = "SELECT e FROM EmailsPredeterminados e WHERE e.nombreEmail = :nombreEmail")})
public class EmailsPredeterminados implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMAIL")
    private BigDecimal idEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "MENSAJE_EMAIL")
    private String mensajeEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_EMAIL")
    private String nombreEmail;

    public EmailsPredeterminados() {
    }

    public EmailsPredeterminados(BigDecimal idEmail) {
        this.idEmail = idEmail;
    }

    public EmailsPredeterminados(BigDecimal idEmail, String mensajeEmail, String nombreEmail) {
        this.idEmail = idEmail;
        this.mensajeEmail = mensajeEmail;
        this.nombreEmail = nombreEmail;
    }

    public BigDecimal getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(BigDecimal idEmail) {
        this.idEmail = idEmail;
    }

    public String getMensajeEmail() {
        return mensajeEmail;
    }

    public void setMensajeEmail(String mensajeEmail) {
        this.mensajeEmail = mensajeEmail;
    }

    public String getNombreEmail() {
        return nombreEmail;
    }

    public void setNombreEmail(String nombreEmail) {
        this.nombreEmail = nombreEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmail != null ? idEmail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailsPredeterminados)) {
            return false;
        }
        EmailsPredeterminados other = (EmailsPredeterminados) object;
        if ((this.idEmail == null && other.idEmail != null) || (this.idEmail != null && !this.idEmail.equals(other.idEmail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.EmailsPredeterminados[ idEmail=" + idEmail + " ]";
    }
    
}
