/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "bc_ent_tributos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcEntTributos.findAll", query = "SELECT b FROM BcEntTributos b")
    , @NamedQuery(name = "BcEntTributos.findById", query = "SELECT b FROM BcEntTributos b WHERE b.id = :id")
    , @NamedQuery(name = "BcEntTributos.findByTipoperiodo", query = "SELECT b FROM BcEntTributos b WHERE b.tipoperiodo = :tipoperiodo")
    , @NamedQuery(name = "BcEntTributos.findByFechacreacion", query = "SELECT b FROM BcEntTributos b WHERE b.fechacreacion = :fechacreacion")
    , @NamedQuery(name = "BcEntTributos.findByIdusuario", query = "SELECT b FROM BcEntTributos b WHERE b.idusuario = :idusuario")
    , @NamedQuery(name = "BcEntTributos.findByEstado", query = "SELECT b FROM BcEntTributos b WHERE b.identidad.id = :identidad and b.estado='A'")})
public class BcEntTributos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoperiodo")
    private int tipoperiodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "parametro_tributo")
    private String parametroTributo;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    
    
    
    @JoinColumn(name = "identidad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcEntEntidad identidad;
    
    @JoinColumn(name = "idtributo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcTriTributo idtributo;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identtributo")
    private Collection<FrUsuTributo> frUsuTributoCollection;
    
    
    
    public BcEntTributos() {
    }

    public BcEntTributos(Integer id) {
        this.id = id;
    }

    public BcEntTributos(Integer id, int tipoperiodo, Date fechacreacion, int idusuario, String estado) {
        this.id = id;
        this.tipoperiodo = tipoperiodo;
        this.fechacreacion = fechacreacion;
        this.idusuario = idusuario;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTipoperiodo() {
        return tipoperiodo;
    }

    public void setTipoperiodo(int tipoperiodo) {
        this.tipoperiodo = tipoperiodo;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BcEntEntidad getIdentidad() {
        return identidad;
    }

    public void setIdentidad(BcEntEntidad identidad) {
        this.identidad = identidad;
    }

    public BcTriTributo getIdtributo() {
        return idtributo;
    }

    public void setIdtributo(BcTriTributo idtributo) {
        this.idtributo = idtributo;
    }

    public String getParametroTributo() {
        return parametroTributo;
    }

    public void setParametroTributo(String parametroTributo) {
        this.parametroTributo = parametroTributo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    
   
    
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @XmlTransient
    public Collection<FrUsuTributo> getFrUsuTributoCollection() {
        return frUsuTributoCollection;
    }

    public void setFrUsuTributoCollection(Collection<FrUsuTributo> frUsuTributoCollection) {
        this.frUsuTributoCollection = frUsuTributoCollection;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BcEntTributos)) {
            return false;
        }
        BcEntTributos other = (BcEntTributos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcEntTributos[ id=" + id + " ]";
    }
    
}
