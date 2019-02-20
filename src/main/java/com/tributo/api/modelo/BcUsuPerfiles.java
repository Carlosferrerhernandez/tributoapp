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
@Table(name = "bc_usu_perfiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcUsuPerfiles.findAll", query = "SELECT b FROM BcUsuPerfiles b")
    , @NamedQuery(name = "BcUsuPerfiles.findById", query = "SELECT b FROM BcUsuPerfiles b WHERE b.id = :id")
    , @NamedQuery(name = "BcUsuPerfiles.findByPerfil", query = "SELECT b FROM BcUsuPerfiles b WHERE b.perfil = :perfil")
    , @NamedQuery(name = "BcUsuPerfiles.findByDescripcion", query = "SELECT b FROM BcUsuPerfiles b WHERE b.descripcion = :descripcion")
    , @NamedQuery(name = "BcUsuPerfiles.findByOpciones", query = "SELECT b FROM BcUsuPerfiles b WHERE b.opciones = :opciones")
    , @NamedQuery(name = "BcUsuPerfiles.findByEstado", query = "SELECT b FROM BcUsuPerfiles b WHERE b.estado = :estado")})
public class BcUsuPerfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "perfil")
    private String perfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "opciones")
    private String opciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "estado")
    private String estado;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperfil")
    private List<BcUsuUsuario> bcUsuUsuarioList;
    @JoinColumn(name = "identidad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcEntEntidad identidad;

    public BcUsuPerfiles() {
    }

    public BcUsuPerfiles(Integer id) {
        this.id = id;
    }

    public BcUsuPerfiles(Integer id, String perfil, String descripcion, String opciones, String estado) {
        this.id = id;
        this.perfil = perfil;
        this.descripcion = descripcion;
        this.opciones = opciones;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<BcUsuUsuario> getBcUsuUsuarioList() {
        return bcUsuUsuarioList;
    }

    public void setBcUsuUsuarioList(List<BcUsuUsuario> bcUsuUsuarioList) {
        this.bcUsuUsuarioList = bcUsuUsuarioList;
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
        if (!(object instanceof BcUsuPerfiles)) {
            return false;
        }
        BcUsuPerfiles other = (BcUsuPerfiles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcUsuPerfiles[ id=" + id + " ]";
    }
    
}
