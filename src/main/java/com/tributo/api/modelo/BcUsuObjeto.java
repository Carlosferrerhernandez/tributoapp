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
@Table(name = "bc_usu_objeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcUsuObjeto.findAll", query = "SELECT b FROM BcUsuObjeto b")
    , @NamedQuery(name = "BcUsuObjeto.findById", query = "SELECT b FROM BcUsuObjeto b WHERE b.id = :id")
    , @NamedQuery(name = "BcUsuObjeto.findByGrupo", query = "SELECT b FROM BcUsuObjeto b WHERE b.grupo = :grupo")
    , @NamedQuery(name = "BcUsuObjeto.findByIdgrupo", query = "SELECT b FROM BcUsuObjeto b WHERE b.idgrupo = :idgrupo")
    , @NamedQuery(name = "BcUsuObjeto.findByDescripcion", query = "SELECT b FROM BcUsuObjeto b WHERE b.descripcion = :descripcion")})
public class BcUsuObjeto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "grupo")
    private String grupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "idgrupo")
    private String idgrupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "descripcion")
    private String descripcion;

    public BcUsuObjeto() {
    }

    public BcUsuObjeto(String id) {
        this.id = id;
    }

    public BcUsuObjeto(String id, String grupo, String idgrupo, String descripcion) {
        this.id = id;
        this.grupo = grupo;
        this.idgrupo = idgrupo;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof BcUsuObjeto)) {
            return false;
        }
        BcUsuObjeto other = (BcUsuObjeto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcUsuObjeto[ id=" + id + " ]";
    }
    
}
