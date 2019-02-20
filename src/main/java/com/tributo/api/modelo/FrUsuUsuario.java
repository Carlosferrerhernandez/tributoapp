/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
@Table(name = "fr_usu_usuario")
public class FrUsuUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
  
    @Size(min = 1, max = 50)
    @Column(name = "tipoidentificacion")
    private String tipoidentificacion;
    @Basic(optional = false)
   
    @Size(min = 1, max = 100)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)

    @Size(min = 1, max = 100)
    @Column(name = "primernombre")
    private String primernombre;
    @Size(max = 100)
    @Column(name = "segundonombre")
    private String segundonombre;
    @Basic(optional = false)
   
    @Size(min = 1, max = 100)
    @Column(name = "primerapellido")
    private String primerapellido;
    @Size(max = 100)
    @Column(name = "segundoapellido")
    private String segundoapellido;
    @Size(max = 255)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 50)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
  
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Size(max = 255)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 100)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "celular")
    private String celular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)

    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
  
    @Size(min = 1, max = 100)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)

    @Size(min = 1, max = 100)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    
    @Size(min = 1, max = 2)
    @Column(name = "tipousuario")
    private String tipousuario;
    @Basic(optional = false)
    
    @Column(name = "esadministrador")
    private boolean esadministrador;
    @Basic(optional = false)
   
    @Size(min = 1, max = 255)
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @Column(name = "ultimaconexion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaconexion;
    @Size(max = 255)
    @Column(name = "ultimageoposicion")
    private String ultimageoposicion;
    @Size(max = 100)
    @Column(name = "ultimaip")
    private String ultimaip;
    @Size(max = 255)
    @Column(name = "ultimoso")
    private String ultimoso;
    @Size(max = 255)
    @Column(name = "ultimonavegador")
    private String ultimonavegador;
    @Size(max = 255)
    @Column(name = "ultimasesion")
    private String ultimasesion;
    @Basic(optional = false)
    
    @Column(name = "accesomultiple")
    private boolean accesomultiple;
    @Size(max = 255)
    @Column(name = "codigoreinicio")
    private String codigoreinicio;
    @Column(name = "fechahorareinicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechahorareinicio;
    @Basic(optional = false)
   
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Size(max = 4)
    @Column(name = "tipocontribuyente")
    private String tipocontribuyente;
    @Size(max = 4)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idmunicipio", referencedColumnName = "id")
    @ManyToOne
    private Municipio idmunicipio;
    
    @JsonIgnore 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idusuario")
    private List<FrUsuLog> frUsuLogList;
    
    @JsonIgnore
    @OneToMany(mappedBy = "idusuario")
    private List<FrUsuDatos> frUsuDatosList;
    
    
    @Size(max = 255)
    @Column(name = "url_imagen")
    private String urlimagen;

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }
    
    
    

    public FrUsuUsuario() {
    }

    public FrUsuUsuario(Integer id) {
        this.id = id;
    }

    public FrUsuUsuario(Integer id, String tipoidentificacion, String identificacion, String primernombre, String primerapellido, Date fechanacimiento, String email, String usuario, String clave, String tipousuario, boolean esadministrador, String nombrecompleto, boolean accesomultiple, Date fechacreacion) {
        this.id = id;
        this.tipoidentificacion = tipoidentificacion;
        this.identificacion = identificacion;
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.fechanacimiento = fechanacimiento;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.tipousuario = tipousuario;
        this.esadministrador = esadministrador;
        this.nombrecompleto = nombrecompleto;
        this.accesomultiple = accesomultiple;
        this.fechacreacion = fechacreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public boolean getEsadministrador() {
        return esadministrador;
    }

    public void setEsadministrador(boolean esadministrador) {
        this.esadministrador = esadministrador;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Date getUltimaconexion() {
        return ultimaconexion;
    }

    public void setUltimaconexion(Date ultimaconexion) {
        this.ultimaconexion = ultimaconexion;
    }

    public String getUltimageoposicion() {
        return ultimageoposicion;
    }

    public void setUltimageoposicion(String ultimageoposicion) {
        this.ultimageoposicion = ultimageoposicion;
    }

    public String getUltimaip() {
        return ultimaip;
    }

    public void setUltimaip(String ultimaip) {
        this.ultimaip = ultimaip;
    }

    public String getUltimoso() {
        return ultimoso;
    }

    public void setUltimoso(String ultimoso) {
        this.ultimoso = ultimoso;
    }

    public String getUltimonavegador() {
        return ultimonavegador;
    }

    public void setUltimonavegador(String ultimonavegador) {
        this.ultimonavegador = ultimonavegador;
    }

    public String getUltimasesion() {
        return ultimasesion;
    }

    public void setUltimasesion(String ultimasesion) {
        this.ultimasesion = ultimasesion;
    }

    public boolean getAccesomultiple() {
        return accesomultiple;
    }

    public void setAccesomultiple(boolean accesomultiple) {
        this.accesomultiple = accesomultiple;
    }

    public String getCodigoreinicio() {
        return codigoreinicio;
    }

    public void setCodigoreinicio(String codigoreinicio) {
        this.codigoreinicio = codigoreinicio;
    }

    public Date getFechahorareinicio() {
        return fechahorareinicio;
    }

    public void setFechahorareinicio(Date fechahorareinicio) {
        this.fechahorareinicio = fechahorareinicio;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getTipocontribuyente() {
        return tipocontribuyente;
    }

    public void setTipocontribuyente(String tipocontribuyente) {
        this.tipocontribuyente = tipocontribuyente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Municipio getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Municipio idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    @XmlTransient
    public List<FrUsuLog> getFrUsuLogList() {
        return frUsuLogList;
    }

    public void setFrUsuLogList(List<FrUsuLog> frUsuLogList) {
        this.frUsuLogList = frUsuLogList;
    }

    @XmlTransient
    public List<FrUsuDatos> getFrUsuDatosList() {
        return frUsuDatosList;
    }

    public void setFrUsuDatosList(List<FrUsuDatos> frUsuDatosList) {
        this.frUsuDatosList = frUsuDatosList;
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
        if (!(object instanceof FrUsuUsuario)) {
            return false;
        }
        FrUsuUsuario other = (FrUsuUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.FrUsuUsuario[ id=" + id + " ]";
    }
    
}
