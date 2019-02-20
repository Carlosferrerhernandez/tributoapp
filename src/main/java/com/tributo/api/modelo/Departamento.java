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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")
    , @NamedQuery(name = "Departamento.findById", query = "SELECT d FROM Departamento d WHERE d.id = :id")
    , @NamedQuery(name = "Departamento.findByNombre", query = "SELECT d FROM Departamento d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Departamento.findByCodigoref", query = "SELECT d FROM Departamento d WHERE d.codigoref = :codigoref")})
public class Departamento implements Serializable {

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
    @Size(max = 100)
    @Column(name = "codigoref")
    private String codigoref;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddepartamento")
    private List<Municipio> municipioList;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddepartamento")
    private List<BcEntEntidad> bcEntEntidadList;
    
    
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pais idpais;

    public Departamento() {
    }

    public Departamento(Integer id) {
        this.id = id;
    }

    public Departamento(Integer id, String nombre) {
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

    public String getCodigoref() {
        return codigoref;
    }

    public void setCodigoref(String codigoref) {
        this.codigoref = codigoref;
    }

    @XmlTransient
    public List<Municipio> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<Municipio> municipioList) {
        this.municipioList = municipioList;
    }

    @XmlTransient
    public List<BcEntEntidad> getBcEntEntidadList() {
        return bcEntEntidadList;
    }

    public void setBcEntEntidadList(List<BcEntEntidad> bcEntEntidadList) {
        this.bcEntEntidadList = bcEntEntidadList;
    }

    public Pais getIdpais() {
        return idpais;
    }

    public void setIdpais(Pais idpais) {
        this.idpais = idpais;
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
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.Departamento[ id=" + id + " ]";
    }
    
}
