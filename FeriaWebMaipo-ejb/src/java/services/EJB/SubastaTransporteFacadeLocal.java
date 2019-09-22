/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.SubastaTransporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface SubastaTransporteFacadeLocal {

    void create(SubastaTransporte subastaTransporte);

    void edit(SubastaTransporte subastaTransporte);

    void remove(SubastaTransporte subastaTransporte);

    SubastaTransporte find(Object id);

    List<SubastaTransporte> findAll();

    List<SubastaTransporte> findRange(int[] range);

    int count();
    
}
