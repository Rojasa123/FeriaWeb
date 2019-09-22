/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.EstadoVentaExterna;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface EstadoVentaExternaFacadeLocal {

    void create(EstadoVentaExterna estadoVentaExterna);

    void edit(EstadoVentaExterna estadoVentaExterna);

    void remove(EstadoVentaExterna estadoVentaExterna);

    EstadoVentaExterna find(Object id);

    List<EstadoVentaExterna> findAll();

    List<EstadoVentaExterna> findRange(int[] range);

    int count();
    
}
