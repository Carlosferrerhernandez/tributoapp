/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "bc_ent_parametros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcEntParametros.findAll", query = "SELECT b FROM BcEntParametros b")
    , @NamedQuery(name = "BcEntParametros.findById", query = "SELECT b FROM BcEntParametros b WHERE b.id = :id")
    , @NamedQuery(name = "BcEntParametros.findByValor", query = "SELECT b FROM BcEntParametros b WHERE b.valor = :valor")
    , @NamedQuery(name = "BcEntParametros.findByDescripcion", query = "SELECT b FROM BcEntParametros b WHERE b.descripcion = :descripcion")
    , @NamedQuery(name = "BcEntParametros.findByProceso", query = "SELECT b FROM BcEntParametros b WHERE b.proceso = :proceso")})
public class BcEntParametros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "valor")
    private String valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 100)
    @Column(name = "proceso")
    private String proceso;
    @JoinColumn(name = "identidad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcEntEntidad identidad;

    public BcEntParametros() {
    }

    public BcEntParametros(Integer id) {
        this.id = id;
    }

    public BcEntParametros(Integer id, String valor, String descripcion) {
        this.id = id;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public BcEntEntidad getIdentidad() {
        return identidad;
    }

    public void setIdentidad(BcEntEntidad identidad) {
        this.identidad = identidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BcEntParametros)) {
            return false;
        }
        BcEntParametros other = (BcEntParametros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcEntParametros[ id=" + id + " ]";
    }
    
}
