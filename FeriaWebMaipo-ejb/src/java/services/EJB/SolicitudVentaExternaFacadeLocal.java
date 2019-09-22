/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.SolicitudVentaExterna;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface SolicitudVentaExternaFacadeLocal {

    void create(SolicitudVentaExterna solicitudVentaExterna);

    void edit(SolicitudVentaExterna solicitudVentaExterna);

    void remove(SolicitudVentaExterna solicitudVentaExterna);

    SolicitudVentaExterna find(Object id);

    List<SolicitudVentaExterna> findAll();

    List<SolicitudVentaExterna> findRange(int[] range);

    int count();
    
}
