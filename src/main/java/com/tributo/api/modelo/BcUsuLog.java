/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "bc_usu_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcUsuLog.findAll", query = "SELECT b FROM BcUsuLog b")
    , @NamedQuery(name = "BcUsuLog.findById", query = "SELECT b FROM BcUsuLog b WHERE b.id = :id")
    , @NamedQuery(name = "BcUsuLog.findBySesion", query = "SELECT b FROM BcUsuLog b WHERE b.sesion = :sesion")
    , @NamedQuery(name = "BcUsuLog.findByFechahora", query = "SELECT b FROM BcUsuLog b WHERE b.fechahora = :fechahora")
    , @NamedQuery(name = "BcUsuLog.findByIp", query = "SELECT b FROM BcUsuLog b WHERE b.ip = :ip")
    , @NamedQuery(name = "BcUsuLog.findByNavegador", query = "SELECT b FROM BcUsuLog b WHERE b.navegador = :navegador")
    , @NamedQuery(name = "BcUsuLog.findBySistemaoperativo", query = "SELECT b FROM BcUsuLog b WHERE b.sistemaoperativo = :sistemaoperativo")
    , @NamedQuery(name = "BcUsuLog.findByDispositivo", query = "SELECT b FROM BcUsuLog b WHERE b.dispositivo = :dispositivo")
    , @NamedQuery(name = "BcUsuLog.findByActividad", query = "SELECT b FROM BcUsuLog b WHERE b.actividad = :actividad")})
public class BcUsuLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "sesion")
    private String sesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechahora;
    @Size(max = 100)
    @Column(name = "ip")
    private String ip;
    @Lob
    @Size(max = 65535)
    @Column(name = "geoposicion")
    private String geoposicion;
    @Size(max = 200)
    @Column(name = "navegador")
    private String navegador;
    @Size(max = 200)
    @Column(name = "sistemaoperativo")
    private String sistemaoperativo;
    @Size(max = 100)
    @Column(name = "dispositivo")
    private String dispositivo;
    @Size(max = 255)
    @Column(name = "actividad")
    private String actividad;
    
    @JoinColumn(name = "idusuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcUsuUsuario idusuario;

    public BcUsuLog() {
    }

    public BcUsuLog(Integer id) {
        this.id = id;
    }

    public BcUsuLog(Integer id, String sesion, Date fechahora) {
        this.id = id;
        this.sesion = sesion;
        this.fechahora = fechahora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGeoposicion() {
        return geoposicion;
    }

    public void setGeoposicion(String geoposicion) {
        this.geoposicion = geoposicion;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getSistemaoperativo() {
        return sistemaoperativo;
    }

    public void setSistemaoperativo(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public BcUsuUsuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(BcUsuUsuario idusuario) {
        this.idusuario = idusuario;
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
        if (!(object instanceof BcUsuLog)) {
            return false;
        }
        BcUsuLog other = (BcUsuLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcUsuLog[ id=" + id + " ]";
    }
    
}
