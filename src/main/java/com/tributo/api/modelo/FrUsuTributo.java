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
@Table(name = "fr_usu_tributo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FrUsuTributo.findAll", query = "SELECT f FROM FrUsuTributo f")
    , @NamedQuery(name = "FrUsuTributo.findById", query = "SELECT f FROM FrUsuTributo f WHERE f.id = :id")
    , @NamedQuery(name = "FrUsuTributo.findByIdusuario", query = "SELECT f FROM FrUsuTributo f WHERE f.idusuario = :idusuario")
    , @NamedQuery(name = "FrUsuTributo.findByFechacrea", query = "SELECT f FROM FrUsuTributo f WHERE f.fechacrea = :fechacrea")
    , @NamedQuery(name = "FrUsuTributo.findByEstado", query = "SELECT f FROM FrUsuTributo f WHERE f.estado = :estado")
    , @NamedQuery(name = "FrUsuTributo.findByFechaborrador", query = "SELECT f FROM FrUsuTributo f WHERE f.fechaborrador = :fechaborrador")
    , @NamedQuery(name = "FrUsuTributo.findByFechapresentacion", query = "SELECT f FROM FrUsuTributo f WHERE f.fechapresentacion = :fechapresentacion")
    , @NamedQuery(name = "FrUsuTributo.findByFechaliquidacion", query = "SELECT f FROM FrUsuTributo f WHERE f.fechaliquidacion = :fechaliquidacion")
    , @NamedQuery(name = "FrUsuTributo.findByFechapago", query = "SELECT f FROM FrUsuTributo f WHERE f.fechapago = :fechapago")
    , @NamedQuery(name = "FrUsuTributo.findByFechaanulado", query = "SELECT f FROM FrUsuTributo f WHERE f.fechaanulado = :fechaanulado")
    , @NamedQuery(name = "FrUsuTributo.findByValorapagar", query = "SELECT f FROM FrUsuTributo f WHERE f.valorapagar = :valorapagar")
    , @NamedQuery(name = "FrUsuTributo.findByTipoperiodo", query = "SELECT f FROM FrUsuTributo f WHERE f.tipoperiodo = :tipoperiodo")})
public class FrUsuTributo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacrea")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacrea;
    
         
    @JoinColumn(name = "identtributo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BcEntTributos identtributo;

    
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "esquema")
    private String esquema;
    @Lob
    @Size(max = 65535)
    @Column(name = "datos")
    private String datos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fechaborrador")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaborrador;
    @Column(name = "fechapresentacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapresentacion;
    @Column(name = "fechaliquidacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaliquidacion;
    @Column(name = "fechapago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapago;
    @Column(name = "fechaanulado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaanulado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorapagar")
    private float valorapagar;
    @Size(max = 4)
    @Column(name = "tipoperiodo")
    private String tipoperiodo;

    public FrUsuTributo() {
    }

    public FrUsuTributo(Integer id) {
        this.id = id;
    }

    public FrUsuTributo(Integer id, int idusuario, Date fechacrea, int idtributo, String esquema, String estado, float valorapagar) {
        this.id = id;
        this.idusuario = idusuario;
        this.fechacrea = fechacrea;
        this.esquema = esquema;
        this.estado = estado;
        this.valorapagar = valorapagar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechacrea() {
        return fechacrea;
    }

    public void setFechacrea(Date fechacrea) {
        this.fechacrea = fechacrea;
    }

    public BcEntTributos getIdenttributo() {
        return identtributo;
    }

    public void setIdenttributo(BcEntTributos identtributo) {
        this.identtributo = identtributo;
    }

    

       

    public String getEsquema() {
        return esquema;
    }

    public void setEsquema(String esquema) {
        this.esquema = esquema;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaborrador() {
        return fechaborrador;
    }

    public void setFechaborrador(Date fechaborrador) {
        this.fechaborrador = fechaborrador;
    }

    public Date getFechapresentacion() {
        return fechapresentacion;
    }

    public void setFechapresentacion(Date fechapresentacion) {
        this.fechapresentacion = fechapresentacion;
    }

    public Date getFechaliquidacion() {
        return fechaliquidacion;
    }

    public void setFechaliquidacion(Date fechaliquidacion) {
        this.fechaliquidacion = fechaliquidacion;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public Date getFechaanulado() {
        return fechaanulado;
    }

    public void setFechaanulado(Date fechaanulado) {
        this.fechaanulado = fechaanulado;
    }

    public float getValorapagar() {
        return valorapagar;
    }

    public void setValorapagar(float valorapagar) {
        this.valorapagar = valorapagar;
    }

    public String getTipoperiodo() {
        return tipoperiodo;
    }

    public void setTipoperiodo(String tipoperiodo) {
        this.tipoperiodo = tipoperiodo;
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
        if (!(object instanceof FrUsuTributo)) {
            return false;
        }
        FrUsuTributo other = (FrUsuTributo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.modelo.FrUsuTributo[ id=" + id + " ]";
    }
    
}
