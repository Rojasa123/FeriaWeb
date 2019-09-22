/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.PostulacionesVentaExterna;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface PostulacionesVentaExternaFacadeLocal {

    void create(PostulacionesVentaExterna postulacionesVentaExterna);

    void edit(PostulacionesVentaExterna postulacionesVentaExterna);

    void remove(PostulacionesVentaExterna postulacionesVentaExterna);

    PostulacionesVentaExterna find(Object id);

    List<PostulacionesVentaExterna> findAll();

    List<PostulacionesVentaExterna> findRange(int[] range);

    int count();
    
}
