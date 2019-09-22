/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.SolicitudVentaExterna;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import services.EJB.SolicitudVentaExternaFacadeLocal;

/**
 *
 * @author Patricio
 */
@Named(value = "solicitudVentaExternaController")
@ViewScoped
public class SolicitudVentaExternaController implements Serializable {

    @EJB
    private SolicitudVentaExternaFacadeLocal solicitudveEJB;
    private SolicitudVentaExterna solicitudve;

    public SolicitudVentaExterna getSolicitudve() {
        return solicitudve;
    }

    public void setSolicitudve(SolicitudVentaExterna solicitudve) {
        this.solicitudve = solicitudve;
    }

    
        public void registrarSolicitud(){
            try {
solicitudveEJB.create(solicitudve);
        } catch (Exception e) {
        }
    }
}
