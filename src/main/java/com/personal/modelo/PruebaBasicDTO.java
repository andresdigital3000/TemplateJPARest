/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.modelo;

import java.io.Serializable;


/**
 *
 * @author andres
 */


public class PruebaBasicDTO implements Serializable {


    private Integer id;
    private String nombre;
    

    public PruebaBasicDTO() {

    }    

    public PruebaBasicDTO(int id, String nombre) {
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
