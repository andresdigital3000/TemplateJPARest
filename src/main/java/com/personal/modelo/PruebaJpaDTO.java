/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andres
 */

@Entity
@Table(name = "TBL_PRUEBA2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PruebaJpaDTO.findAll", query = "SELECT t FROM PruebaJpaDTO t")
    , @NamedQuery(name = "PruebaJpaDTO.findByCodPrueba", query = "SELECT t FROM PruebaJpaDTO t WHERE t.id = :id")
    , @NamedQuery(name = "PruebaJpaDTO.findByNombrePrueba", query = "SELECT t FROM PruebaJpaDTO t WHERE t.nombre = :nombre")})

public class PruebaJpaDTO implements Serializable {

    @Id
    @NotNull
    @Column(name = "CODPRUEBA")
    private Integer id;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBREPRUEBA")
    private String nombre;
    

    public PruebaJpaDTO() {

    }    

    public PruebaJpaDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }    
            
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
