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
@Table(name = "bc_ent_entidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcEntEntidad.findAll", query = "SELECT b FROM BcEntEntidad b")
    , @NamedQuery(name = "BcEntEntidad.findById", query = "SELECT b FROM BcEntEntidad b WHERE b.id = :id")
    , @NamedQuery(name = "BcEntEntidad.findByNombre", query = "SELECT b FROM BcEntEntidad b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "BcEntEntidad.findByDireccion", query = "SELECT b FROM BcEntEntidad b WHERE b.direccion = :direccion")
    , @NamedQuery(name = "BcEntEntidad.findByTelefono", query = "SELECT b FROM BcEntEntidad b WHERE b.telefono = :telefono")
    , @NamedQuery(name = "BcEntEntidad.findByNit", query = "SELECT b FROM BcEntEntidad b WHERE b.nit = :nit")
    , @NamedQuery(name = "BcEntEntidad.findByContactonombre", query = "SELECT b FROM BcEntEntidad b WHERE b.contactonombre = :contactonombre")
    , @NamedQuery(name = "BcEntEntidad.findByContactocargo", query = "SELECT b FROM BcEntEntidad b WHERE b.contactocargo = :contactocargo")
    , @NamedQuery(name = "BcEntEntidad.findByContactotelefono", query = "SELECT b FROM BcEntEntidad b WHERE b.contactotelefono = :contactotelefono")
    , @NamedQuery(name = "BcEntEntidad.findByContactoemail", query = "SELECT b FROM BcEntEntidad b WHERE b.contactoemail = :contactoemail")
    , @NamedQuery(name = "BcEntEntidad.findByLicencia", query = "SELECT b FROM BcEntEntidad b WHERE b.licencia = :licencia")
    , @NamedQuery(name = "BcEntEntidad.findByOrden", query = "SELECT b FROM BcEntEntidad b WHERE b.orden = :orden")
    , @NamedQuery(name = "BcEntEntidad.findByUsuarios", query = "SELECT b FROM BcEntEntidad b WHERE b.usuarios = :usuarios")
    , @NamedQuery(name = "BcEntEntidad.findBySesionesconcurrentes", query = "SELECT b FROM BcEntEntidad b WHERE b.sesionesconcurrentes = :sesionesconcurrentes")
    , @NamedQuery(name = "BcEntEntidad.findByTributos", query = "SELECT b FROM BcEntEntidad b WHERE b.tributos = :tributos")
    , @NamedQuery(name = "BcEntEntidad.findByFunciones", query = "SELECT b FROM BcEntEntidad b WHERE b.funciones = :funciones")
    , @NamedQuery(name = "BcEntEntidad.findByEstado", query = "SELECT b FROM BcEntEntidad b WHERE b.idpais.id = :idpais and b.iddepartamento.id = :iddepartamento")})
public class BcEntEntidad implements Serializable {

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
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nit")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "contactonombre")
    private String contactonombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "contactocargo")
    private String contactocargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "contactotelefono")
    private String contactotelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "contactoemail")
    private String contactoemail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "licencia")
    private String licencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "orden")
    private String orden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuarios")
    private int usuarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sesionesconcurrentes")
    private int sesionesconcurrentes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tributos")
    private int tributos;
    @Size(max = 50)
    @Column(name = "funciones")
    private String funciones;
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identidad")
    private List<BcUsuUsuario> bcUsuUsuarioList;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identidad")
    private List<BcEntTributos> bcEntTributosList;
    @JoinColumn(name = "iddepartamento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Departamento iddepartamento;
    @JoinColumn(name = "idmunicipio", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Municipio idmunicipio;
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pais idpais;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identidad")
    private List<BcEntParametros> bcEntParametrosList;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identidad")
    private List<BcUsuPerfiles> bcUsuPerfilesList;

    public BcEntEntidad() {
    }

    public BcEntEntidad(Integer id) {
        this.id = id;
    }

    public BcEntEntidad(Integer id, String nombre, String direccion, String telefono, String nit, String contactonombre, String contactocargo, String contactotelefono, String contactoemail, String licencia, String orden, int usuarios, int sesionesconcurrentes, int tributos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.contactonombre = contactonombre;
        this.contactocargo = contactocargo;
        this.contactotelefono = contactotelefono;
        this.contactoemail = contactoemail;
        this.licencia = licencia;
        this.orden = orden;
        this.usuarios = usuarios;
        this.sesionesconcurrentes = sesionesconcurrentes;
        this.tributos = tributos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getContactonombre() {
        return contactonombre;
    }

    public void setContactonombre(String contactonombre) {
        this.contactonombre = contactonombre;
    }

    public String getContactocargo() {
        return contactocargo;
    }

    public void setContactocargo(String contactocargo) {
        this.contactocargo = contactocargo;
    }

    public String getContactotelefono() {
        return contactotelefono;
    }

    public void setContactotelefono(String contactotelefono) {
        this.contactotelefono = contactotelefono;
    }

    public String getContactoemail() {
        return contactoemail;
    }

    public void setContactoemail(String contactoemail) {
        this.contactoemail = contactoemail;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public int getSesionesconcurrentes() {
        return sesionesconcurrentes;
    }

    public void setSesionesconcurrentes(int sesionesconcurrentes) {
        this.sesionesconcurrentes = sesionesconcurrentes;
    }

    public int getTributos() {
        return tributos;
    }

    public void setTributos(int tributos) {
        this.tributos = tributos;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
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

    @XmlTransient
    public List<BcEntTributos> getBcEntTributosList() {
        return bcEntTributosList;
    }

    public void setBcEntTributosList(List<BcEntTributos> bcEntTributosList) {
        this.bcEntTributosList = bcEntTributosList;
    }

    public Departamento getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Departamento iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public Municipio getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Municipio idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public Pais getIdpais() {
        return idpais;
    }

    public void setIdpais(Pais idpais) {
        this.idpais = idpais;
    }

    @XmlTransient
    public List<BcEntParametros> getBcEntParametrosList() {
        return bcEntParametrosList;
    }

    public void setBcEntParametrosList(List<BcEntParametros> bcEntParametrosList) {
        this.bcEntParametrosList = bcEntParametrosList;
    }

    @XmlTransient
    public List<BcUsuPerfiles> getBcUsuPerfilesList() {
        return bcUsuPerfilesList;
    }

    public void setBcUsuPerfilesList(List<BcUsuPerfiles> bcUsuPerfilesList) {
        this.bcUsuPerfilesList = bcUsuPerfilesList;
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
        if (!(object instanceof BcEntEntidad)) {
            return false;
        }
        BcEntEntidad other = (BcEntEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcEntEntidad[ id=" + id + " ]";
    }
    
}
