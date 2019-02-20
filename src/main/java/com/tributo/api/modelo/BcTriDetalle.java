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
@Table(name = "bc_tri_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcTriDetalle.findAll", query = "SELECT b FROM BcTriDetalle b")
    , @NamedQuery(name = "BcTriDetalle.findById", query = "SELECT b FROM BcTriDetalle b WHERE b.id = :id")
    , @NamedQuery(name = "BcTriDetalle.findByNombre", query = "SELECT b FROM BcTriDetalle b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "BcTriDetalle.findByParam1", query = "SELECT b FROM BcTriDetalle b WHERE b.param1 = :param1")
    , @NamedQuery(name = "BcTriDetalle.findByParam2", query = "SELECT b FROM BcTriDetalle b WHERE b.param2 = :param2")})
public class BcTriDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "param1")
    private String param1;
    @Size(max = 50)
    @Column(name = "param2")
    private String param2;
    @JoinColumn(name = "idtributo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcTriTributo idtributo;

    public BcTriDetalle() {
    }

    public BcTriDetalle(Integer id) {
        this.id = id;
    }

    public BcTriDetalle(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public BcTriTributo getIdtributo() {
        return idtributo;
    }

    public void setIdtributo(BcTriTributo idtributo) {
        this.idtributo = idtributo;
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
        if (!(object instanceof BcTriDetalle)) {
            return false;
        }
        BcTriDetalle other = (BcTriDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcTriDetalle[ id=" + id + " ]";
    }
    
}
