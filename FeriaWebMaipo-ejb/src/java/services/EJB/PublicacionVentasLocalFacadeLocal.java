/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.PublicacionVentasLocal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface PublicacionVentasLocalFacadeLocal {

    void create(PublicacionVentasLocal publicacionVentasLocal);

    void edit(PublicacionVentasLocal publicacionVentasLocal);

    void remove(PublicacionVentasLocal publicacionVentasLocal);

    PublicacionVentasLocal find(Object id);

    List<PublicacionVentasLocal> findAll();

    List<PublicacionVentasLocal> findRange(int[] range);

    int count();
    
}
