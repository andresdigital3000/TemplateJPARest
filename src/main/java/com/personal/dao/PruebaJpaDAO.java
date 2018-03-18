/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.dao;

import com.personal.modelo.PruebaJpaDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * We define one subinterface for each entity type we want to persist, adding any entity specific methods we want. For example, if we'd like 
 * to be able to query all orders that have been added since a certain date, we can add such a method:
 * @author andres
 */

@Stateless
public class PruebaJpaDAO extends AbstractJpaDAO<PruebaJpaDTO>{
    @PersistenceContext(unitName = "com.personal_TemplateRESTJPA_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public PruebaJpaDAO() {
        super(PruebaJpaDTO.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List<PruebaJpaDTO> findAll() {
        return super.findAll();
        /*javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(PruebaJpaDTO.class));
        return em.createQuery(cq).getResultList();*/
    }
}

