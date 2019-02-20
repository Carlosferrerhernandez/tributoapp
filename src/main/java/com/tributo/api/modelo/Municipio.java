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
@Table(name = "municipio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municipio.findAll", query = "SELECT m FROM Municipio m")
    , @NamedQuery(name = "Municipio.findById", query = "SELECT m FROM Municipio m WHERE m.id = :id")
    , @NamedQuery(name = "Municipio.findByCodigociudad", query = "SELECT m FROM Municipio m WHERE m.codigociudad = :codigociudad")
    , @NamedQuery(name = "Municipio.findByNombre", query = "SELECT m FROM Municipio m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Municipio.findByNombrePais", query = "SELECT m FROM Municipio m WHERE  m.iddepartamento.nombre= :dpto ")    
    , @NamedQuery(name = "Municipio.findByCodigoref", query = "SELECT m FROM Municipio m WHERE m.codigoref = :codigoref")})
public class Municipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "codigociudad")
    private String codigociudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigoref")
    private String codigoref;
    
    @JsonIgnore
    @OneToMany(mappedBy = "idmunicipio")
    private List<FrUsuUsuario> frUsuUsuarioList;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idciudad")
    private List<BcUsuUsuario> bcUsuUsuarioList;
    
    
    @JoinColumn(name = "iddepartamento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Departamento iddepartamento;
    
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pais idpais;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmunicipio")
    private List<BcEntEntidad> bcEntEntidadList;

    public Municipio() {
    }

    public Municipio(Integer id) {
        this.id = id;
    }

    public Municipio(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigociudad() {
        return codigociudad;
    }

    public void setCodigociudad(String codigociudad) {
        this.codigociudad = codigociudad;
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
    public List<FrUsuUsuario> getFrUsuUsuarioList() {
        return frUsuUsuarioList;
    }

    public void setFrUsuUsuarioList(List<FrUsuUsuario> frUsuUsuarioList) {
        this.frUsuUsuarioList = frUsuUsuarioList;
    }

    @XmlTransient
    public List<BcUsuUsuario> getBcUsuUsuarioList() {
        return bcUsuUsuarioList;
    }

    public void setBcUsuUsuarioList(List<BcUsuUsuario> bcUsuUsuarioList) {
        this.bcUsuUsuarioList = bcUsuUsuarioList;
    }

    public Departamento getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Departamento iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public Pais getIdpais() {
        return idpais;
    }

    public void setIdpais(Pais idpais) {
        this.idpais = idpais;
    }

    @XmlTransient
    public List<BcEntEntidad> getBcEntEntidadList() {
        return bcEntEntidadList;
    }

    public void setBcEntEntidadList(List<BcEntEntidad> bcEntEntidadList) {
        this.bcEntEntidadList = bcEntEntidadList;
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
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.Municipio[ id=" + id + " ]";
    }
    
}
