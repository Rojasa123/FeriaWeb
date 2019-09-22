/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.CompraLocal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface CompraLocalFacadeLocal {

    void create(CompraLocal compraLocal);

    void edit(CompraLocal compraLocal);

    void remove(CompraLocal compraLocal);

    CompraLocal find(Object id);

    List<CompraLocal> findAll();

    List<CompraLocal> findRange(int[] range);

    int count();
    
}
