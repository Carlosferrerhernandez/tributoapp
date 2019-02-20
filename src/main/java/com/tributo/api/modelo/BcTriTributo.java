/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "bc_tri_tributo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcTriTributo.findAll", query = "SELECT b FROM BcTriTributo b")
    , @NamedQuery(name = "BcTriTributo.findById", query = "SELECT b FROM BcTriTributo b WHERE b.id = :id")
    , @NamedQuery(name = "BcTriTributo.findByNombre", query = "SELECT b FROM BcTriTributo b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "BcTriTributo.findByTipoperiodo", query = "SELECT b FROM BcTriTributo b WHERE b.tipoperiodo = :tipoperiodo")
    , @NamedQuery(name = "BcTriTributo.findByReporte", query = "SELECT b FROM BcTriTributo b WHERE b.reporte = :reporte")
    , @NamedQuery(name = "BcTriTributo.findByEstado", query = "SELECT b FROM BcTriTributo b WHERE b.estado = :estado")})
public class BcTriTributo implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoperiodo")
    private int tipoperiodo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "esquema")
    private String esquema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "reporte")
    private String reporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtributo")
    private List<BcTriDetalle> bcTriDetalleList;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtributo")
    private List<BcEntTributos> bcEntTributosList;
    
   
    public BcTriTributo() {
    }

    public BcTriTributo(Integer id) {
        this.id = id;
    }

    public BcTriTributo(Integer id, String nombre, int tipoperiodo, String esquema, String reporte, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.tipoperiodo = tipoperiodo;
        this.esquema = esquema;
        this.reporte = reporte;
        this.estado = estado;
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

    public int getTipoperiodo() {
        return tipoperiodo;
    }

    public void setTipoperiodo(int tipoperiodo) {
        this.tipoperiodo = tipoperiodo;
    }

    public String getEsquema() {
        return esquema;
    }

    public void setEsquema(String esquema) {
        this.esquema = esquema;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<BcTriDetalle> getBcTriDetalleList() {
        return bcTriDetalleList;
    }

    public void setBcTriDetalleList(List<BcTriDetalle> bcTriDetalleList) {
        this.bcTriDetalleList = bcTriDetalleList;
    }

    @XmlTransient
    public List<BcEntTributos> getBcEntTributosList() {
        return bcEntTributosList;
    }

    public void setBcEntTributosList(List<BcEntTributos> bcEntTributosList) {
        this.bcEntTributosList = bcEntTributosList;
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
        if (!(object instanceof BcTriTributo)) {
            return false;
        }
        BcTriTributo other = (BcTriTributo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcTriTributo[ id=" + id + " ]";
    }
    
}
