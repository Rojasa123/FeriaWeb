/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.EstadoVentaExterna;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eroja
 */
@Stateless
public class EstadoVentaExternaFacade extends AbstractFacade<EstadoVentaExterna> implements EstadoVentaExternaFacadeLocal {

    @PersistenceContext(unitName = "FeriaWebMaipo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoVentaExternaFacade() {
        super(EstadoVentaExterna.class);
    }
    
}
