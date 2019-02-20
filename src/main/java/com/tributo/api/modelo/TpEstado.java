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
@Table(name = "tp_estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpEstado.findAll", query = "SELECT t FROM TpEstado t")
    , @NamedQuery(name = "TpEstado.findById", query = "SELECT t FROM TpEstado t WHERE t.id = :id")
    , @NamedQuery(name = "TpEstado.findByValor", query = "SELECT t FROM TpEstado t WHERE t.valor = :valor")
    , @NamedQuery(name = "TpEstado.findByDescripcion", query = "SELECT t FROM TpEstado t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TpEstado.findByColor", query = "SELECT t FROM TpEstado t WHERE t.color = :color")
    , @NamedQuery(name = "TpEstado.findByOrden", query = "SELECT t FROM TpEstado t WHERE t.orden = :orden")
    , @NamedQuery(name = "TpEstado.findByGrupo", query = "SELECT t FROM TpEstado t WHERE t.grupo = :grupo")
    , @NamedQuery(name = "TpEstado.findBySubgrupo", query = "SELECT t FROM TpEstado t WHERE t.subgrupo = :subgrupo")
    , @NamedQuery(name = "TpEstado.findByEstado", query = "SELECT t FROM TpEstado t WHERE t.estado = :estado")
    , @NamedQuery(name = "TpEstado.findByDetalle", query = "SELECT t FROM TpEstado t WHERE t.detalle = :detalle")})
public class TpEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "valor")
    private String valor;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 50)
    @Column(name = "color")
    private String color;
    @Column(name = "orden")
    private Integer orden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "grupo")
    private String grupo;
    @Size(max = 255)
    @Column(name = "subgrupo")
    private String subgrupo;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @Size(max = 255)
    @Column(name = "detalle")
    private String detalle;

    public TpEstado() {
    }

    public TpEstado(Integer id) {
        this.id = id;
    }

    public TpEstado(Integer id, String valor, String grupo) {
        this.id = id;
        this.valor = valor;
        this.grupo = grupo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
        if (!(object instanceof TpEstado)) {
            return false;
        }
        TpEstado other = (TpEstado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.TpEstado[ id=" + id + " ]";
    }
    
}
