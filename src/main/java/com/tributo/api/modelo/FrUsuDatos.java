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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "fr_usu_datos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FrUsuDatos.findAll", query = "SELECT f FROM FrUsuDatos f")
    , @NamedQuery(name = "FrUsuDatos.findById", query = "SELECT f FROM FrUsuDatos f WHERE f.id = :id")
    , @NamedQuery(name = "FrUsuDatos.findByTipoactividad", query = "SELECT f FROM FrUsuDatos f WHERE f.tipoactividad = :tipoactividad")
    , @NamedQuery(name = "FrUsuDatos.findByCodigociu", query = "SELECT f FROM FrUsuDatos f WHERE f.codigociu = :codigociu")
    , @NamedQuery(name = "FrUsuDatos.findByNombreestablecimiento", query = "SELECT f FROM FrUsuDatos f WHERE f.nombreestablecimiento = :nombreestablecimiento")
    , @NamedQuery(name = "FrUsuDatos.findByNombrerepresentante", query = "SELECT f FROM FrUsuDatos f WHERE f.nombrerepresentante = :nombrerepresentante")
    , @NamedQuery(name = "FrUsuDatos.findByCedularepresentante", query = "SELECT f FROM FrUsuDatos f WHERE f.cedularepresentante = :cedularepresentante")
    , @NamedQuery(name = "FrUsuDatos.findByCorreorepresentante", query = "SELECT f FROM FrUsuDatos f WHERE f.correorepresentante = :correorepresentante")
    , @NamedQuery(name = "FrUsuDatos.findByNombrecontador", query = "SELECT f FROM FrUsuDatos f WHERE f.nombrecontador = :nombrecontador")
    , @NamedQuery(name = "FrUsuDatos.findByCedulacontador", query = "SELECT f FROM FrUsuDatos f WHERE f.cedulacontador = :cedulacontador")
    , @NamedQuery(name = "FrUsuDatos.findByCorreocontador", query = "SELECT f FROM FrUsuDatos f WHERE f.correocontador = :correocontador")})
public class FrUsuDatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "tipoactividad")
    private String tipoactividad;
    @Size(max = 10)
    @Column(name = "codigociu")
    private String codigociu;
    @Size(max = 255)
    @Column(name = "nombreestablecimiento")
    private String nombreestablecimiento;
    @Lob
    @Size(max = 65535)
    @Column(name = "personasautorizadas")
    private String personasautorizadas;
    @Lob
    @Size(max = 65535)
    @Column(name = "tipoobligaciones")
    private String tipoobligaciones;
    @Size(max = 255)
    @Column(name = "nombrerepresentante")
    private String nombrerepresentante;
    @Size(max = 255)
    @Column(name = "cedularepresentante")
    private String cedularepresentante;
    @Size(max = 255)
    @Column(name = "correorepresentante")
    private String correorepresentante;
    @Size(max = 255)
    @Column(name = "nombrecontador")
    private String nombrecontador;
    @Size(max = 255)
    @Column(name = "cedulacontador")
    private String cedulacontador;
    @Size(max = 255)
    @Column(name = "correocontador")
    private String correocontador;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "experienciasector")
    private String experienciasector;
    
    @JoinColumn(name = "idusuario", referencedColumnName = "id")
    @ManyToOne
    private FrUsuUsuario idusuario;

    public FrUsuDatos() {
    }

    public FrUsuDatos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoactividad() {
        return tipoactividad;
    }

    public void setTipoactividad(String tipoactividad) {
        this.tipoactividad = tipoactividad;
    }

    public String getCodigociu() {
        return codigociu;
    }

    public void setCodigociu(String codigociu) {
        this.codigociu = codigociu;
    }

    public String getNombreestablecimiento() {
        return nombreestablecimiento;
    }

    public void setNombreestablecimiento(String nombreestablecimiento) {
        this.nombreestablecimiento = nombreestablecimiento;
    }

    public String getPersonasautorizadas() {
        return personasautorizadas;
    }

    public void setPersonasautorizadas(String personasautorizadas) {
        this.personasautorizadas = personasautorizadas;
    }

    public String getTipoobligaciones() {
        return tipoobligaciones;
    }

    public void setTipoobligaciones(String tipoobligaciones) {
        this.tipoobligaciones = tipoobligaciones;
    }

    public String getNombrerepresentante() {
        return nombrerepresentante;
    }

    public void setNombrerepresentante(String nombrerepresentante) {
        this.nombrerepresentante = nombrerepresentante;
    }

    public String getCedularepresentante() {
        return cedularepresentante;
    }

    public void setCedularepresentante(String cedularepresentante) {
        this.cedularepresentante = cedularepresentante;
    }

    public String getCorreorepresentante() {
        return correorepresentante;
    }

    public void setCorreorepresentante(String correorepresentante) {
        this.correorepresentante = correorepresentante;
    }

    public String getNombrecontador() {
        return nombrecontador;
    }

    public void setNombrecontador(String nombrecontador) {
        this.nombrecontador = nombrecontador;
    }

    public String getCedulacontador() {
        return cedulacontador;
    }

    public void setCedulacontador(String cedulacontador) {
        this.cedulacontador = cedulacontador;
    }

    public String getCorreocontador() {
        return correocontador;
    }

    public void setCorreocontador(String correocontador) {
        this.correocontador = correocontador;
    }

    public String getExperienciasector() {
        return experienciasector;
    }

    public void setExperienciasector(String experienciasector) {
        this.experienciasector = experienciasector;
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
        if (!(object instanceof FrUsuDatos)) {
            return false;
        }
        FrUsuDatos other = (FrUsuDatos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.FrUsuDatos[ id=" + id + " ]";
    }
    
}
