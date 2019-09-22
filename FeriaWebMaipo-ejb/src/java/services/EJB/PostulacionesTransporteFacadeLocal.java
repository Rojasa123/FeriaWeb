/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.PostulacionesTransporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface PostulacionesTransporteFacadeLocal {

    void create(PostulacionesTransporte postulacionesTransporte);

    void edit(PostulacionesTransporte postulacionesTransporte);

    void remove(PostulacionesTransporte postulacionesTransporte);

    PostulacionesTransporte find(Object id);

    List<PostulacionesTransporte> findAll();

    List<PostulacionesTransporte> findRange(int[] range);

    int count();
    
}
