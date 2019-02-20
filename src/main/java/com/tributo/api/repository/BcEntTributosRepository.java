/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.repository;

import com.tributo.api.modelo.BcEntTributos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */
public interface BcEntTributosRepository extends JpaRepository<BcEntTributos,Integer>{
    
    
    //
    @Query( "SELECT b FROM BcEntTributos b WHERE b.identidad.id = :identidad and b.estado='A'")
    public List<BcEntTributos> finbBcEntTributosByIdEntidadActivas (@Param("identidad") Integer identidad);
    
    @Query( "SELECT b FROM BcEntTributos b WHERE b.identidad.id = :identidad ")
    public List<BcEntTributos> finbBcEntTributosByIdEntidad (@Param("identidad") Integer identidad);
    
    
    @Query( "SELECT b FROM BcEntTributos b WHERE b.id = :id ")
    public List<BcEntTributos> finbBcEntTributosById (@Param("id") Integer id);
    
    
    
}
