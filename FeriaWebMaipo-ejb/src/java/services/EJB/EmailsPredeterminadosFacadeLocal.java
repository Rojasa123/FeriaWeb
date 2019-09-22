/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.EmailsPredeterminados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface EmailsPredeterminadosFacadeLocal {

    void create(EmailsPredeterminados emailsPredeterminados);

    void edit(EmailsPredeterminados emailsPredeterminados);

    void remove(EmailsPredeterminados emailsPredeterminados);

    EmailsPredeterminados find(Object id);

    List<EmailsPredeterminados> findAll();

    List<EmailsPredeterminados> findRange(int[] range);

    int count();
    
}
