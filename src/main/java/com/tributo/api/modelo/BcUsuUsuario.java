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
@Table(name = "bc_usu_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BcUsuUsuario.findAll", query = "SELECT b FROM BcUsuUsuario b")
    , @NamedQuery(name = "BcUsuUsuario.findById", query = "SELECT b FROM BcUsuUsuario b WHERE b.id = :id")
    , @NamedQuery(name = "BcUsuUsuario.findByTipoidentificacion", query = "SELECT b FROM BcUsuUsuario b WHERE b.tipoidentificacion = :tipoidentificacion")
    , @NamedQuery(name = "BcUsuUsuario.findByIdentificacion", query = "SELECT b FROM BcUsuUsuario b WHERE b.identificacion = :identificacion")
    , @NamedQuery(name = "BcUsuUsuario.findByTipopersona", query = "SELECT b FROM BcUsuUsuario b WHERE b.tipopersona = :tipopersona")
    , @NamedQuery(name = "BcUsuUsuario.findByTipocontribuyente", query = "SELECT b FROM BcUsuUsuario b WHERE b.tipocontribuyente = :tipocontribuyente")
    , @NamedQuery(name = "BcUsuUsuario.findByPrimernombre", query = "SELECT b FROM BcUsuUsuario b WHERE b.primernombre = :primernombre")
    , @NamedQuery(name = "BcUsuUsuario.findBySegundonombre", query = "SELECT b FROM BcUsuUsuario b WHERE b.segundonombre = :segundonombre")
    , @NamedQuery(name = "BcUsuUsuario.findByPrimerapellido", query = "SELECT b FROM BcUsuUsuario b WHERE b.primerapellido = :primerapellido")
    , @NamedQuery(name = "BcUsuUsuario.findBySegundoapellido", query = "SELECT b FROM BcUsuUsuario b WHERE b.segundoapellido = :segundoapellido")
    , @NamedQuery(name = "BcUsuUsuario.findByRazonsocial", query = "SELECT b FROM BcUsuUsuario b WHERE b.razonsocial = :razonsocial")
    , @NamedQuery(name = "BcUsuUsuario.findBySexo", query = "SELECT b FROM BcUsuUsuario b WHERE b.sexo = :sexo")
    , @NamedQuery(name = "BcUsuUsuario.findByFechanacimiento", query = "SELECT b FROM BcUsuUsuario b WHERE b.fechanacimiento = :fechanacimiento")
    , @NamedQuery(name = "BcUsuUsuario.findByDireccion", query = "SELECT b FROM BcUsuUsuario b WHERE b.direccion = :direccion")
    , @NamedQuery(name = "BcUsuUsuario.findByTelefono", query = "SELECT b FROM BcUsuUsuario b WHERE b.telefono = :telefono")
    , @NamedQuery(name = "BcUsuUsuario.findByCelular", query = "SELECT b FROM BcUsuUsuario b WHERE b.celular = :celular")
    , @NamedQuery(name = "BcUsuUsuario.findByEmail", query = "SELECT b FROM BcUsuUsuario b WHERE b.email = :email")
    , @NamedQuery(name = "BcUsuUsuario.findByUsuario", query = "SELECT b FROM BcUsuUsuario b WHERE b.usuario = :usuario")
    , @NamedQuery(name = "BcUsuUsuario.findByClave", query = "SELECT b FROM BcUsuUsuario b WHERE b.clave = :clave")
    , @NamedQuery(name = "BcUsuUsuario.findByEstado", query = "SELECT b FROM BcUsuUsuario b WHERE b.estado = :estado")
    , @NamedQuery(name = "BcUsuUsuario.findByEsadministrador", query = "SELECT b FROM BcUsuUsuario b WHERE b.esadministrador = :esadministrador")
    , @NamedQuery(name = "BcUsuUsuario.findByNombrecompleto", query = "SELECT b FROM BcUsuUsuario b WHERE b.nombrecompleto = :nombrecompleto")
    , @NamedQuery(name = "BcUsuUsuario.findByUltimaconexion", query = "SELECT b FROM BcUsuUsuario b WHERE b.ultimaconexion = :ultimaconexion")
    , @NamedQuery(name = "BcUsuUsuario.findByUltimageoposicion", query = "SELECT b FROM BcUsuUsuario b WHERE b.ultimageoposicion = :ultimageoposicion")
    , @NamedQuery(name = "BcUsuUsuario.findByUltimaip", query = "SELECT b FROM BcUsuUsuario b WHERE b.ultimaip = :ultimaip")
    , @NamedQuery(name = "BcUsuUsuario.findByUltimoso", query = "SELECT b FROM BcUsuUsuario b WHERE b.ultimoso = :ultimoso")
    , @NamedQuery(name = "BcUsuUsuario.findByUltimonavegador", query = "SELECT b FROM BcUsuUsuario b WHERE b.ultimonavegador = :ultimonavegador")
    , @NamedQuery(name = "BcUsuUsuario.findByUltimasesion", query = "SELECT b FROM BcUsuUsuario b WHERE b.ultimasesion = :ultimasesion")
    , @NamedQuery(name = "BcUsuUsuario.findByAccesomultiple", query = "SELECT b FROM BcUsuUsuario b WHERE b.accesomultiple = :accesomultiple")
    , @NamedQuery(name = "BcUsuUsuario.findByCodigoreinicio", query = "SELECT b FROM BcUsuUsuario b WHERE b.codigoreinicio = :codigoreinicio")
    , @NamedQuery(name = "BcUsuUsuario.findByFechahorareinicio", query = "SELECT b FROM BcUsuUsuario b WHERE b.fechahorareinicio = :fechahorareinicio")
    , @NamedQuery(name = "BcUsuUsuario.findByFechacreacion", query = "SELECT b FROM BcUsuUsuario b WHERE b.fechacreacion = :fechacreacion")})
