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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "fr_usu_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FrUsuLog.findAll", query = "SELECT f FROM FrUsuLog f")
    , @NamedQuery(name = "FrUsuLog.findById", query = "SELECT f FROM FrUsuLog f WHERE f.id = :id")
    , @NamedQuery(name = "FrUsuLog.findBySesion", query = "SELECT f FROM FrUsuLog f WHERE f.sesion = :sesion")
    , @NamedQuery(name = "FrUsuLog.findByFechahora", query = "SELECT f FROM FrUsuLog f WHERE f.fechahora = :fechahora")
    , @NamedQuery(name = "FrUsuLog.findByIp", query = "SELECT f FROM FrUsuLog f WHERE f.ip = :ip")
    , @NamedQuery(name = "FrUsuLog.findByNavegador", query = "SELECT f FROM FrUsuLog f WHERE f.navegador = :navegador")
    , @NamedQuery(name = "FrUsuLog.findBySistemaoperativo", query = "SELECT f FROM FrUsuLog f WHERE f.sistemaoperativo = :sistemaoperativo")
    , @NamedQuery(name = "FrUsuLog.findByDispositivo", query = "SELECT f FROM FrUsuLog f WHERE f.dispositivo = :dispositivo")})
public class FrUsuLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "sesion")
    private String sesion;
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
    @Size(max = 255)
    @Column(name = "navegador")
    private String navegador;
    @Size(max = 255)
    @Column(name = "sistemaoperativo")
    private String sistemaoperativo;
    @Size(max = 100)
    @Column(name = "dispositivo")
    private String dispositivo;
    @Lob
    @Size(max = 65535)
    @Column(name = "actividad")
    private String actividad;
    @JoinColumn(name = "idusuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private FrUsuUsuario idusuario;

    public FrUsuLog() {
    }

    public FrUsuLog(Integer id) {
        this.id = id;
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

    public FrUsuUsuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(FrUsuUsuario idusuario) {
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
        if (!(object instanceof FrUsuLog)) {
            return false;
        }
        FrUsuLog other = (FrUsuLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.FrUsuLog[ id=" + id + " ]";
    }
    
}
