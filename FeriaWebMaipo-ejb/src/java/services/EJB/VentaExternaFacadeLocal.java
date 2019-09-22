/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.VentaExterna;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface VentaExternaFacadeLocal {

    void create(VentaExterna ventaExterna);

    void edit(VentaExterna ventaExterna);

    void remove(VentaExterna ventaExterna);

    VentaExterna find(Object id);

    List<VentaExterna> findAll();

    List<VentaExterna> findRange(int[] range);

    int count();
    
}