public class BcUsuUsuario implements Serializable {

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
    
    @Size(min = 1, max = 2)
    @Column(name = "tipopersona")
    private String tipopersona;
    @Basic(optional = false)
   
    @Size(min = 1, max = 2)
    @Column(name = "tipocontribuyente")
    private String tipocontribuyente;
    @Size(max = 100)
    @Column(name = "primernombre")
    private String primernombre;
    @Size(max = 100)
    @Column(name = "segundonombre")
    private String segundonombre;
    @Size(max = 100)
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
    @Size(max = 100)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 100)
    @Column(name = "clave")
    private String clave;
    @Size(max = 5)
    @Column(name = "estado")
    private String estado;
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
    @Size(max = 100)
    @Column(name = "ultimasesion")
    private String ultimasesion;
    @Basic(optional = false)

    @Column(name = "accesomultiple")
    private boolean accesomultiple;
    @Size(max = 50)
    @Column(name = "codigoreinicio")
    private String codigoreinicio;
    @Column(name = "fechahorareinicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechahorareinicio;
    @Basic(optional = false)

    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    
    @JoinColumn(name = "identidad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcEntEntidad identidad;
    
    @JoinColumn(name = "idperfil", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcUsuPerfiles idperfil;
    
    @JoinColumn(name = "idciudad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Municipio idciudad;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idusuario")
    private List<BcUsuLog> bcUsuLogList;

    public BcUsuUsuario() {
    }

    public BcUsuUsuario(Integer id) {
        this.id = id;
    }

    public BcUsuUsuario(Integer id, String tipoidentificacion, String identificacion, String tipopersona, String tipocontribuyente, Date fechanacimiento, String email, boolean esadministrador, String nombrecompleto, boolean accesomultiple, Date fechacreacion) {
        this.id = id;
        this.tipoidentificacion = tipoidentificacion;
        this.identificacion = identificacion;
        this.tipopersona = tipopersona;
        this.tipocontribuyente = tipocontribuyente;
        this.fechanacimiento = fechanacimiento;
        this.email = email;
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

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getTipocontribuyente() {
        return tipocontribuyente;
    }

    public void setTipocontribuyente(String tipocontribuyente) {
        this.tipocontribuyente = tipocontribuyente;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public BcEntEntidad getIdentidad() {
        return identidad;
    }

    public void setIdentidad(BcEntEntidad identidad) {
        this.identidad = identidad;
    }

    public BcUsuPerfiles getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(BcUsuPerfiles idperfil) {
        this.idperfil = idperfil;
    }

    public Municipio getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Municipio idciudad) {
        this.idciudad = idciudad;
    }

    @XmlTransient
    public List<BcUsuLog> getBcUsuLogList() {
        return bcUsuLogList;
    }

    public void setBcUsuLogList(List<BcUsuLog> bcUsuLogList) {
        this.bcUsuLogList = bcUsuLogList;
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
        if (!(object instanceof BcUsuUsuario)) {
            return false;
        }
        BcUsuUsuario other = (BcUsuUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.BcUsuUsuario[ id=" + id + " ]";
    }
    
}
